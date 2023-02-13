package introduce_to_java;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        int  VND, USD;

        System.out.println("Nhập USD");
        Scanner sc = new Scanner(System.in);
        USD = sc.nextInt();
        VND = USD *23000;
        System.out.println("Tiền việt quy đổi là : "+VND);
    }
}
