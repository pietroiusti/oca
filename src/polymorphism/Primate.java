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

//Here are some basic rules to keep in mind when casting variables:
//1. Casting an object from a subclass to a superclass doesn’t require an explicit cast.
//2. Casting an object from a superclass to a subclass requires an explicit cast.
//3. The compiler will not allow casts to unrelated types.
//4. Even when the code compiles without issue, an exception may be thrown at runtime if
//the object being cast is not actually an instance of that class.

public class Primate {
    public int age = 5;
    public boolean hasHair() {
        return true;

    }
}

interface HasTail {

    public boolean isTailStriped();
}

class Lemur extends Primate implements HasTail {

    public boolean isTailStriped() {
        return false;
    }
    public int age = 10;

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);  //10      
        HasTail hasTail = lemur;
        System.out.println(lemur.isTailStriped());        
        System.out.println(hasTail.isTailStriped());
        Primate primate = lemur;
        System.out.println(lemur.hasHair());            
        System.out.println(primate.hasHair());
        
        System.out.println(primate.age);  //5
        Lemur lemur2 = (Lemur) primate;
         System.out.println(lemur2.age);  //10    
         
         Primate primate2 = new Primate();
         System.out.println(primate2.age); 
//         Lemur lemur3 = (Lemur) primate2;
//         System.out.println(lemur3.age); //Exception in thread "main" java.lang.ClassCastException: polymorphism.Primate cannot be cast to polymorphism.Lemur 
         
         System.out.println(lemur2 instanceof Lemur);
         System.out.println(primate instanceof Lemur);
         System.out.println(primate2 instanceof Lemur);         
         System.out.println(primate2 instanceof Primate);         
    }
}
