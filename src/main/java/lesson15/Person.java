package lesson15;

public class Person {
    private int age;
    private String name;

    public void setAge(int age) throws UndercurrentAgeException {
        if (age > 150 || age < 0) {
            throw new UndercurrentAgeException("Возрост неможет быть меньше 0 или болшьше 150");

        }

    }
}
