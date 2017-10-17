/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

/**
 *
 * @author debia7331
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public int digitalSum(int n){
        // the value of n will be returned when the digit is 1
        if(10 > n){
            // returning n
            return n;
            
        }else {
            //  integer  a
            int a = n % 10;
            // integer b 
            int b = n / 10;
            
            return digitalSum(b) + a;
        }
    }
    public static void main(String[] args) {
        // testing A2Q1 using the method 
        A2Q1 test = new A2Q1();
        // formulating the answer from the inputted digit 
        int answer = test.digitalSum(3211);
        // outputting the answer 
        System.out.println(answer);
    }
    
}
   
