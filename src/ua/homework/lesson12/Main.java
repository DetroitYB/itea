package ua.homework.lesson12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int iterator = 0;
        Shape[] shapes = null;
        while(true) {
            if (in.hasNextInt()) {
                shapes = new Shape[in.nextInt()];
                System.out.println("OK");
                break;
            } else {
                System.out.println("Enter a number");
                in.next();
            }
        }

        while(true){
            if (in.hasNextInt()){
                int a = in.nextInt();
                if(a == 1){
                    System.out.println("Circle");
                    Circle circle = new Circle();
                    circle.calculatePerimeter(5);
                    shapes[iterator] = circle;
                    iterator++;
                }else if(a == 2){
                    System.out.println("Triangle");
                    Triangle triangle = new Triangle();
                    triangle.calculatePerimeter(1,2,3);
                    triangle.calculateSquare(49,149,124);
                    shapes[iterator] = triangle;
                    iterator++;
                }else if (a == 3) {
                    System.out.println("Rectangle");
                    Rectangle rectangle = new Rectangle();
                    rectangle.calculatePerimeter(5,10);
                    rectangle.calculateSquare(19,18);
                    shapes[iterator] = rectangle;
                    iterator++;
                }else{
                    System.out.println("NUll");
                }
                if(iterator == shapes.length){
                    break;
                }
            }else {
                System.out.println("Wrong enter data, need number of shape");
                in.next();
            }
        }
        for(Shape s : shapes){
            s.printInfo();
        }

    }
}
