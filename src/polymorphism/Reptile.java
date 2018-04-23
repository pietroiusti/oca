/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author PietroS
 */
//One of the most useful applications of polymorphism is the ability to pass instances of
//a subclass or interface to a method. For example, you can defi ne a method that takes an
//instance of an interface as a parameter. In this manner, any class that implements the interface
//can be passed to the method. Since you’re casting from a subtype to a supertype, an
//explicit cast is not required. This property is referred to as polymorphic parameters of a
//method, and we demonstrate it in the following example:
public class Reptile implements HasTail {

    public String getName() {
        return "Reptile";
    }

    @Override
    public boolean isTailStriped() {
       return true;
    }
}

class Alligator extends Reptile {

    @Override
    public String getName() {
        return "Alligator";
    }
    @Override
    public boolean isTailStriped() {
       return false;
    }    
}

class Crocodile extends Reptile {

    @Override
    public String getName() {
        return "Crocodile";
    }
}

class ZooWorker {

    public static void feed(Reptile reptile) {
        System.out.println("Feeding reptile " + reptile.getName());
    }

    public static void photoTail(HasTail reptile) {
        System.out.println("Picture of reptile tail " + reptile.isTailStriped());
    }
    public static void main(String[] args) {
        feed(new Alligator());
        feed(new Crocodile());
        feed(new Reptile());
        photoTail(new Reptile());
        photoTail(new Alligator());    
        photoTail(new Crocodile()); 
    }
}
