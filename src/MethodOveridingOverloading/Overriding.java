/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodOveridingOverloading;

/**
 *
 * @author PietroS
 */
public class Overriding {
    protected int i = 0;
    public double getAverageWeight() {
        return i;
    }
}

class Wolf extends Overriding {

        public int i = 1;
    
    public double getAverageWeight() {
        return i;
    }

    public static void main(String[] args) {
        Overriding w = new Wolf();
        Overriding o = new Overriding();
        System.out.println(o.getAverageWeight());        
        System.out.println(w.getAverageWeight());
        
        System.out.println(new Overriding().getAverageWeight());
        System.out.println(new Wolf().getAverageWeight());
    }
}