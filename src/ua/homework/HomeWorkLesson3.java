package ua.homework;

import java.util.Scanner;

public class HomeWorkLesson3 {
    public static void main(String[] args) {
        int counts = 1;
        int a = (int) (Math.random() * (101 - 0) - 0);
        System.out.println(a);

        do {
            System.out.println("Try #" + counts + " Enter Your Number:");
            if (counts == 5) {
                System.out.println("Won number was " + a + " You are loser");
                break;
            }
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number == a) {
                    System.out.println("Winner");
                    break;
                } else if (number > a) {
                    System.out.println("You number is great");
                } else {
                    System.out.println("Your number is less");
                }
            } else {
                System.out.println("You Fucking retard write the number");
                scanner.next();
            }
            counts++;
        } while (true);
    }
}