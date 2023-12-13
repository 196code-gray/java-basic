package oop1.ex;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        int width = 5;
        int height = 8;
        rectangle.calculateArea(width, height);
        rectangle.calculatePerimeter(width, height);
        rectangle.isSquare(width, height);
    }
}
