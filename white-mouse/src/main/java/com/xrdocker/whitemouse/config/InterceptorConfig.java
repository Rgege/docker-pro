package com.xrdocker.whitemouse.config;

import com.xrdocker.whitemouse.common.Interceptor.UrlInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer{

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new UrlInterceptor());
    }
}
