package ua.homework.lesson12;

public class Circle extends Shape {

    static final String name = "Circle";


    public Circle(){
        super(name);
    }

    public void calculateSquare(int radius) {
        super.setSquare((int) (Math.PI * Math.pow(radius, 2)));
        if (super.getSquare() > 10) {
            setColor("Red");
        }
    }

    public void calculatePerimeter(int radius) {
        super.setPerimeter((int) (2 * Math.PI * radius));
    }
}
