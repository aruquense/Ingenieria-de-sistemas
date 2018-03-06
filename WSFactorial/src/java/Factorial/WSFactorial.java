/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorial;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author aru
 */
@WebService(serviceName = "WSFactorial")
public class WSFactorial {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    @WebMethod(operationName = "factorial")
    public double factorial(@WebParam(name = "factorial") double numero) {
        if (numero==0)
    return 1;
  else
    return numero * factorial(numero-1);
    }
}
