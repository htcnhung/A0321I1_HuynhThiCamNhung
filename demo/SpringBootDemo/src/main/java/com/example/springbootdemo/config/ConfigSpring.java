package com.example.springbootdemo.config;

import com.example.springbootdemo.formatter.DateConverter;
import com.example.springbootdemo.formatter.DateFomatter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ConfigSpring implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {
//        registry.addFormatter(new DateFomatter());
//        registry.addConverter(new DateConverter());
    }
}
