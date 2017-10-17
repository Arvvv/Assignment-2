/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

/**
 *
 * @author debia7331
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
   public void binaryConvert(int n){
        // the value of n will represent 1 as a binary number
        if(n == 1){
            //  value of n printed (outputted)  
            System.out.println(n);
            
        }
        else {
            // once divided by two, if there is no remainder, output zero 
            if(n%2==0){
                binaryConvert(n/2);
                System.out.print(0);
            } else{
                // once divided by two, if there is a remainder, output one 
                if(n % 2 == 1){
                    binaryConvert(n/2);
                    System.out.println(1);
                }
            }
        }
    }
    public static void main(String[] args) {
        // testing A2Q5 using the method 
        A2Q5 test = new A2Q5();
        // running the method
        test.binaryConvert(456);
    }
    
}
