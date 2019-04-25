package com.xrdocker.whitemouse.common.Interceptor;

import com.xrdocker.whitemouse.persistent.UrlMapper;
import com.xrdocker.whitemouse.persistent.entity.UrlDTO;
import com.xrdocker.whitemouse.util.NetworkUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.Timestamp;
import java.util.Date;


public class UrlInterceptor extends HandlerInterceptorAdapter {
    private static final Logger LOGGER = LoggerFactory.getLogger(UrlInterceptor.class);
    @Autowired
    private UrlMapper mapper;
    @Value("${sendFile}")
    private String sendFile;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        UrlDTO dto = new UrlDTO();
        StringBuffer url = request.getRequestURL();
        String ip = NetworkUtil.getClientIpAddr(request);
        LOGGER.debug("===========================================================this reqIp:" + NetworkUtil.getClientIpAddr(request));
        LOGGER.debug("===========================================================this url:" + url);
        dto.setReqIp(ip);
        dto.setReqUrl(url.toString());
        dto.setReqTime(new Timestamp(new Date().getTime()));
        if (url.indexOf("/fkSrpsl/") != -1 && ipSafe(ip)) {
            dto.setStatus(0);
            mapper.insert(dto);
            return true;
        } else {
            dto.setStatus(1);
            // 跳转登录-------controller类中的登陆方法
//            String tourl = "http://www.zyjljd.gov.cn/admin/login";
//            response.sendRedirect(tourl);
            send(response);
            mapper.insert(dto);
            return false;
        }
    }

    private boolean ipSafe(String ip) {
        if (ip == null || (ip.indexOf("211.149.") != -1 && !ip.equals("211.149.142.55"))) {
            return false;
        } else return true;
    }

    private void send(HttpServletResponse response) {
        File file = new File(sendFile);
        response.setContentType("application/force-download");// 设置强制下载不打开
        response.addHeader("Content-Disposition", "attachment;fileName=" + "1024.sh");// 设置文件名
        byte[] buffer = new byte[1024];

        try (
                FileInputStream fis = new FileInputStream(file);
                BufferedInputStream bis = new BufferedInputStream(fis);
        ) {

            OutputStream os = response.getOutputStream();
            int i = bis.read(buffer);
            while (i != -1) {
                os.write(buffer, 0, i);
                i = bis.read(buffer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
