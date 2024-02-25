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

    public static boolean ValidateRange(String input, int min, int max) {
        try {
            int var = Integer.parseInt(input);
            return var >= min && var <= max;
        } catch (NumberFormatException e) {
            return false; // Return false if input cannot be parsed as an integer
        }
    }

    public static boolean ValidateDateFormat(String dateStr) {

        boolean validation;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            LocalDate date = LocalDate.parse(dateStr, dtf);
            validation = true;
        } catch (DateTimeParseException e) {
            validation = false;
        }
        return validation;
    }

    public static boolean ValidateTimeFormat() {

        return true;
    }

    public static boolean ValidateLogic(String dateStr) {

        boolean validation = false;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dateStr, dtf);

        if (date.getYear() >= 2024) {
            validation = true;
        }

        return validation;
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
