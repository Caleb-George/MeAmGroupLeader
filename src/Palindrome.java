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

public class Palindrome {
    
    private static String phrase, fixedPhrase;
    private static Scanner keyboard = new Scanner(System.in);

    public static void fixThePhrase(){
        //remove space, punctuation
        //lowercase the string
        fixedPhrase = phrase.toLowerCase().replaceAll("", "").replace("'","")
                .replace("\\.", "");
        /*
        fixedPhrase = phrase.toLowerCase();
        fixedPhrase = fixedPhrase.replaceAll("","");
        */
    }
    
    public static void checkPalindrome(){
        //reverse the string
        //check to see if they are the same
        String revPhrase = "";
        for(int c=fixedPhrase.length() - 1; c >= 0; c--){
            revPhrase += phrase.charAt(c);
        }
        //string is reverse
        if(phrase.equals(revPhrase)){
            System.out.println(phrase + "is a palindrome");
        }
        else{
            System.out.println(phrase + " is NOT a palindrome");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Enter a phrase");
        
        phrase = keyboard.nextLine();
    }
    
}
