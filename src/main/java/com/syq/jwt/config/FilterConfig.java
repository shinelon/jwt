package com.syq.jwt.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
	@Bean  
    public FilterRegistrationBean  filterRegistrationBean() {  
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();  
        AuthenticationFilter authenticationFilter = new AuthenticationFilter();  
        registrationBean.setFilter(authenticationFilter); 
//        registrationBean.setOrder(1);
        List<String> urlPatterns = new ArrayList<String>();  
        urlPatterns.add("/*");  
        registrationBean.setUrlPatterns(urlPatterns);  
        return registrationBean;  
    }  
}
