package ua.homework.lesson16;

public class Shape {
    private String name;
    private String color;
    private int perimeter;
    private int square;


    public Shape(String name){
        this.color = "White";
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    void printInfo() {
        System.out.println("name : " + this.name + "\n" +
                "color : " + this.color + "\n" +
                "perimeter : " + this.perimeter + "\n" +
                "square : " + this.square + "\n" +
                "****************************************");
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", perimeter=" + perimeter +
                ", square=" + square +
                '}';
    }
}
