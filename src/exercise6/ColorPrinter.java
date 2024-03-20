package exercise6;

public class ColorPrinter extends Printer {
    @Override
    public void print(String value) {
        System.out.println(changeColor(value));
    }

    private String changeColor(String value) {
        return "\033[0;34m" + value + "\033[0m";
    }
}
