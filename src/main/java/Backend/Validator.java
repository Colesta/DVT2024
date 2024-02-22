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
   
    
    public boolean ValidateGradeRange(int grade){
        
        boolean validation = false;
        
        if(grade <=12 && grade >= 1){
            
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
    
    public boolean ValidateTimeFormat(){
        
        
        return true;
    }
    
    public boolean ValidateLogic(){
        
        return true;
    }
    
}
