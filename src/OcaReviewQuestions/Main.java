/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OcaReviewQuestions;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author pietros
 */
public class Main {

     static public void  main(String[] args) throws Exception{
            LocalDateTime d = LocalDateTime.of(2015, 5, 28, 11, 22);
            
            DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:MM");
            System.out.print(df.format(d));
            LocalTime t = LocalTime.parse("08:01");
            System.out.print(t);
            
            
//        StringbuilderTest.main(args);

    }
    

}
