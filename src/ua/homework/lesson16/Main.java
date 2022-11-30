package ua.homework.lesson16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DbConnector dbConnector = new DbConnector();
        ShapeController shapeController = new ShapeController(dbConnector);
        int iterator = 0;
        Shape[] shapes = null;

        while (iterator < 3) {
            System.out.println("Enter a number of shape \n 1 = Circle; 2 - Triangle; 3 - Rectangle");

            try {
                int a = Integer.parseInt(in.nextLine());
                if (a == 1) {
                    //System.out.println("Circle");
                    Circle circle = new Circle(5);
                    shapeController.addShape(circle);
                    iterator++;
                } else if (a == 2) {
                    //System.out.println("Triangle");
                    Triangle triangle = new Triangle(5, 2, 5);
                    shapeController.addShape(triangle);
                    iterator++;
                } else if (a == 3) {
                    //System.out.println("Rectangle");
                    Rectangle rectangle = new Rectangle(5, 10);
                    shapeController.addShape(rectangle);
                    iterator++;
                } else {
                    System.out.println("NUll");
                }
            } catch (NumberFormatException e) {
                System.out.println("Wrong type of shape");
            }
        }

        System.out.println("Enter filter to sort rows or just enter for view all rows");
        String filter = in.nextLine();
        shapes = shapeController.getAllShapes(filter);
        if (shapes.length > 0) {
            for (Shape shape : shapes) {
                shape.printInfo();
            }
        } else {
            System.out.println("Wrong filter ");
        }
    }
}
