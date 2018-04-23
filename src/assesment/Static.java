/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assesment;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PietroS
 */
public class Static {

    private static String name = "Static class";
    private static final ArrayList<String> values = new ArrayList<>();
    public static void first() {
    }

    public static void second() {
    }

    public static void third() {
        System.out.println(name);
    }

    public void fourth() {
        System.out.println(name);
    }
        
    public static void main(String args[]) {
        first();
        second();
        third(); // DOES NOT COMPILE
        new Static().fourth();
        Static se = new Static();
        se.fourth();
        
        values.add("test");
        values.add("test2");        
        
        for (String item : values) {
            System.out.println(item);
        }
    }
}
