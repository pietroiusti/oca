/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// 5. What is the output of the following code snippet?
//13: System.out.print("a");
//14: try {
//15: System.out.print("b");
//16: throw new IllegalArgumentException();
//17: } catch (RuntimeException e) {
//18: System.out.print("c");
//19: } finally {
//20: System.out.print("d");
//21: }
//22: System.out.print("e");
//A. abe
//B. abce
//C. abde
//D. abcde
//E. The code does not compile.
//F. An uncaught exception is thrown.
//5. D. The code starts running and prints a and b on lines 13 and 15. Line 16 throws an
//exception, which is caught on line 17. After line 18 prints c, the finally block is run
package assesment;

/**
 *
 * @author PietroS
 */
public class Question5 {

    public static void main(String[] args) {
        System.out.print(
                "a");
        try {
            System.out.print("b");
            throw new IllegalArgumentException();
        } catch (RuntimeException e) {
            System.out.print("c");
        } finally {
            System.out.print("d");
        }

        System.out.print(
                "e");
    }
}
