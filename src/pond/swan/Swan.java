/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pond.swan;

import pond.shore.Bird; // in different package than Bird
import static java.util.Arrays.*;


public class Swan extends Bird { // but subclass of bird

    public void swim() {
        asList("one");
        floatInWater(); // package access to superclass
        System.out.println(text); // package access to superclass
    }

    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater(); // package access to superclass
        System.out.println(other.text);// package access to superclass
    }

    public void helpOtherBirdSwim() {
        Bird other = new Swan();
//        Bird other = new Bird();        
//                Swan2 other = new Swan2(); //OK
//        other.floatInWater(); // DOES NOT COMPILE
//        System.out.println(other.text); // DOES NOT COMPILE
    }
}

class Swan2 extends Swan { // but subclass of Swan

}