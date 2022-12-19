package Mang_trong_java;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1 [] = new int[2];
        int arr2 [] = new int[2];
        for (int i = 0; i <arr1.length ; i++) {
            System.out.println("Nhập  của mảng 1 phần tử tại vị trí thứ "+i);
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i <arr2.length ; i++) {
            System.out.println("Nhập  của mảng 2 phần tử tại vị trí thứ "+i);
            arr2[i] = sc.nextInt();
        }
        int m =arr2.length;
        int n = arr1.length + m;
        int arr3[] = new int[n];
        for (int i = 0; i < arr1.length ; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i <arr2.length ; i++) {
            arr3[m] = arr2[i];
            m++;
        }
        for (int i = 0; i <arr3.length ; i++) {
            System.out.print(arr3[i]+" ");
        }
    }
}
