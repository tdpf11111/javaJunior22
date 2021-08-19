package lesson16;

import java.util.HashMap;
import java.util.Map;

public class Sklad {

    private HashMap<Tovar, Integer> tovars = new HashMap<>();


    public void addTovar(Tovar tovar, int value) {
        if (tovars.containsKey(tovar)) {
            int currntValue = tovars.get(tovar);
            tovars.put(tovar, value + currntValue);
        } else {
            tovars.put(tovar, value);
        }
    }

    public void deleteTovar(Tovar tovar, int value) {
        if (!tovars.containsKey(tovar)) {
            System.out.println("Такого товара на складе нет");
            return;
        }
        if (value > tovars.get(tovar)) {
            System.out.println("Товара на складе недоставточно");
            tovars.remove(tovar);
            return;
        }
        tovars.put(tovar, tovars.get(tovar) - value);
    }

    public void printAllTovars() {
        for (Tovar t : tovars.keySet()) {
            System.out.println(t.getName() + " - " + tovars.get(t));
        }
    }

    public void printAllTovars2() {
        for (Map.Entry<Tovar, Integer> para : tovars.entrySet()) {
            System.out.println(para.getKey().getName() + " - " + para.getValue());

        }
    }

    public Tovar getMinCountTovar() {
        Tovar minTovar = null;
        for (Tovar t : tovars.keySet()) {
            if (minTovar == null) {
                minTovar = t;

            } else {
                if (tovars.get(t) < tovars.get(minTovar)) {
                    minTovar = t;
                }
            }
        }
        return minTovar;
    }
}
