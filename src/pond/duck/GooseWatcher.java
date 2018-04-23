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
import pond.goose.Goose;
import pond.shore.Bird;

public class GooseWatcher extends Bird {

    public void watch() {
        Goose goose = new Goose();
//        goose.floatInWater(); // DOES NOT COMPILE
        GooseWatcher goosew = new GooseWatcher();

        goosew.floatInWater();
    }
}

