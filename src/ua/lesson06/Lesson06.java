package ua.lesson06;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson06 {
        public static void main(String[] args) {
            int countOfElements = 3;
            int start = 0;
            Scanner in = new Scanner(System.in);
            String[][] arr = new String[start][countOfElements];
            do {
                String[][] arr1 = new String[start+1][countOfElements];
                System.arraycopy(arr, 0, arr1, 0, arr.length);
                arr = arr1;
                String[] inputData = in.nextLine().split(";");
                arr[start] = inputData;
                start++;
                System.out.println(Arrays.deepToString(arr));

            }while(arr.length != 5);

            do {
                String[] input = in.nextLine().split(",");
                for(int i = 0; i < arr.length; i++){
                    for(int j = 0; j < arr[i].length; j++){
                        for(int k = 0; k<input.length; k++){
                            if(arr[i][j].toLowerCase().contains(input[k])){
                                System.out.println(Arrays.toString(arr[i]));
                            }
                        }
                    }
                }
            }while(true);
    }
}

