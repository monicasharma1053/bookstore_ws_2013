
package com.auth.client;

import javax.jws.WebService;

import org.apache.*;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.bean.Book;
import com.bookservices.*;

@WebService(targetNamespace = "http://client.auth.company.com/", portName = "ClientPort", serviceName = "ClientService", endpointInterface = "com.company.auth.client.client_sei")
public final class Client{

    private Client() {
    } 

    public static void main(String args[]) throws Exception {

    	JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

    	factory.setBindingId("http://cxf.apache.org/bindings/xformat");
    	factory.getInInterceptors().add(new LoggingInInterceptor());
    	factory.getOutInterceptors().add(new LoggingOutInterceptor());
    	factory.setServiceClass(AuthService.class);
    	factory.setAddress("http://localhost:7001/authManager/services/cxfAuth");
    	AuthService client = (AuthService) factory.create();

    	Book book = client.getAuthor("10531053");
    	System.out.println("Server said: " + book.getAuthor() + ", " + book.getTitle());
    
    	System.exit(0);

    }

}