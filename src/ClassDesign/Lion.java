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
public class Lion extends Animal {

    public Lion(int age) {
        super(age);
    }

    public void roar() {
        System.out.println("The " + getAge() + " year old lion says: Roar!");
    }
}
