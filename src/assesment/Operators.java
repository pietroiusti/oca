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
//Numeric Promotion Rules
//1. If two values have different data types, Java will automatically promote one of the values
//to the larger of the two data types.
//2. If one of the values is integral and the other is floating-point, Java will automatically
//promote the integral value to the floating-point value’s data type.
//
//3. Smaller data types, namely byte, short, and char, are first promoted to int any time
//they’re used with a Java binary arithmetic operator, even if neither of the operands is
//int.
//4. After all promotion has occurred and the operands have the same
public class Operators {

    public static void main(String[] args) {
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);
        long z = 5;
        long q = (z = 3);
        System.out.println(z); // Outputs 3
        System.out.println(q); // Also, outputs 3

        long a = 10;
        int b = 5;
        a *= b;
        b *= a;
        a = a * b;
//b = b * a; Compiler error

//a instanceof b True if the reference that a points to is an instance of
//a class, subclass, or class that implements a particular
//interface, as named in b
        x = 6;
        boolean c = (x >= 6) || (++x <= 7);
        System.out.println(x);

        Integer s = null;

        if (s != null && s.intValue() < 5) {
// Do something
        }

        
//        Equality Operators
//1. Comparing two numeric primitive types. If the numeric values are of different data
//types, the values are automatically promoted as previously described. For example,
//5 == 5.00 returns true since the left side is promoted to a double.
//2. Comparing two boolean values.
//3. Comparing two objects, including null and String values.

boolean e = false;
boolean f = (e = true);
System.out.println(f); // Outputs true
  f = (false == true);
System.out.println(f); // Outputs true

int animal = (90 < 91) ? 9 : 1;
//int animal2 = (90 < 91) ? 9 : "";

//Data types supported by switch statements include the following:
//■ int and Integer
//■ byte and Byte
//■ short and Short
//■ char and Character
//■ int and Integer
//■ String
//■ enum values
//For the exam, we recommend you memorize this list. Note that boolean and long, and
//their associated wrapper classes, are not supported by switch statements.
   
int dayOfWeek = 6;
switch(dayOfWeek) {
case 0:
System.out.println("Sunday");
default:
System.out.println("Weekday");
case 6:
System.out.println("Saturday");
break;
}

    }
}
