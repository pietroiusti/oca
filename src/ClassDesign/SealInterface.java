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
interface HasTail {

    public int getTailLength();
    public default int getNumberOfWhiskersDefault() {
        return 8;
    }
}

interface HasWhiskers {

     static final public int TEST_INT = 0;

    public int getNumberOfWhiskers();

    public default int getNumberOfWhiskersDefault() {
        return 8;
    }
    public static int getNumberOfWhiskersStatic() {
        return 8;
    }    
}

public interface SealInterface extends HasTail, HasWhiskers {
    public void eatPlants(int numhrs);
     default int getNumberOfWhiskersDefault() {
        return 10;
    }
}

interface SealInterface2 {

    public void eatPlants(int numhrs);

}

abstract class SealAbstractClass implements HasTail, HasWhiskers {
    {int i = 0;}
      static  {int b = 0;}
    public abstract void eatPlants(int numhrs, String plantType);

    public abstract void eatPlants(int numhrs);
    public int getNumberOfWhiskersDefault() {
        HasWhiskers.getNumberOfWhiskersStatic();
        return 20;
    }    
}

class SealClass extends SealAbstractClass implements SealInterface, SealInterface2 {
//class SealClass extends SealAbstractClass {

    @Override
    public int getTailLength() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNumberOfWhiskers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eatPlants(int numhrs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eatPlants(int numhrs, String plantType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
