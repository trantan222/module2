package Mang_trong_java;

import java.util.Scanner;

public class DemSoLanXuatHienKiTuTrongChuoi {
    public static void main(String[] args) {
                char kitu = 'a';
                String str ;
                System.out.println("Nhập vào 1 chuỗi : ");
                Scanner sc = new Scanner(System.in) ;
                 str = sc.nextLine();
                int count = 0;
                for (int i = 0; i <str.length() ; i++) {
                    if(str.charAt(i) == kitu){
                        count++;
                    }
                }
                 System.out.println("Chuỗi ban đầu "+str);
                System.out.println("có "+count+" Kí tự "+kitu+" lần Xuất hiên trong chuỗi ");
            }
        }

