package lesson16;

import java.util.HashMap;

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
}
