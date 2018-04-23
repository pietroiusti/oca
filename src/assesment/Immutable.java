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
public class Immutable {

    private StringBuilder builder;

    public Immutable(StringBuilder b) {
//        builder = b;
        builder = new StringBuilder(b);

    }

    public StringBuilder getBuilder() {
//        return builder;
        return new StringBuilder(builder);
    }

    public String getBuilder2() {
//        return builder;
        return builder.toString();
    }

    public static void main(String args[]) {
        ImmutableSwan is = new ImmutableSwan(15);
        System.out.println(is.getNumberEggs());

        StringBuilder sb = new StringBuilder("initial");
        Immutable problem = new Immutable(sb);
        sb.append(" added");
        StringBuilder gotBuilder = problem.getBuilder();
        gotBuilder.append(" more");
        System.out.println(problem.getBuilder());
        System.out.println(problem.getBuilder2());
    }
}

class ImmutableSwan {

    private int numberEggs;

    public ImmutableSwan(int numberEggs) {
        this.numberEggs = numberEggs;
    }

    public int getNumberEggs() {
        return numberEggs;
    }
}
