package com.irs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableAutoConfiguration


public class Application extends SpringBootServletInitializer {

	/*
	 * @Bean WebMvcConfigurer configurer () { return new WebMvcConfigurerAdapter() {
	 * 
	 * @Override public void addResourceHandlers (ResourceHandlerRegistry registry)
	 * { registry.addResourceHandler("/ui/").
	 * addResourceLocations("classpath:/resources/static/index.html"); } }; }
	 */
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
