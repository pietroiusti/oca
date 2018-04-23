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

public class OverridingMarsupial {

    public int INTI = 1;

    private boolean isBiped() {
        return false;
    }

    public void getDescription() {
        System.out.println("Marsupial walks on two legs: " + isBiped() + " - " + INTI);
    }

    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on one legs: " + isBiped() + " - " + INTI);
    }
}

class Kangaroo extends OverridingMarsupial {

    public int INTI = 2;

    public  boolean isBiped() {
        return true;
    }

    public void getDescription() {
        System.out.println("Kangaroo hops on two legs: " + isBiped() + " - " + INTI);
    }

    public void getKangarooDescription() {
        System.out.println("Marsupial walks on two legs: " + isBiped() + " - " + INTI);
    }

    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();
        joey.getDescription();
        joey.getMarsupialDescription();
        joey.getKangarooDescription();

    }
}
