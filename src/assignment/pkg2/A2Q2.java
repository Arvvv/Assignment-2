/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

/**
 *
 * @author debia7331
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
     public int digitalRoot(int n){
        // inputted digit is returned as n 
        if(10 > n){
            // returning n due to inputted digit 
            return n;
        }else{
            // right digit (to furthest right)
            int q = n % 10;
            // remaining left 
            int e = n / 10;
            
            return digitalRoot(e + q);
        }
    }
    public static void main(String[] args) {
        // testing A2Q2
        A2Q2 test = new A2Q2();
        // formulating integer using the choosen method 
        int lol = test.digitalRoot(2017);
        // outputting the answer 
        System.out.println(lol);
        
    }
    
}
   