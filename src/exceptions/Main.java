/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.io.IOException;

/**
 *
 * @author PietroS
 */
public class Main {
//ArithmeticException Thrown by the JVM when code attempts to divide by zero
//ArrayIndexOutOfBoundsException Thrown by the JVM when code uses an illegal
//index to access an array
//ClassCastException Thrown by the JVM when an attempt is made to cast an exception
//to a subclass of which it is not an instance
//IllegalArgumentException Thrown by the programmer to indicate that a method has
//been passed an illegal or inappropriate argument
//NullPointerException Thrown by the JVM when there is a null reference where an
//object is required
//NumberFormatException Thrown by the programmer when an attempt is made to convert
//a string to a numeric type but the string doesn’t have an appropriate format

    public static int numberEggs = 5;
    static String name = "test"; //change to null to get NullPointerException

    static {
        int[] countsOfMoose = new int[3];
//        int num2 = countsOfMoose[-1]; //ERROR: java.lang.ExceptionInInitializerError Caused by: java.lang.ArrayIndexOutOfBoundsException: -1
    }

    public static void main(String[] args) throws IOException { //Checked exception

//        readInFile();
        String textInFile = null;
        try {
            readInFile();
            System.out.println(textInFile.replace(" ", ""));
        } catch (IOException e) {
// ignore exception
        }
// imagine many lines of code here
       System.out.println(textInFile.replace(" ", ""));   //Exception in thread "main" java.lang.NullPointerException

//        doNotCodeThis(1); // ERROR:Exception in thread "main" java.lang.StackOverflowError
        int answer = 10;
        System.out.println(exceptions());
        int[] countsOfMoose = new int[3];
        System.out.println(countsOfMoose[2]); //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: -1

        String type = "moose";
        //Integer number = (Integer) type; // DOES NOT COMPILE        
        Object obj = type;
//        Integer number = (Integer) obj;       //Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer

        setNumberEggs(2); //Exception in thread "main" java.lang.IllegalArgumentException: # eggs must not be negative
        System.out.println(Main.numberEggs + " Eggs" + 4 + 6);

        printLength();    //Exception in thread "main" java.lang.NullPointerException
        //Integer.parseInt("abc");   //Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
        System.out.println(Integer.parseInt("123"));

        try {
            answer = 11 / 0;
        } catch (NullPointerException re) {
            System.out.println(re.getClass() + " " + re.getStackTrace()[0].toString() + " " + re.getMessage());
        } catch (ArithmeticException re) {
            System.out.println(re.getClass() + " " + re.getStackTrace()[0].toString() + " " + re.getMessage());
        } catch (RuntimeException re) {
            System.out.println(re.getClass() + " " + re.getStackTrace()[0].toString() + " " + re.getMessage());
        } finally {
            System.out.println(answer);
        }
    }

    public static String exceptions() {
        String result = "";
        String v = null;
        try {
            try {
                result += "before";
                v.length();
                result += "after";
            } catch (NullPointerException e) {
                result += "catch";
                throw new RuntimeException();
            } finally {
                result += "finally";
                throw new Exception();
            }
        } catch (Exception e) {
            result += "done";
        }
        return result;
    }

    public static void setNumberEggs(int numberEggs) {
        if (numberEggs < 0) {
            throw new IllegalArgumentException(
                    "# eggs must not be negative");
        }
        Main.numberEggs = numberEggs;
    }

    public static void printLength() throws NullPointerException {
        System.out.println("name: " + name);
        System.out.println(name.length());
    }

    public static void doNotCodeThis(int num) {
        doNotCodeThis(1);
    }

    private static void readInFile() throws IOException {
        throw new IOException();
    }
}
