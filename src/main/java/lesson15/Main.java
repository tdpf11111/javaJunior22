package lesson15;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(10);
        } catch (UndercurrentAgeException e) {
            System.out.println(" неправильно указали возраст !!!");
        }
    }
}
