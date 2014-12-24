/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rheosoft.factory;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author jim
 */
@Component(value="ServiceA")
@Scope("prototype")
public class ServiceA implements MyService {

    @Override
    public void doit() {
        System.out.println("ServiceA says hello.");
    }
    
}
