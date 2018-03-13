/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientwscalculator;

/**
 *
 * @author aru
 */
public class ClientWSCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(div(2,23));
        System.out.println(suma(2,23));
        System.out.println(resta(2,32));
        System.out.println(mult(2,32));
        System.out.println(hello("Alfredo"));
        
        
    }

    private static float div(float num1, float num2) {
        org.calc.WSCalculator_Service service = new org.calc.WSCalculator_Service();
        org.calc.WSCalculator port = service.getWSCalculatorPort();
        return port.div(num1, num2);
    }

    private static String hello(java.lang.String name) {
        org.calc.WSCalculator_Service service = new org.calc.WSCalculator_Service();
        org.calc.WSCalculator port = service.getWSCalculatorPort();
        return port.hello(name);
    }

    private static float mult(float num1, float num2) {
        org.calc.WSCalculator_Service service = new org.calc.WSCalculator_Service();
        org.calc.WSCalculator port = service.getWSCalculatorPort();
        return port.mult(num1, num2);
    }

    private static float resta(float num1, float num2) {
        org.calc.WSCalculator_Service service = new org.calc.WSCalculator_Service();
        org.calc.WSCalculator port = service.getWSCalculatorPort();
        return port.resta(num1, num2);
    }

    private static float suma(float num1, float num2) {
        org.calc.WSCalculator_Service service = new org.calc.WSCalculator_Service();
        org.calc.WSCalculator port = service.getWSCalculatorPort();
        return port.suma(num1, num2);
    }

    private static float div_1(float num1, float num2) {
        org.calc.WSCalculator_Service service = new org.calc.WSCalculator_Service();
        org.calc.WSCalculator port = service.getWSCalculatorPort();
        return port.div(num1, num2);
    }
    
}
