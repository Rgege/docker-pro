package com.xrdocker.whitemouse.common.Interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Configuration
public class UrlInterceptor extends HandlerInterceptorAdapter {
    private static final Logger LOGGER= LoggerFactory.getLogger(UrlInterceptor.class);
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        StringBuffer url=request.getRequestURL();
        LOGGER.debug("===========================================================this url:"+url);

        if (url.indexOf("/wmiuc/")!=-1) {
            return true;
        }else {
            // 跳转登录-------controller类中的登陆方法
            String tourl = "https://www.baidu.com/s?wd=杀人";
            response.sendRedirect(tourl);
            return false;
        }
    }
}
