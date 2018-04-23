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
public class CustomException {
    
}
class CannotSwimException extends Exception {
}

class DangerInTheWater extends RuntimeException {
}

class SharkInTheWaterException extends DangerInTheWater {
}

class Dolphin {

    public void swim() throws CannotSwimException {
// logic here
    }
}

