package thuat_toan_sap_xep;

import java.util.Scanner;

public class insertionSort {
    public static void insertSort(int array[]){
        int j , t;
        for (int i = 1; i <array.length ; i++) {
             j = i - 1;
             t = array[i];
            while(j >=0 && t < array[j] ){
                array[j+1] = array[j];
                j--;
            }
            array[j + 1] = t;
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i] +" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhap so luong phan tu");
        n = sc.nextInt();
        int arr [] = new int[n];
        for (int i = 0; i < n ; i++) {
            System.out.println("nhap phan tu thu "+i +":");
            arr[i] = sc.nextInt();
        }
        insertSort(arr);
    }
}
