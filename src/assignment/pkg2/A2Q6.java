/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

/**
 *
 * @author debia7331
 */
public class A2Q6 {

    /**
     * @param args the command line arguments
     */
   private static String letters[] = new String[]{"A","B","C","D","E","F"};
    
    public static String convert(int n, int b){
        // quotient 
        int s = n / b;
        // remainder 
        int a = n % b;
        // transforming any values with a remainder of 10+ to letter 
        if( a >= 10){
            return convert(s,b) + letters[a - 10];
          
        }// values of 15+ will be a number 
        else if(a > 15){
            return Integer.toString(n);
        }
        if(s == 0){
            return Integer.toString(a);
        }else {
            return convert(a,b) + Integer.toString(a);
        }
        
    }
    public static void main(String[] args) {
        // testing using method
        A2Q6 test = new A2Q6();
        System.out.println(convert(1000,8));
    }
    
}
