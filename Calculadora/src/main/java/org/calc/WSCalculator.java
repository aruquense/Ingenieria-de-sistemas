/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.calc;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author aru
 */
@WebService(serviceName = "WSCalculator")
@Stateless()
public class WSCalculator {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "suma")
    public float suma(@WebParam(name = "num1") float num1, @WebParam(name = "num2") float num2) {
        //TODO write your implementation code here:
        return num1+num2;
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "resta")
    public float resta(@WebParam(name = "num1") float num1, @WebParam(name = "num2") float num2) {
        //TODO write your implementation code here:
        return num1-num2;
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "mult")
    public float mult(@WebParam(name = "num1") float num1, @WebParam(name = "num2") float num2) {
        //TODO write your implementation code here:
        return num1*num2;
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "div")
    public float div(@WebParam(name = "num1") float num1, @WebParam(name = "num2") float num2) {
        //TODO write your implementation code here:
        return num1/num2;
    }
}
