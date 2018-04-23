/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pond.duck;

/**
 *
 * @author PietroS
 */
public class MotherDuck {

    String noise = "quack";

    void quack() {
        System.out.println(noise); // default access is ok
    }

    private void makeNoise() {
        quack(); // default access is ok
    }
}
