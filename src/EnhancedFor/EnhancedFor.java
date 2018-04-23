/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnhancedFor;

import java.util.*;

/**
 *
 * @author PietroS
 */
public class EnhancedFor {

    public static void main(String... args) {
        
        long i = 12343243245325L;
        int t;
        
        
        System.out.print(args[0]);
//        System.out.print(i instanceof Long);
        List<String> values = new ArrayList<>();
        values.add("Lisa");
        values.add("Kevin");
        values.add("Roger");
        for (String value : values) {
            System.out.print(value + ", ");
        }
        List<Float> valuesi = new ArrayList<>();
        valuesi.add(1.0F);
//        valuesi.add(2.0);
//        valuesi.add(3.0);
        for (float value : valuesi) {
            System.out.print(value + ", ");
        }
    }
    
    public void testi (int i, int b[], int[] d, int... c) {
        int s =0 ;
    System.out.print(i + s);
        
    }
    
}
