/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pond.inland;

/**
 *
 * @author PietroS
 */
import pond.shore.Bird; // different package than Bird

public class BirdWatcherFromAfar {

    public void watchBird() {
        Bird bird = new Bird();
//        bird.floatInWater(); // DOES NOT COMPILE
//        System.out.println(bird.text); // DOES NOT COMPILE
    }
}
