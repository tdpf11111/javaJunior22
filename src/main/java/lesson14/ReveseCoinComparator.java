package lesson14;

import java.util.Comparator;

public class ReveseCoinComparator implements Comparator<Coin> {
    @Override
    public int compare(Coin o1, Coin o2) {
        if (o1.getNominal() != o2.getNominal()) {
            return o2.getNominal() - o1.getNominal();

        }
        if (o1.getYear() != o2.getYear()) {
            return o2.getYear() - o1.getYear();

        }
        if (o1.getDiagonal() != o2.getDiagonal()) {
            return Double.compare(o2.getDiagonal(), o1.getDiagonal());
        }
        return o2.getMetall().compareTo(o1.getMetall());

    }
}


