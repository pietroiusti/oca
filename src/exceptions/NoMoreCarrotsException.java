/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author PietroS
 */
public class NoMoreCarrotsException extends Exception {
}

class Bunny {

    public static void main(String[] args) throws NoMoreCarrotsException {
        eatCarrot();// DOES NOT COMPILE
//        try {
//            eatCarrot();// DOES NOT COMPILE
//        } catch (NoMoreCarrotsException e ) {
//            System.out.println(e.getMessage());
//        }
    }

    private static void eatCarrot() throws NoMoreCarrotsException {
    }
}
