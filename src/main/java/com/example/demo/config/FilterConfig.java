package com.example.demo.config;

import com.example.demo.filter.XSSFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class FilterConfig implements WebMvcConfigurer {

    private static final String[] INCLUDE_PATHS = {
            "/test/*"
    };

    @Bean
    public FilterRegistrationBean filterBean() {

        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new XSSFilter());
        registrationBean.setOrder(Integer.MIN_VALUE); //필터 여러개 적용 시 순번
        registrationBean.addUrlPatterns("/test/*"); //특정 URL 포함
//        registrationBean.addUrlPatterns("/*"); //전체 URL 포함
//        registrationBean.setUrlPatterns(Arrays.asList(INCLUDE_PATHS)); //여러 특정 URL 포함\
//        registrationBean.setUrlPatterns(Arrays.asList("/sample"));

        return registrationBean;
    }
}
