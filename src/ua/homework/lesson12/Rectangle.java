package ua.homework.lesson12;

public class Rectangle extends Shape {
    static final String name = "Rectangle";
    public Rectangle(){
        super(name);
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
