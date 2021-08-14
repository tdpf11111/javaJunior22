package lesson13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        HashSet<Integer> b = new HashSet<>();
        b.add(3);
        b.add(4);
        b.add(5);
        b.add(6);
        b.add(7);
        CollectionUtilsImpel utils = new CollectionUtilsImpel();
        Collection<Integer> union = utils.union(a, b);
        System.out.println(union + " union");
        Collection<Integer> intersection = utils.intersection(a, b);
        System.out.println(intersection + " intersection");

        Collection<Integer> unionWithoutDuplicate = utils.unionWithoutDuplicate(a, b);
        System.out.println(unionWithoutDuplicate + " unionWithoutDuplicate");

        Collection<Integer> intersectionWithoutDuplicate = utils.intersectionWithoutDuplicate(a, b);
        System.out.println(intersectionWithoutDuplicate + " intersectionWithoutDuplicate");

        Collection<Integer> difference = utils.difference(a, b);
        System.out.println(difference + " difference");

    }
}
