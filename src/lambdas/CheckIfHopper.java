/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas;

/**
 *
 * @author PietroS
 */
public class CheckIfHopper implements CheckTrait {

    public boolean test(Animal a) {
        return a.canHop();
    }
}
