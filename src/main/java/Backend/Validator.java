/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

/**
 *
 * @author colep
 */
public class Validator {
   
    
    public static boolean ValidateRange(int var, int min, int max){
        boolean validation = false;
        if(var <=12 && var >= 1){
            validation = true;
        }
        return validation;
    }
    
     
    
    
    
    public static boolean ValidateDateFormat(String dateStr){
        
        Boolean validation;
      
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      
      try{
          LocalDate date = LocalDate.parse(dateStr, dtf);
          validation = true;
      }catch(DateTimeParseException e){
        validation = false;
      }
    return validation;
    }
    
    public static boolean ValidateTimeFormat(){
        
        
        return true;
    }
    
    public static boolean ValidateLogic(){
        
        return true;
    }
    
}
