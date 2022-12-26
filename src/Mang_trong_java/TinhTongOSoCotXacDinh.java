package Mang_trong_java;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongOSoCotXacDinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input r");
        int r = sc.nextInt();
        System.out.println("input c");
        int c = sc.nextInt();
        int arr [] [] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <c ; j++) {
                System.out.println("input number");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Nhập cột cần tính");
        int cotCanTinh = sc.nextInt();
        int tong = 0;
        for (int i = 0; i <r ; i++) {
                tong+=arr[i][cotCanTinh];
        }
        System.out.println("Tổng cột cần tính : "+tong);
    }
}
