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
//Abstract Class Defi nition Rules:
//1. Abstract classes cannot be instantiated directly.
//2. Abstract classes may be defined with any number, including zero, of abstract and nonabstract
//methods.
//3. Abstract classes may not be marked as private or final.
//4. An abstract class that extends another abstract class inherits all of its abstract methods
//as its own abstract methods.
//5. The first concrete class that extends an abstract class must provide an implementation
//for all of the inherited abstract methods.
//Abstract Method Defi nition Rules:
//1. Abstract methods may only be defined in abstract classes.
//2. Abstract methods may not be declared private or final.
//3. Abstract methods must not provide a method body/implementation in the abstract
//class for which is it declared.
//4. Implementing an abstract method in a subclass follows the same rules for overriding a
//method. For example, the name and signature must be the same, and the visibility of
//the method in the subclass must be at least as accessible as the method in the parent
//class.
class AnimalAbstract2 {

    private int itest = 0;
}

interface testinterface {

    int TESTV = 0;

    void geti();

    public default void eatMeat() {
    }

    static int getJumpHeight() {
        return 8;
    }
}

abstract class AnimalAbstract extends AnimalAbstract2 implements testinterface {

    protected abstract String getName();
//     abstract String getNamfe();

    static int getJumpHeight() {
        return 0;
    }

    public static void main(String[] args) {

        LionConcrete lion = new LionConcrete();
        lion.roar();
    }

}

abstract class BigCat extends AnimalAbstract {

    interface testinterface2 {

        void geti2();
    }

    public String getName() {

        return "BigCat";
    }

    public abstract void roar();
}

class LionConcrete extends BigCat {

    public void roar() {
        System.out.println(testinterface.getJumpHeight());
        System.out.println(AnimalAbstract.getJumpHeight());
        System.out.println("The Lion lets out a loud ROAR!");
    }

    @Override
    public void geti() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eatMeat() {
        super.eatMeat(); //To change body of generated methods, choose Tools | Templates.
    }
}

abstract class CheetahAbstract extends LionConcrete {

    protected abstract void meow();
}

class CheetahConcrete extends CheetahAbstract {

    @Override
    protected void meow() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
