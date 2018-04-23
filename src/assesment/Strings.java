/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assesment;

/**
 *
 * @author PietroS
 */
public class Strings {

    public static void main(String[] main) {
        String s1 = "1";
        String s2 = s1.concat("2");
        s2 = s2.concat("3");
        s2 = s2.concat("3");
        System.out.println(s2);

        String string = "animals";
        System.out.println(string.substring(3)); // mals
        System.out.println(string.substring(string.indexOf('m'))); // mals
        System.out.println(string.substring(3, 4)); // m
        System.out.println(string.substring(3, 7)); // mals
        System.out.println(string.substring(3, 3)); // empty string
//        System.out.println(string.substring(3, 2)); // throws exception java.lang.StringIndexOutOfBoundsException: String index out of range: -1
//        System.out.println(string.substring(3, 8)); // throws exception java.lang.StringIndexOutOfBoundsException: String index out of range: 8

        System.out.println("abc".equals("ABC")); // false
        System.out.println("ABC".equals("ABC")); // true
        System.out.println("abc".equalsIgnoreCase("ABC")); // true

        System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("A")); // false
        System.out.println("abc".endsWith("c")); // true
        System.out.println("abc".endsWith("a")); // false

        System.out.println("abc".contains("b")); // true
        System.out.println("abc".contains("B")); // false

        System.out.println("abcabc".replace('a', 'A')); // AbcAbc
        System.out.println("abcabc".replace("ab", "A")); // AbcAbc

        System.out.println("\t a b c\n".trim()); // a b c

        String result = "AniMaL ".trim().toLowerCase().replace('a', 'A');
        System.out.println(result);
        
        String a = "abc";
        
        String b = a.toUpperCase();
        
        b = b.replace("B", "2").replace('C', '3');
        
        System.out.println("a=" + a);
        
        System.out.println("b=" + b);
    }

}
