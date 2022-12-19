package vong_lap_trong_java;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        System.out.println("Menu:\n" +
                "\n" +
                "1.Print the rectangle\n" +
                "\n" +
                "2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)\n" +
                "\n" +
                "3.Print isosceles triangle\n" +
                "\n" +
                "4.Exit");
        System.out.println("Nhập sự lựa chọn !!!!");
        Scanner sc = new Scanner(System.in);
        int luachon ;
        do{
            luachon = sc.nextInt();
            if(luachon ==1){
                for (int i = 1; i <=3 ; i++) {
                    for (int j = 1; j <=6 ; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            } else if(luachon ==2){
                for (int i = 1; i <=5 ; i++) {
                    for (int j = 1; j <= i ; j++) {
                            System.out.print("*");
                    }
                    System.out.println();
                }
            }else if(luachon ==3){
                for(int i=7;i>=1;i--){
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }while(luachon !=4);
    }

}
