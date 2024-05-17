package project.linkerfs.linkerfswarpgen4j.config;


import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StaticFilterConfig {

    @Bean
    public FilterRegistrationBean<WebUIFilter> webUIFilterRegistrationBean() {
        FilterRegistrationBean<WebUIFilter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new WebUIFilter());
        registration.addUrlPatterns("/webui/*");
        registration.setName("WebUIFilter");
        registration.setOrder(1);
        return registration;
        ///{path:^(?!api$)(?!doc$)\S*}/**
    }
}