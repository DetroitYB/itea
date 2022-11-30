package ua.homework.lesson16;

public class Rectangle extends Shape {
    static final String NAME = "Rectangle";

    public Rectangle(int weigth, int heigth){
        super(NAME);
        calculatePerimeter(weigth, heigth);
        calculateSquare(weigth, heigth);
    }

    public Rectangle(){
        super(NAME);
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

    public void calculateSquare(int weigth, int heigth) {
        super.setSquare(weigth * heigth);
        if (super.getSquare() > 10) {
            setColor("Red");
        }
    }
    public void calculatePerimeter(int weigth, int heigth) {
        setPerimeter(2 * (weigth + heigth));
    }
}
