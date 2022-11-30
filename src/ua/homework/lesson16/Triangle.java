package ua.homework.lesson16;

public class Triangle extends Shape {

    static final String NAME = "Triangle";

    public Triangle(int aSide, int bSide, int cSide){
        super(NAME);
        calculatePerimeter(aSide, bSide, cSide);
        calculateSquare(aSide, bSide, cSide);
    }

    public Triangle(){
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

    void calculatePerimeter(int aSide, int bSide, int cSide) {
        super.setPerimeter(aSide + bSide + cSide);
    }


    void calculateSquare(int aSide, int bSide, int cSide){
        // півпериметр трикутника
        int p = (aSide + bSide + cSide) / 2;
        //Формула Герона
        super.setSquare((int)(Math.sqrt(p*(p-aSide)*(p-bSide)*(p-cSide))));
        if(super.getSquare() > 10){
            super.setColor("Red");
        }
    }
}
