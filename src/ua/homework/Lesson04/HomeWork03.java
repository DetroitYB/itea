package ua.homework.Lesson04;

import javax.xml.soap.SOAPBody;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork03 {

    public static void diplayArray(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void main(String[] args) {

        String[][] arr = new String[][]{{"@", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_"},
                {"_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_"},
                {"_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_"},
                {"_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_"},
                {"_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_"},
                {"_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_"},
                {"_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_"},
                {"_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_"},
                {"_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_"},
                {"_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_"}
        };
        boolean IsWinner = false;
        String elementOfArray = null;
        int HealthPoint = 100;
        int PosOFHeroVer = 0;
        int PosOFHeroHorizontal = 0;
        int bomb = 0;
        int aid = 0;
        for (int i = 0; i < arr.length; i++) {
            do {
                bomb = (int) (Math.random() * (arr.length - 2) + 1); //Bomb
                aid = (int) (Math.random() * (arr.length - 2) + 1); //aid
            } while (bomb == aid);
            arr[i][bomb] = "*";
            arr[i][aid] = "+";
            System.out.println(Arrays.toString(arr[i]));
        }

        Scanner scanner = new Scanner(System.in);
        while (!(IsWinner)) {
            switch (scanner.next()) {
                case "a":
                    if (PosOFHeroHorizontal == 0) {
                        arr[PosOFHeroVer][PosOFHeroHorizontal] = "_";
                        PosOFHeroHorizontal = arr[PosOFHeroVer].length - 1;
                        elementOfArray = arr[PosOFHeroVer][PosOFHeroHorizontal];
                        arr[PosOFHeroVer][PosOFHeroHorizontal] = "@";
                    } else {
                        arr[PosOFHeroVer][PosOFHeroHorizontal--] = "_";
                        elementOfArray = arr[PosOFHeroVer][PosOFHeroHorizontal--];
                        arr[PosOFHeroVer][PosOFHeroHorizontal] = "@";
                    }
                    break;

                case "d":
                    if (!(PosOFHeroHorizontal == arr[PosOFHeroVer].length - 1)) {
                        arr[PosOFHeroVer][PosOFHeroHorizontal++] = "_";
                        elementOfArray = arr[PosOFHeroVer][PosOFHeroHorizontal];
                        arr[PosOFHeroVer][PosOFHeroHorizontal] = "@";
                        System.out.println(PosOFHeroHorizontal);
                    }
                    break;
                case "s":
                    if (PosOFHeroVer == arr.length - 1) {
                        arr[PosOFHeroVer][PosOFHeroHorizontal] = "_";
                        PosOFHeroVer = 0;
                        elementOfArray = arr[PosOFHeroVer][PosOFHeroHorizontal];
                        arr[PosOFHeroVer][PosOFHeroHorizontal] = "@";
                    } else {
                        arr[PosOFHeroVer++][PosOFHeroHorizontal] = "_";
                        elementOfArray = arr[PosOFHeroVer][PosOFHeroHorizontal];
                        arr[PosOFHeroVer][PosOFHeroHorizontal] = "@";
                    }
                    break;
                case "w":
                    if (!(PosOFHeroVer == 0)) {
                        arr[PosOFHeroVer--][PosOFHeroHorizontal] = "_";
                        elementOfArray = arr[PosOFHeroVer][PosOFHeroHorizontal];
                        arr[PosOFHeroVer][PosOFHeroHorizontal] = "@";
                    }
                    break;
            }
            if(elementOfArray.equals("+")){
                HealthPoint += 15;
            }else if(elementOfArray.equals("*")){
                HealthPoint -= 15;
            }else{
                HealthPoint -=5;
            }
            System.out.println(HealthPoint);
            diplayArray(arr);
            if (PosOFHeroVer == arr.length - 1 && PosOFHeroHorizontal == arr[arr.length - 1].length - 1) {
                IsWinner = true;
            }
            if (HealthPoint == 0) {
                break;
            }
        }
        System.out.println(IsWinner ? "Winner" : "Loser");
    }
}