package Mang_trong_java;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner;
public class TinhTongCacSoDuongCheoMaTranVuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input row");
        int r = sc.nextInt();
        System.out.println("input column");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("input number in ["+ i +"] "+"["+j+"]"+" : ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        int tongDuongCheo = 0;
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                if(i == j){
                    tongDuongCheo += arr[i][j];
                }
            }
        }
        System.out.println("tổng : "+tongDuongCheo);

    }
}
