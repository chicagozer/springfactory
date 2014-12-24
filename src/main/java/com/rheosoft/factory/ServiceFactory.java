/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rheosoft.factory;

/**
 *
 * @author jim
 */
public interface ServiceFactory {
    public MyService getService (String serviceName);
}

