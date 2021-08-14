package lesson13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CollectionUtilsImpel implements CollectionUtils {

    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> union = new ArrayList<>();
        union.addAll(a);
        union.addAll(b);
        return union;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> intersection = new ArrayList<>();
        for (Integer num : a) {
            if (b.contains(num)) {
                intersection.add(num);

            }
        }
        for (Integer num : b) {
            if (a.contains(num)) {
                intersection.add(num);
            }
        }
        return intersection;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> unionWithoutDuplicate = new HashSet<>();
        unionWithoutDuplicate.addAll(a);
        unionWithoutDuplicate.addAll(b);
        return unionWithoutDuplicate;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> intersectionWithoutDuplicate = new HashSet<>();
        for (Integer num : a) {
            if (b.contains(num)) {
                intersectionWithoutDuplicate.add(num);
            }
        }
        return intersectionWithoutDuplicate;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> difference = new HashSet<>();
        for (Integer num : a) {
            if (!b.contains(num)) {
                difference.add(num);
            }
        }
        for (Integer num : b) {
            if (!a.contains(num)) {
                difference.add(num);
            }
        }
        return difference;
    }
}
