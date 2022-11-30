package ua.meliodas;

import javafx.geometry.Pos;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkLesson3_1 {
    public static void main(String[] args) {

//        System.out.println(Arrays.toString(arr));

//        int[] result = new int[5];
//        for (int i = 0; i < result.length; i++) {
//            int index = (int) (Math.random() * 100);
//            System.out.println("Rnd: " + index);
//            boolean isUnuque = true;
//            for (int j = 0; j < result.length; j++) {
//                System.out.println(Arrays.toString(result));
//                if (result[j] == arr[index]) {
//                    isUnuque = false;
//                    break;
//                }
//            }
//            if (isUnuque) {
//                result[i] = arr[index];
//            } else {
//                i--;
//            }
//        }
//        System.out.println("res: " + Arrays.toString(result));

        String[] arr = new String[]{"@", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_"};

        int HealthPoint = 100;
        int PosOFHero = 0;
        int bomb = 0;
        int aid = 0;
        System.out.println((int) (Math.random() * (arr.length - 1) + 1));

        do {

            bomb = (int) (Math.random() * (arr.length - 1) + 1); //Bomb
            aid = (int) (Math.random() * (arr.length - 1) + 1); //aid
        } while (bomb == aid);
        arr[bomb] = "*";
        arr[aid] = "+";
        Scanner scanner = new Scanner(System.in);
        System.out.println(Arrays.toString(arr));
        while (true) {
            switch (scanner.next()) {
                case "a":
                    if (PosOFHero != 0) {
                        arr[PosOFHero - 1] = arr[PosOFHero];
                        PosOFHero--;
                        arr[PosOFHero + 1] = "_";
                    }
                    HealthPoint -= 5;
                    break;
                case "d":
                    HealthPoint -= 5;
                    if (arr[PosOFHero + 1].equals("*")){
                        HealthPoint -= 20;
                    }else if(arr[PosOFHero + 1].equals("+")){
                        HealthPoint += 20;
                    }
                    arr[PosOFHero + 1] = arr[PosOFHero]; // _ = @
                    PosOFHero++;
                    arr[PosOFHero - 1] = "_";
                    break;
            }
            System.out.println(Arrays.toString(arr));
            if (PosOFHero == arr.length - 1 || HealthPoint == 0) {
                System.out.println(HealthPoint);
                System.out.println("GameOver");
                break;
            }
            System.out.println(HealthPoint);
        }
    }
}
