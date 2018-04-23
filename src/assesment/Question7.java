/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assesment;

//7. What is the result of the following code?
//int[] array = {6,9,8};
//List<Integer> list = new ArrayList<>();
//xxxiv Introduction
//list.add(array[0]);
//list.add(array[2]);
//list.set(1, array[1]);
//list.remove(0);
//System.out.println(list);
//A. [8]
//B. [9]
//C. Something like [Ljava.lang.String;@160bc7c0
//D. An exception is thrown.
//E. The code does not compile.
//7. B. The array is allowed to use an anonymous initializer because it is in the same line as
//the declaration. The ArrayList uses the diamond operator allowed since Java 7. This
//specifies the type matches the one on the left without having to re-type it. After adding
//the two elements, list contains [6, 8]. We then replace the element at index 1 with 9,
//resulting in [6, 9]. Finally, we remove the element at index 0, leaving [9]. Option C
//is incorrect because arrays output something like that rather than an ArrayList. For
//more information, see Chapter 3.
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PietroS
 */
public class Question7 {

    public static void main(String[] args) {
        int[] array = {6, 9, 8};
        List<Integer> list = new ArrayList<>();

        list.add(array[0]);
        list.add(array[2]);
        list.set(1, array[1]);
        list.remove(0);
        System.out.println(list);

    }
}
