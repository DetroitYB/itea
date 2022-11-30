package ua.homework.Lesson09;

public class Rectangle {
    private String name;
    private String color;
    private int perimeter;
    private int square;

    {
        this.name = "Rectangle";
    }


    public Rectangle(int weigth, int heigth){
        calculateSquare(weigth,heigth);
    }

    void calculateSquare(int weigth, int heigth) {
        this.square = weigth * heigth;
        if (this.square > 10) {
            this.color = "Red";
        } else {
            this.color = "White";
        }
    }

    void calculatePerimeter(int weigth, int heigth) {
        this.perimeter = 2 * (weigth + heigth);
    }

    void printInfo() {
        System.out.println("******Rectangle******");
        System.out.println("name = " + this.name);
        System.out.println("color = " + this.color);
        System.out.println("perimeter = " + this.perimeter);
        System.out.println("square = " + this.square);
        System.out.println("*********************");
    }
}
