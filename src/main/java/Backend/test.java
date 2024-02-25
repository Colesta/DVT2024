/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import Backend.Validator;

/**
 *
 * @author colep
 */
public class test {
    public static void main(String[] args) {
//        String date1 = "3 February 1997";
//        String date2 = "01/02/2024";
//        if(Validator.ValidateDateFormat(date2)){
//            System.out.println("True");
//        }else{
//            System.out.println("False");
        
        //System.out.println(ValidateRange("ff", 1, 12));
        System.out.println(ValidateString("Cole"));
            
            
    }
    
     public static boolean ValidateRange(String input, int min, int max) {
    try {
        int var = Integer.parseInt(input);
        return var >= min && var <= max;
    } catch (NumberFormatException e) {
        return false; // Return false if input cannot be parsed as an integer
    }
}
     public static boolean ValidateString(String input) {
        boolean valid = true;
        int length = input.length();
        for (int i = 0; i < length; i++) {

            if (Character.isDigit(input.charAt(i))) {
                valid = false;
                break;

            }

        }

        return valid;
    }
    }
    
    
   

