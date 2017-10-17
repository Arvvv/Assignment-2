/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

/**
 *
 * @author debia7331
 */
public class A2Q7 {

    /**
     * @param args the command line arguments
     */
   public static boolean isPalindrome(String s, int length){
        // setting word length 
        if(length == 0 || length == 1){
            // returning 
            return true;
        }
        // last letter 
        String last = s.substring(s.length() - 1, s.length());
        // first letter 
        String first = s.substring(0,1);
        // determining is the first letter equals the last letter 
        if(first.equals(last)){
            // process commences again once the first and last letter are found to be equal 
            return isPalindrome(s.substring(1, length - 1), length - 2);
            
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        // testing A2Q7 using the method 
        A2Q7 test = new A2Q7();
        // input word which will be determined either true or false with reference to the method 
        System.out.println(test.isPalindrome("is", 3));
    }
    
}
