package lesson13;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(7);
        nums.add(1);
        nums.add(5);
        nums.add(3);
        // for (доступен только там где есть индексы)
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i)+"    ");

        }
        // for eath (оступно каждой колекции )
        for (Integer num : nums) {
            System.out.print(num+"    ");

        }
        // помощью итератора
        for (Iterator<Integer> iter = nums.iterator();iter.hasNext();){
            System.out.print(iter.next()+"    ");
        }
    }

}

