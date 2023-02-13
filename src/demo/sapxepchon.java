package demo;

public class sapxepchon {
    public static void insertionSort(int [] arr){
        int temp , j;
        for (int i = 1; i < arr.length ; i++) {
            j = i -1;
            temp = arr[i];
            while(j >= 0 && temp < arr[j]){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] +" ");
        }
    }
    public static void selectionSort(int [] arr){
        int min;
        for (int i = 0; i <arr.length -1  ; i++) {
            min = i ;
            for (int j = i +1 ; j < arr.length ; j++) {
                if(arr[j] < arr[min]){
                    min = j ;
                }
                if(min != i ){
                    int temp = arr[i];
                    arr[i] = arr[min];
                    arr[min] = temp;
                }
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void BubbleSort(int [] arr ){
        for (int i = 0; i < arr.length -1  ; i++) {
            for (int j = arr.length -1 ; j > i ; j--) {
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j -1];
                    arr[j -1] =  temp;
                }
            }
        }


        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }

        public static void main (String[]args){
            int arr[] = {5, 3, 2, 7, 9, 1};
//            insertionSort(arr);
//            selectionSort(arr);
            BubbleSort(arr);
        }
    }