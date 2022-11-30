package ua.homework.lesson16;

public class Circle extends Shape {

    private static final String NAME = "Circle";


    public Circle(int radius){
        super(NAME);
        calculateSquare(radius);
        calculatePerimeter(radius);
    }

    public void calculateSquare(int radius) {
        super.setSquare((int) (Math.PI * Math.pow(radius, 2)));
        if (super.getSquare() > 10) {
            setColor("Red");
        }
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public int getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public int getSquare() {
        return super.getSquare();
    }

    public void calculatePerimeter(int radius) {
        super.setPerimeter((int) (2 * Math.PI * radius));
    }
}
