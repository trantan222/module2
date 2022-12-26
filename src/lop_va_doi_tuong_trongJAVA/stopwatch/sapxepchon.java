package lop_va_doi_tuong_trongJAVA.stopwatch;

import java.util.Random;

public class sapxepchon {
    void sort(int arr[]) {
        int n = arr.length;

        // Duyệt qua từng phần tử của mảng
        for (int i = 0; i < n - 1; i++) {

            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    // Xuất mảng
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[10000];

        sapxepchon s2 = new sapxepchon();
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }
        StopWatch s = new StopWatch();
        s2.sort(arr);
        s.stop();
        System.out.println(s.getElapsedTime());
    }
}