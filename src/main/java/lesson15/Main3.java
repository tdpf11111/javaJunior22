package lesson15;

public class Main3 {
    public static void main(String[] args) {
        try {
            StringUtils.div("1", "0");
        } catch (ArithmeticException e) {

        } catch (NumberFormatException e) {

        } catch (NullPointerException e) {

        }

    }
}
