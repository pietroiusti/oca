/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodOveridingOverloading;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PietroS
 */
abstract class test {
    public static final int X = 0; 
    static {
    int y = 0;
    }

}
 class Bird {

    protected void fly() {
        System.out.println("Bird is flying");
        List<?> list = new ArrayList<>();
    }

    public static void main(String[] args) {
        Bird bird = new Pelican();
        bird.fly();
    }
}

class Pelican extends Bird {

    @Override
    protected void fly() {
        System.out.println("Pelican is flying");
        int[] b = new int[10];
    }
}
