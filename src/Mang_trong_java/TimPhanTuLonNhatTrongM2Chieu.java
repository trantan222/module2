package Mang_trong_java;

import java.util.Arrays;
import java.util.Scanner;

public class TimPhanTuLonNhatTrongM2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input row");
        int row = sc.nextInt();
        System.out.println("input column");
        int column = sc.nextInt();
        int arr[][] = new int[row][column];
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                System.out.println("input number");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array : "+ Arrays.deepToString(arr));
        int max = arr[0][0];
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max : "+max);
    }
}
