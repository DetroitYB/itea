package ua.homework.Lesson08;

public class Rectangle {
    private String name = "Triangle";
    private String color;
    private int perimeter;
    private int square;

    void calculateSquare(int weigth, int heigth) {
        this.square = weigth * heigth;
        if (this.square > 10 && this.square > 0) {
            this.color = "Red";
        } else {
            this.color = "White";
        }
    }

    void calculatePerimeter(int weigth, int heigth) {
        this.perimeter = 2 * (weigth + heigth);
    }

    void printInfo() {
        System.out.println("name = " + this.name);
        System.out.println("color = " + this.color);
        System.out.println("perimeter = " + this.perimeter);
        System.out.println("square = " + this.square);
    }
}
