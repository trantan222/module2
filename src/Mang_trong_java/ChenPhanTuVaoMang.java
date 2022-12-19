package Mang_trong_java;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ChenPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n phần tử");
        int n = sc.nextInt();
        int arr [] = new int[n];
        for (int i = 0; i < n ; i++) {
            System.out.println("Nhập phần tử tại vị trí thứ "+i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng ban đầu "+Arrays.toString(arr));
        System.out.println("Nhập phần tử x cần chèn");
        int x = sc.nextInt();
        System.out.println("Nhập vị trí cần chèn");
        int index = sc.nextInt();
        int lengthArr2 = n+1;
        int  arr2 [] = new int[lengthArr2];
        int check = 0;
        for (int i = 0; i < arr2.length ; i++) {
            if (i == index){
                arr2[i] = x;
                check ++;
                continue;
            }
            arr2[i] = arr[i-check];
        }
        System.out.println("Mảng sau khi được thêm phần tử : "+Arrays.toString(arr2));
    	}
    }

