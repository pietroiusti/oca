/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDesign;


//Overriding vs. Hiding Methods
//At runtime the child version of an overridden method is always executed for an instance
//regardless of whether the method call is defi ned in a parent or child class method. In this
//manner, the parent method is never used unless an explicit call to the parent method is
//referenced, using the syntax ParentClassName.method(). Alternatively, at runtime the parent
//version of a hidden method is always executed if the call to the method is defi ned in the
//parent class. Let’s take a look at an example:

class Marsupial {

    public static boolean isBiped() {
        return false;
    }

    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: " + isBiped());
    }

    public boolean isReallyBiped() {
        return false;
    }

    public void getMarsupialDescription2() {
        System.out.println("Marsupial walks on two legs: " + isReallyBiped());
    }

}

public class Kangaroo extends Marsupial {

//    Method hiding
    public static boolean isBiped() {
        return true;
    }

    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs: " + isBiped());
    }
//    Method overriding
    public boolean isReallyBiped() {
        return true;
    }

    public void getKangarooDescription2() {
        System.out.println("Kangaroo hops on two legs: " + isReallyBiped());
    }

    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();
//    Method hiding        
        joey.getMarsupialDescription();
        joey.getKangarooDescription();
//    Method overriding        
        joey.getMarsupialDescription2();
        joey.getKangarooDescription2();        
    }
}
