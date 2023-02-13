package StackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
        public static void main(String[] args) {

            System.out.println("Điền chuỗi vào: ");
            Scanner prompt = new Scanner(System.in);
            String value = prompt.nextLine();



            Queue queue= new LinkedList();


            Stack Stack =new Stack<>();


            for (int i = 0; i < value.length() ; i++) {
                Stack.push(value.charAt(i));
            }
            for (int i =0;i < value.length()-1;i++){
                queue.add(value.charAt(i));
            }


            boolean isPalindrome = true;

            while (!queue.isEmpty()) {

                if (queue.remove().equals(Stack.pop())){
                    continue;
                } else {
                    isPalindrome=false;
                    break;
                }
            }
            if (!isPalindrome) {
                System.out.println("Không phải Palindrome");
            } else {
                System.out.println("Palindrome");
            }
        }
    }

