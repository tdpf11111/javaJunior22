package lesson15;

public class StringUtils {

    public static double div(String num1, String num2) throws NullPointerException, ArithmeticException, NumberFormatException {
        if (num1 == null || num2 == null) {
            throw new NullPointerException("num1==null||num2==null");

        }
        if (num1.isEmpty() || num2.isEmpty()) {
            throw new NullPointerException("первое или второе число неустановленно!");
        }
        double number1 = Double.parseDouble(num1);
        double number2 = Double.parseDouble(num2);

        if (number2 == 0) {
            throw new ArithmeticException("Делить на ноль нельзя");

        }
        return number1 / number2;

    }
}
