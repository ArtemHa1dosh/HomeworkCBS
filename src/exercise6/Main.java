package exercise6;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("This is a print.");

        ColorPrinter colorPrinter = new ColorPrinter();
        colorPrinter.print("This is a colored print.");
    }
}
