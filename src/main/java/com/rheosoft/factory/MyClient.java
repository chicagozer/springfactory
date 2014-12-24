/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rheosoft.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author jim
 */
@Component
public class MyClient {
    
    @Autowired
    @Qualifier("ServiceFactory")
    private ServiceFactory myServiceFactory;
    
    public void someBusinessMethod() {
        // get a 'fresh', brand new MyService instance
        MyService service = this.myServiceFactory.getService("ServiceA");
        service.doit();
        // use the service object to effect the business logic...
    }

    public void anotherBusinessMethod() {
        // get a 'fresh', brand new MyService instance
        MyService service = this.myServiceFactory.getService("ServiceB");
        service.doit();
        // use the service object to effect the business logic...
    }
}
