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
public class StringBuilder2 {

    public static void main(String[] main) {
        String alpha = "";
        for (char current = 'a'; current <= 'z'; current++) {
            alpha += current;
        }
        System.out.println(alpha);

        StringBuilder alpha2 = new StringBuilder();
        for (char current = 'a'; current <= 'z'; current++) {
            alpha2.append(current);
        }
        System.out.println(alpha2);

        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle"); // sb = "start+middle"
//Line 5 adds text to the end of sb. It also returns a reference to sb, which is ignored. Line
//6 also adds text to the end of sb and returns a reference to sb. This time the reference is
//stored in same—which means sb and same point to the exact same object and would print
//out the same value.  
        StringBuilder same = sb.append("+end"); // "start+middle+end"   StringBuilder changes its own state and returns a reference to itself! 
        System.out.println(sb);
        System.out.println(same);

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = new StringBuilder(a.append("de"));
//        StringBuilder b = a.append("de");
//new StringBuilder() was called only once.there
//are two variables referring to that object, which has a value of "abcde".
        b = b.append("f").append("g");
        System.out.println("a=" + a);
        System.out.println("b=" + b); 
        
        String sa = new String("abc");
        String sbb = sa.concat("de");
        sbb = sbb.concat("f").concat("g");
        System.out.println("a=" + sa);
        System.out.println("b=" + sbb);         
        
    }
}
