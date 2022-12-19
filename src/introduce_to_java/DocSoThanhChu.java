package introduce_to_java;

import java.util.Scanner;

public class DocSoThanhChu {
     static String donVi[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
            "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen"};
     static String [] chuc = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so");
        int n = sc.nextInt();
        if(n < 20) {
            System.out.println(kiemTraMotChuSo(n));
        } else if(n <100){
            System.out.println(kiemTra2chuSo(n));
        } else {
            System.out.println(kiemTra3ChuSo(n));
        }
    }
    public static String kiemTraMotChuSo(int n){
        return donVi[n];
    }
    public static String kiemTra2chuSo(int n ){
        if(n % 10==0){
            return chuc[n/10-2];
        }
        return chuc[n/10-2] + "  " + donVi[n%10];
    }
    public static String kiemTra3ChuSo(int n ){
        if(n % 100 == 0){
            return donVi[n/100] +"hundred" ;
        } else if(n %100 <20){
            return donVi[n/100] +"hundred and " + kiemTraMotChuSo(n%100);
        }
         return donVi[n/100] +"hundred and " + kiemTra2chuSo(n%100);
    }
}
