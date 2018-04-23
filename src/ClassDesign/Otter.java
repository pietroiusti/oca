/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDesign;

/**
 *
 * @author PietroS
 */
class Toy {

    private boolean containsIce = false;

    public boolean isContainsIce() {
        return containsIce;

    }
    public void setContainsIce() {
        this.containsIce=true;

    }  
}

public class Otter extends Toy {
private boolean containsIce = false;
    private static void play(Toy toy) {
//        toy = new Toy();
        toy.setContainsIce();
        
        
    }
//    public void setContainsIce() {
//        this.containsIce=true;
//
//    } 
    public static void main(String... args) {
//           Toy toy = new Toy();
//            Otter otter = (Otter) toy; //Exception in thread "main" java.lang.ClassCastException: ClassDesign.Toy cannot be cast to ClassDesign.Otter
           Toy toy = new Otter();
           Otter otter = (Otter) toy;
           
           Otter.play(toy);
           System.out.println(toy.isContainsIce());
    }
}
