package lesson14;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Coin coin1 = new Coin(5, 1999, 5.5, "Золото");
        Coin coin2 = new Coin(5, 1999, 5.5, "Золото");
        Coin coin3 = new Coin(10, 1990, 3.5, "Серебро");
        Coin coin4 = new Coin(25, 1809, 4.5, "Золото");
        Coin coin5 = new Coin(5, 1509, 5.5, "Бронза");


        TreeSet<Coin> coins = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                return -1;
            }
        });
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

        for (Coin c : coins) {
            System.out.println(c);

        }

    }

}
