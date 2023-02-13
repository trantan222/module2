package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoiNhiPhan {
    public static void main(String[] args) {
        Stack<Integer> Stack = new Stack<>();
        Scanner prompt = new Scanner(System.in);
        System.out.println("Nhập số vào: ");
        int Number = prompt.nextInt();
        while (Number !=0){
            int numberThapPhan = Number%2;
            Stack.push(numberThapPhan);
            Number /= 2;
        }
        System.out.println("Số nhị phân là");
        while (!(Stack.isEmpty())){
            System.out.print(Stack.pop());
        }
    }
}
