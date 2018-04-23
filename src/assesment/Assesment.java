/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assesment;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author PietroS
 */
class Test {}

//11. What is the output of the following program?
//1: public class FeedingSchedule {
//2: public static void main(String[] args) {
//3: int x = 5, j = 0;
//4: OUTER: for(int i=0; i<3; )
//5: INNER: do {
//6: i++; x++;
//7: if(x > 10) break INNER;
//8: x += 4;
//9: j++;
//10: } while(j <= 2);
//11: System.out.println(x);
//12: } }
//A. 10
//B. 12
//C. 13
//D. 17
//E. The code will not compile because of line 4.
//F. The code will not compile because of line 6.
//xxxvi Introduction
//12. What is the result of the following program?
//1: public class Egret {
//2: private String color;
//3: public Egret() {
//4: this("white");
//5: }
//6: public Egret(String color) {
//7: color = color;
//8: }
//9: public static void main(String[] args) {
//10: Egret e = new Egret();
//11: System.out.println("Color:" + e.color);
//12: }
//13: }
//A. Color:
//B. Color:null
//C. Color:White
//D. Compiler error on line 4.
//E. Compiler error on line 10.
//F. Compiler error on line 11.
//13. What is the output of the following program?
//1: public class BearOrShark {
//2: public static void main(String[] args) {
//3: int luck = 10;
//4: if((luck>10 ? luck++: --luck)<10) {
//5: System.out.print("Bear");
//6: } if(luck<10) System.out.print("Shark");
//7: } }
//A. Bear
//B. Shark
//C. BearShark
//D. The code will not compile because of line 4.
//E. The code will not compile because of line 6.
//F. The code compiles without issue but does not produce any output.
//14. Assuming we have a valid, non-null HenHouse object whose value is initialized by the
//blank line shown here, which of the following are possible outputs of this application?
//(Choose all that apply)
//1: class Chicken {}
//2: interface HenHouse { public java.util.List<Chicken> getChickens(); }
//3: public class ChickenSong {
//Introduction xxxvii
//4: public static void main(String[] args) {
//5: HenHouse house = ______________
//6: Chicken chicken = house.getChickens().get(0);
//7: for(int i=0; i<house.getChickens().size();
//8: chicken = house.getChickens().get(i++)) {
//9: System.out.println("Cluck");
//10: } } }
//A. The code will not compile because of line 6.
//B. The code will not compile because of lines 7–8.
//C. The application will compile but not produce any output.
//D. The application will output Cluck exactly once.
//E. The application will output Cluck more than once.
//F. The application will compile but produce an exception at runtime.
//15. Which of the following statements can be inserted in the blank line so that the code will
//compile successfully? (Choose all that apply)
//public interface CanSwim {}
//public class Amphibian implements CanSwim {}
//class Tadpole extends Amphibian {}
//public class FindAllTadPole {
//public static void main(String[] args) {
//List<Tadpole> tadpoles = new ArrayList<Tadpole>();
//for(Amphibian amphibian : tadpoles) {
//___________ tadpole = amphibian;
//} } }
//A. CanSwim
//B. Long
//C. Amphibian
//D. Tadpole
//E. Object
//16. What individual changes, if any, would allow the following code to compile? (Choose all
//that apply)
//1: public interface Animal { public default String getName() { return null; } }
//2: interface Mammal { public default String getName() { return null; } }
//3: abstract class Otter implements Mammal, Animal {}
//A. The code compiles without issue.
//B. Remove the default method modifier and method implementation on line 1.
//C. Remove the default method modifier and method implementation on line 2.
//D. Remove the default method modifier and method implementation on lines 1 and 2.
//E. Change the return value on line 1 from null to "Animal".
//xxxviii Introduction
//F. Override the getName() method with an abstract method in the Otter class.
//G. Override the getName() method with a concrete method in the Otter class.
//
//17. Which of the following lines can be inserted at line 11 to print true? (Choose all that
//apply)
//10: public static void main(String[] args) {
//11: // INSERT CODE HERE
//12: }
//13: private static boolean test(Predicate<Integer> p) {
//14: return p.test(5);
//15: }
//A. System.out.println(test(i -> i == 5));
//B. System.out.println(test(i -> {i == 5;}));
//C. System.out.println(test((i) -> i == 5));
//D. System.out.println(test((int i) -> i == 5);
//E. System.out.println(test((int i) -> {return i == 5;}));
//F. System.out.println(test((i) -> {return i == 5;}));
//
//18. Which of the following print out a date representing April 1, 2015? (Choose all that apply)
//A. System.out.println(LocalDate.of(2015, Calendar.APRIL, 1));
//B. System.out.println(LocalDate.of(2015, Month.APRIL, 1));
//C. System.out.println(LocalDate.of(2015, 3, 1));
//D. System.out.println(LocalDate.of(2015, 4, 1));
//E. System.out.println(new LocalDate(2015, 3, 1));
//F. System.out.println(new LocalDate(2015, 4, 1));
//
//19. Bytecode is in a file with which extension?
//A. .bytecode
//B. .bytes
//C. .class
//D. .exe
//E. .javac
//F. .java
//
//20. Which of the following are checked exceptions? (Choose all that apply)
//A. Exception
//B. IllegalArgumentException
//C. IOException
//D. NullPointerException
//E. NumberFormatException
//F. StackOverflowError

class Assesment {

    /**
     * @param args the command line arguments
     */
    private static int $;
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(test(t -> t.equals(5)));
        System.out.println(test((t) -> t == 5));
         System.out.println(test((t) -> {return t == 5;}));       
        
 float y = 2.1f;
 
 boolean z = !true;
 
        int luck = 10;
//        private static int $; 

        if ((luck>10 ? luck++ : --luck)<10){
            System.out.print("Bear");
        } if (luck < 10)  System.out.print("Shark");
 
        



//         Array tets

    System.out.println("====================");
        System.out.println("========Array test======");
    int[] array = {6,9,8};
    List<Integer> list = new ArrayList<>();
    list.add(array[0]);
    list.add(array[2]);
    list.set(1,array[1]);
    list.remove(0);
    System.out.println(list);
    
     System.out.println("====================");
        System.out.println("========DAte  test======");   
    System.out.println(LocalDate.of(2015, Month.APRIL, 1));
//    System.out.println(new LocalDate(2015, 4, 1));    
    }
    
    
    public interface Animal {
    
    public default String getName(){return null;}
    }
    interface Mammal {public default String getName(){return null;}}
    
    abstract class Otter implements Mammal, Animal{
        @Override
        public abstract String getName();
    };
    
    private static boolean test (Predicate<Integer> p) {
        return p.test(5);
    }

    
    
    
}
