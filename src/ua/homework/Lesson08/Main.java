package ua.homework.Lesson08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter 1 to create Circle, 2 - Rectangle, 3 - Triangle");
            String inputValue = scanner.next();
            if (inputValue.equals("1")) {
                Circle circle = new Circle();
                System.out.println("You choose Circle enter the radius: ");
                int radius = scanner.nextInt();
                circle.calculateSquare(radius);
                circle.calculatePerimeter(radius);
                circle.printInfo();
            } else if (inputValue.equals("2")) {
                Rectangle rectangle = new Rectangle();
                System.out.println("You choose Rectangle enter the width: ");
                int width = scanner.nextInt();
                System.out.println("You choose Rectangle enter the height: ");
                int height = scanner.nextInt();
                rectangle.calculatePerimeter(width, height);
                rectangle.calculateSquare(width, height);
                rectangle.printInfo();
            } else if (inputValue.equals("3")) {
                Triangle triangle = new Triangle();
                System.out.println("You choose Rectangle enter 3 sides : ");
                int aSide = scanner.nextInt();
                int bSide = scanner.nextInt();
                int cSide = scanner.nextInt();
                triangle.calculatePerimeter(aSide,bSide,cSide);
                triangle.calculateSquare(aSide, bSide,cSide);
                triangle.printInfo();
            } else {
                System.out.println("Wrong type of number to create an object");
            }
        } while (true);
    }
}
