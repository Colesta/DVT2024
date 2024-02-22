/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import Backend.Validator;

/**
 *
 * @author colep
 */
public class Test {
    public static void main(String[] args) {
        String date1 = "3 February 1997";
        String date2 = "01/02/2024";
        if(Validator.ValidateDateFormat(date1)){
            System.out.println("True");
        }else{
            System.out.println("False");
        
    }
    }
}
