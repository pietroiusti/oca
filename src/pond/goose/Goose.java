/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pond.goose;

/**
 *
 * @author PietroS
 */
import pond.shore.Bird; // in a different package

//It’s okay to be confused. This is arguably one of the most confusing points on the exam.
//Looking at it a different way, the protected rules apply under two scenarios:
//■ A member is used without referring to a variable. This is the case on lines 5 and 6. In
//this case, we are taking advantage of inheritance and protected access is allowed.
//■ A member is used through a variable. This is the case on lines 10, 11, 15, and 16.
//In this case, the rules for the reference type of the variable are what matter. If it is a
//subclass, protected access is allowed. This works for references to the same class or a
//subclass.
//We’re going to try this again to make sure you understand what is going on. Can you
//fi gure out why these examples don’t compile?

public class Goose extends Bird { // extends means create subclass

    public void swim() {
        floatInWater(); // calling protected member
        System.out.println(text); // calling protected member
    }

    public void helpGooseSwim() {
        Goose other = new Goose();
        other.floatInWater();
        System.out.println(other.text);
    }

//The fi rst method is fi ne. In fact, it is equivalent to the Swan example. Goose extends
//Bird. Since we are in the Goose subclass and referring to a Goose reference, it can access
//protected members. The second method is a problem. Although the object happens to be
//a Goose, it is stored in a Bird reference. We are not allowed to refer to members of the Bird
//class since we are not in the same package and Bird is not a subclass of Bird.
    public void helpOtherGooseSwim() {
        Bird other = new Goose();
//other.floatInWater(); // DOES NOT COMPILE
//System.out.println(other.text); // DOES NOT COMPILE
    }
}
