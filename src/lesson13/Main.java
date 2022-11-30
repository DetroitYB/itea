package lesson13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Owner owner1 = new Owner("Misha");
        Dog dog1 = new Dog("Baron", 7);

        Dog dog2 = new Dog("Baron", 7);
        Dog dog3 = new Dog("BAron", 8);
        dog1.setOwner(owner1);
        Dog dog5 = (Dog) dog1.clone();
        System.out.println(dog1);
        owner1.setName("Grisha");
        System.out.println(dog1);
        System.out.println(dog5);

    }
}
