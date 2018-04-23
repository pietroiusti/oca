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
public class HowMany {

    public static int count(int a) {
int b = 0;
   char value = 'c';
   
   do        System.out.print(value++);    while (value<= 'f');
   

        if (a != 3) {
            b = 1;
        } else {
            b = 2;
        }
        return a++ + b;
    }
}
