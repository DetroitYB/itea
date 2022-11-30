package ua.homework.lesson12;

public class Shape {
    private String name;
    private String color;
    private int perimeter;
    private int square;

    {
        this.color = "White";
    }

    public Shape(String name){
        this.name = name;
    }


    void setPerimeter(int perimeter){
        this.perimeter = perimeter;
    }


    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getSquare() {
        return this.square;
    }

    public void setSquare( int square){
        this.square = square;
    }




    void printInfo() {
        System.out.println("name : " + this.name + "\n" +
                "color : " + this.color + "\n" +
                "perimeter : " + this.perimeter + "\n" +
                "square : " + this.square + "\n" +
                "****************************************");
    }
}
