/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assesment;

/**
 *
 * @author PietroS
 */
//8. What is the output of the following code?
//1: public class Deer {
//2: public Deer() { System.out.print("Deer"); }
//3: public Deer(int age) { System.out.print("DeerAge"); }
//4: private boolean hasHorns() { return false; }
//5: public static void main(String[] args) {
//6: Deer deer = new Reindeer(5);
//7: System.out.println(","+deer.hasHorns());
//8: }
//9: }
//
//8. A. The code compiles and runs without issue, so options G and H are incorrect. First,
//the Reindeer object is instantiated using the constructor that takes an int value. Since
//there is no explicit call to the parent constructor, the default no-argument super()
//is inserted as the first line of the constructor. The output is then Deer, followed by
//Reindeer in the child constructor, so only options A and B can be correct. Next,
//the method hasHorns() looks like an overridden method, but it is actually a hidden
//method since it is declared private in the parent class. Because the hidden method is
//referenced in the parent class, the parent version is used, so the code outputs false,
//and option A is the correct answer.

public class Question8 {
    
}
