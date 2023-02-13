package demo;

import java.util.Arrays;

public class run {
    public static final int INT = -1;

    public static void main(String[] args) {
        int arr [] = {3,5,6,19,13,10};
        Arrays.sort(arr);
        int index = demo.binarySearch(arr,10);
        if(index == INT){
            System.out.println("Khong tim thay");
        } else {
            System.out.println("Tim thay vi tri "+index);
        }
    }
}
