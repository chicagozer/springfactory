package com.rheosoft.factory;

import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class FactoryApplication {

    @Bean(name = {"ServiceFactory"})
    public ServiceLocatorFactoryBean createServiceLocatorFactoryBean() {
        ServiceLocatorFactoryBean bean = new ServiceLocatorFactoryBean();
        bean.setServiceLocatorInterface(ServiceFactory.class);
        return bean;
    }

    public static void main(String[] args) {
        SpringApplication.run(FactoryApplication.class, args);
    }
}
