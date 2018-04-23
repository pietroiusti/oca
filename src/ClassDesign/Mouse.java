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
class Rodent {
//When you hide a variable, you defi ne a variable with the same name as a variable in a parent
//class. This creates two copies of the variable within an instance of the child class: one
//instance defi ned for the parent reference and another defi ned for the child reference.
//As when hiding a static method, you can’t override a variable; you can only hide it. Also
//similar to hiding a static method, the rules for accessing the parent and child variables are
//quite similar. If you’re referencing the variable from within the parent class, the variable
//defi ned in the parent class is used. Alternatively, if you’re referencing the variable from
//within a child class, the variable defi ned in the child class is used. Likewise, you can reference
//the parent value of the variable with an explicit use of the super keyword. Consider
//the following example:

    protected int tailLength = 4;

    public void getRodentDetails() {
        System.out.println("[parentTail=" + tailLength + "]");
    }
}

public class Mouse extends Rodent {

    protected int tailLength = 8;

    public void getMouseDetails() {
        System.out.println("[tail=" + tailLength + ",parentTail=" + super.tailLength + "]");
    }

    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.getRodentDetails();
        mouse.getMouseDetails();

        Rodent rmouse = new Mouse();
        rmouse.getRodentDetails();
        System.out.println(mouse.tailLength);
        System.out.println(rmouse.tailLength);
    }
}
