package com.spgbt.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCycleAnnotations {

    @PostConstruct
    public void init(){
        System.out.println("Accessing bean by @PostConstruct annotation after IOC container instantiate it.");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroying bean by @PreDestroy annotation before IOC container destroy it.");
    }
}
