package com.spgbt;

import com.spgbt.model.LifeCycleAnnotations;
import com.spgbt.model.LifeCycleInterfaces;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleConfig {

    @Bean
    public LifeCycleInterfaces getLifeCycleInterfaces(){
        return new LifeCycleInterfaces();
    }

    @Bean
    public LifeCycleAnnotations getLifeCycleAnnotations(){
        return new LifeCycleAnnotations();
    }
}
