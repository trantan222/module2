package Mang_trong_java;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,2,4,5,6};
        System.out.println("Mảng ban đầu : "+ Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử cần xóa");
        int x = sc.nextInt();
        int c = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] != x){
                arr[c] = arr[i];
                c++;
            }
        }
        int n = arr.length;
        n = c;
        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
