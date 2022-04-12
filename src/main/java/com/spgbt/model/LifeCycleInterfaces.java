package com.spgbt.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleInterfaces implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Accessing bean by InitializingBean interface after IOC container instantiate it.");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("Accessing bean by DisposableBean interface before IOC container destroy it.");
    }
}
