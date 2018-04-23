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
public class Overloading {

    public void fly(int numMiles) {
        System.out.println("int");
    }

    public void fly(short numFeet) {
        System.out.println("short");

    }

    public boolean fly() {
        System.out.println("boolean");
        return false;
    }

    void fly(int numMiles, short numFeet) {
        System.out.println("int, short");

    }

    public void fly(short numFeet, int numMiles) throws Exception {
        System.out.println("short, int");

    }

    public void fly(long numMiles, short numFeet) {
        System.out.println("long, short");

    }
    public void fly(int numMiles, int numFeet) {
        System.out.println("int, int");

    }
    public void fly(long numMiles, long numFeet) {
        System.out.println("long, long");

    }
     public void fly(Integer numMiles, Integer numFeet) {
        System.out.println("Integer, Integer");

    }
     public void fly(Integer numMiles, long numFeet) {
        System.out.println("Integer, long");

    }     
    public static void main(String[] args) {
        
        Integer i = Integer.valueOf("1");
        new Overloading().fly( i, i);
        new Overloading().fly( 24721545, 1);       
    }

}
