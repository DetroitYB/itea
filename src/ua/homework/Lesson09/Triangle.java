package ua.homework.Lesson09;

public class Triangle {
    private String name;
    private String color;
    private int perimeter;
    private int square;

    {
        this.name = "Triangle";
    }

    void calculatePerimeter(int aSide, int bSide, int cSide) {
        this.perimeter = aSide + bSide + cSide;
    }

    public Triangle(int aSide, int bSide, int cSide){
        calculatePerimeter(aSide,bSide,cSide);
    }

    void calculateSquare(int aSide, int bSide, int cSide){
        // півпериметр трикутника
        int p = (aSide + bSide + cSide) / 2;
        //Формула Герона
        this.square = (int)(Math.sqrt(p*(p-aSide)*(p-bSide)*(p-cSide)));
        if(this.square > 10){
            this.color = "Red";
        }else {
            this.color = "White";
        }
    }


    void printInfo() {
        System.out.println("*******Triangle******");
        System.out.println("name = " + this.name);
        System.out.println("color = " + this.color);
        System.out.println("perimeter = " + this.perimeter);
        System.out.println("square = " + this.square);
        System.out.println("*********************");
    }
}
