/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikun
 */
import java.util.Scanner;
public class RegExDemo {
    

    //^\d{3}-\d{2}-\d{4}$
    
    static boolean validSSN(String SSN){
        if(SSN.matches("^\\d{3}-\\d{2}-\\d{4}$")){
            return true;
        }
        else{
            return false;
        }
    }
    
    static String getNumbers(){
        //get 9 digits for SSn
        //if not digits OR not exactly 9 digits repeat
        
        Scanner key = new Scanner(System.in);
        
        String theInput = "";
        
        do{
            System.out.println("Enter 9 digits");
            theInput = key.nextLine();
            
        }while(theInput.length() !=9 || !theInput.matches("^[+]?\\d*$"));
        
        return theInput;
    }
    
    public static void main(String[] args) {
        
        String  someSSN = "111-22-3333";
        
        someSSN = getNumbers();
        String fixedSSN = someSSN.substring(0,3) + "-" + someSSN.substring(3,5)
                + "-" + someSSN.substring(5,9);
        System.out.println(fixedSSN);
        
        if(validSSN(fixedSSN)){
            System.out.println("Valid SSN - do something in code");
        }
        else{
            System.out.println("Invalid SSN - send the FBI");
        }
        
    }
    
}
