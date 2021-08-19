package lesson16;

public class Main {
    public static void main(String[] args) {
        Sklad sklad = new Sklad();
        Tovar tovar1 = new Tovar(12323, "Монитор 12344", 12000);
        Tovar tovar2 = new Tovar(432323, "мышка 22224", 222);
        Tovar tovar3 = new Tovar(662323, "Моноблок нокия", 40000);
        Tovar tovar4 = new Tovar(7323, "Батон радость", 120);
        Tovar tovar5 = new Tovar(52323, "Телефон Sumsung", 22000);


        sklad.addTovar(tovar1, 10);
        sklad.addTovar(tovar1, 15);
        sklad.addTovar(tovar2, 10);
        sklad.addTovar(tovar3, 130);
        sklad.addTovar(tovar4, 66);
        sklad.addTovar(tovar5, 6);

        sklad.deleteTovar(tovar1, 5);
        System.out.println();
        System.out.println();
    }
}
