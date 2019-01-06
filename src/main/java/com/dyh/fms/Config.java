package com.dyh.fms;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
@Configuration
public class Config extends WebMvcConfigurationSupport {
    @Override
   public void addResourceHandlers(ResourceHandlerRegistry registry){
        //这里将/static文件夹定为资源目录，需要根据实际更换
        registry.addResourceHandler("/**")
                      .addResourceLocations("classpath:/static/");
    }

     @Override
    public void addViewControllers(ViewControllerRegistry registry) {
          registry.addViewController("/").setViewName("forward:/index.html");
    }
}
