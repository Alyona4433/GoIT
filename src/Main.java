// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape otherShape = new OtherShape("Custom Shape");

        PrinterFigure.printFigure(triangle); // Output: Triangle
        PrinterFigure.printFigure(circle);   // Output: Circle
        PrinterFigure.printFigure(rectangle); // Output: Rectangle
        PrinterFigure.printFigure(otherShape); // Output: Custom Shape
    }
}