/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OcaReviewQuestions;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import static java.util.Arrays.*;
//import static java.util.Arrays.sort;

/**
 *
 * @author PietroS
 */
public class StringbuilderTest {

    private static int COUNTER;
    private String string;
    
    public static int yy = 10 / 5;
    public static void main(String[] args) {

        StringBuilder s1 = new StringBuilder("Java");
        String s2 = "Love";
        s1.append(s2);
//        s1 = new StringBuilder(s1.substring(4));
        int foundAt = s1.indexOf(s2);
        System.out.println(s1.toString());
        System.out.println(s2);
        System.out.println(foundAt);
        char [] charArray = {'a', 'z', 'y', 'b','c'};
        Arrays.sort(charArray);
        System.out.println(charArray);
                System.out.println(Arrays.binarySearch(charArray, 'c'));
                System.out.println(Arrays.binarySearch(charArray, 'z'));
//        List<String> hex = Arrays.asList("30", "8", "3A", "FF", "33B", "33F", "3C");
//
//        int x = Collections.binarySearch(hex, "8");
//        int y = Collections.binarySearch(hex, "3A");
//        int z = Collections.binarySearch(hex, "4F");
//        System.out.println(x + " " + y + " " + z);
//        System.out.println(hex.toString());
//
//        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
//        LocalDateTime date = LocalDateTime.parse("2015-03-22T11:42", f);
//        LocalTime time = LocalTime.parse("11:22");
//        System.out.println(date); // 2015-01-02
//        System.out.println(time); // 11:22
//
//        int xx = 0;
//        while (++xx < 5) {
//            xx += 1;
//            System.out.println(xx);
//        }
//        String message = xx > 5 ? "Greater than" : "Less Than";
//        System.out.println(message + "," + xx);
//        System.out.println(yy);        
    }
    
    public static void walk(int[] start, int... nums) {
        System.out.println(nums.length);
    }
}
