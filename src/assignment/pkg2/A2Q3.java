/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

/**
 *
 * @author debia7331
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
     public int triangle(int n){
        
        // returning the inputted final value 
        if (n == 0){
            // returning inputted value as n 
            return n;
        }
        return triangle(n - 1) + n;
    }
    public static void main(String[] args) {
        // testing A2Q3
        A2Q3 test = new A2Q3();
        // formulatting the intended digit using the method 
        int answer = test.triangle(67);
        // outputting formulatted answer to the user 
        System.out.println(" triangle " + ( answer));
    }
    
}
   
