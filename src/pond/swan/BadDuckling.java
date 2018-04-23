/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pond.swan;

/**
 *
 * @author PietroS
 */
import pond.duck.MotherDuck; // import another package

public class BadDuckling  {

    public void makeNoise() {
        MotherDuck duck = new MotherDuck();
//        duck.quack(); // DOES NOT COMPILE
//        System.out.println(duck.noise); // DOES NOT COMPILE
    }
}
