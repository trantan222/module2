package vong_lap_trong_java;

import java.util.Scanner;

public class HienThi20SNT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong so nguyen to can in");
        int Numbers = sc.nextInt();
        int count =0;
        int N = 2;
        while (count < Numbers){
           if(isPrime(N)){
               System.out.print( N +" ");
           }
            N++;
           count++;
        }
    }
    public static boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if( n % i ==0){
                return false;
            }
        }
        return true;
    }
}
