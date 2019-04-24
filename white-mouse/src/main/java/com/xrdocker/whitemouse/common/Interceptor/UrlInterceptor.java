package com.xrdocker.whitemouse.common.Interceptor;

import com.xrdocker.whitemouse.persistent.UrlMapper;
import com.xrdocker.whitemouse.persistent.entity.UrlDTO;
import com.xrdocker.whitemouse.util.NetworkUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Timestamp;
import java.util.Date;


public class UrlInterceptor extends HandlerInterceptorAdapter {
    private static final Logger LOGGER= LoggerFactory.getLogger(UrlInterceptor.class);
    @Autowired
    private UrlMapper mapper;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        UrlDTO dto=new UrlDTO();
        StringBuffer url=request.getRequestURL();
        String ip=NetworkUtil.getClientIpAddr(request);
        LOGGER.debug("===========================================================this reqIp:"+ NetworkUtil.getClientIpAddr(request));
        LOGGER.debug("===========================================================this url:"+url);
        dto.setReqIp(ip);
        dto.setReqUrl(url.toString());
        dto.setReqTime(new Timestamp(new Date().getTime()));
        if (url.indexOf("/wmiuc/")!=-1) {
            dto.setStatus(0);
            mapper.insert(dto);
            return true;
        }else {
            dto.setStatus(1);
            // 跳转登录-------controller类中的登陆方法
            String tourl = "https://www.baidu.com/s?wd=ip";
            response.sendRedirect(tourl);
            mapper.insert(dto);
            return false;
        }
    }
}
