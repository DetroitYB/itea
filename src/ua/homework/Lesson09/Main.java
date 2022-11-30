package ua.homework.Lesson09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iteratorC = 0;
        int iteratorT = 0;
        int iteratorR = 0;

        int length = 3;
        Circle[] circles = new Circle[length];
        Triangle[] triangles = new Triangle[length];
        Rectangle[] rectangles = new Rectangle[length];
        do {
            System.out.println("Enter 1 to create Circle, 2 - Rectangle, 3 - Triangle");
            String inputValue = scanner.next();
            if (inputValue.equals("1")) {

                System.out.println("You choose Circle enter the radius: ");
                int radius = scanner.nextInt();
                Circle circle = new Circle(radius);
                if (iteratorC != length) {
                    circles[iteratorC] = circle;
                    iteratorC++;
                }
                System.out.println(iteratorC);
            } else if (inputValue.equals("2")) {

                System.out.println("You choose Rectangle enter the width: ");
                int width = scanner.nextInt();
                System.out.println("You choose Rectangle enter the height: ");
                int height = scanner.nextInt();
                Rectangle rectangle = new Rectangle(width, height);
                if (iteratorR != length) {
                    rectangles[iteratorR] = rectangle;
                    iteratorR++;
                }
                System.out.println(iteratorR);
            } else if (inputValue.equals("3")) {

                System.out.println("You choose Rectangle enter 3 sides : ");
                int aSide = scanner.nextInt();
                int bSide = scanner.nextInt();
                int cSide = scanner.nextInt();
                Triangle triangle = new Triangle(aSide, bSide, cSide);
                if(iteratorT != length ) {
                    triangles[iteratorT] = triangle;
                    iteratorT++;
                }
                System.out.println(iteratorT);
            } else {
                System.out.println("Wrong type of number to create an object");
            }
            if(iteratorT == length && iteratorC == length && iteratorR == length){
                break;
            }
        } while (true);

        for(int i = 0; i<circles.length; i++){
            circles[i].printInfo();
            rectangles[i].printInfo();
            triangles[i].printInfo();
        }
    }
}
