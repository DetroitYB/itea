package ua.homework.lesson12;

public class Triangle extends Shape {

    static final String name = "Triangle";

    public Triangle(){
        super(name);
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
