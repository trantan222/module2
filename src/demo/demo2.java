package demo;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        String string;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi");
        string = sc.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i <string.length() ; i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i+1; j <string.length() ; j++) {
                if(string.charAt(j) > list.getLast()){
                    list.add(string.charAt(j));
                }
            }
            if(list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

    }
}
