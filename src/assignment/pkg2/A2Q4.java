/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

/**
 *
 * @author debia7331
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
  public void hailstone(int n) {
        
        System.out.println(n);
        // returning the value of n as one 
        if (n == 1) {

        }
        // multiply by 3 and add 1 when n is odd
        else if (n % 2 == 1) {
            // multiplying by 3 and adding one 
            hailstone(3 * n + 1);
            
            // divide n by 2 once it is even 
        } else if (n % 2 == 0) {
            // dividing by 2
            hailstone(n / 2);
        }
    }

    public static void main(String[] args) {
        // testing A2Q4
        A2Q4 test = new A2Q4();
        // method being tested
        test.hailstone(5);
    }

}
