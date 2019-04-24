package com.xrdocker.whitemouse.common.Interceptor;

import com.xrdocker.whitemouse.util.NetworkUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UrlInterceptor extends HandlerInterceptorAdapter {
    private static final Logger LOGGER= LoggerFactory.getLogger(UrlInterceptor.class);
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        StringBuffer url=request.getRequestURL();
        String ip=NetworkUtil.getClientIpAddr(request);
        LOGGER.debug("===========================================================this reqIp:"+ NetworkUtil.getClientIpAddr(request));
        LOGGER.debug("===========================================================this url:"+url);

        if (url.indexOf("/wmiuc/")!=-1) {
            return true;
        }else {
            // 跳转登录-------controller类中的登陆方法
            String tourl = "https://www.baidu.com/s?wd=ip";
            response.sendRedirect(tourl);
            return false;
        }
    }
}
