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
public class Question1 {

}

//A local variable is a variable defi ned within a method. Local variables must be initialized
//before use. They do not have a default value and contain garbage data until initialized. The
//compiler will not let you read an uninitialized value. For example, the following code

//What is the result of the following class? (Choose all that apply)
//1: public class _C {
//2: private static int $;
//3: public static void main(String[] main) {
//4: String a_b;
//5: System.out.print($);
//6: System.out.print(a_b);
//7: } }
//A. Compiler error on line 1.
//B. Compiler error on line 2.
//C. Compiler error on line 4.
//D. Compiler error on line 5.
//E. Compiler error on line 6.
//F. 0null
//G. nullnull

//1. E. Option E is correct because local variables require assignment before referencing
//them. Option D is incorrect because class and instance variables have default values
//and allow referencing. a_b defaults to a null value. Options A, B, and C are incorrect
//because identifiers may begin with a letter, underscore, or dollar sign. Options F and
//G are incorrect because the code does not compile. If a_b was an instance variable, the
//code would compile and output 0null. For more information, see Chapter 1.

class _C {

    private static int $;

    public static void main(String[] main) {
//        String a_b;
        String a_b = "";
        System.out.print($);
        System.out.print(a_b);
    }
}
