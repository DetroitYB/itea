package ua.homework.Lesson08;

public class Circle {
    private String name = "Circle";
    private String color;
    private int perimeter;
    private int square;

    void setName(){
        this.name = "Circle";
    }

    void calculateSquare(int radius){
        this.square = (int) (Math.PI * Math.pow(radius, 2));
        if(this.square > 10 && this.square > 0 ){
            this.color = "Red";
        }else {
            this.color = "White";
        }
    }

    void calculatePerimeter(int radius){
        this.perimeter = (int)(2 * Math.PI * radius);
    }

    void printInfo(){
        System.out.println("name = " + this.name);
        System.out.println("color = " + this.color);
        System.out.println("perimeter = " + this.perimeter);
        System.out.printf("square = %d \n", this.square);
    }
}
