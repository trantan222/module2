package demo;

public class demo {
    public static final int Not_found = -1;

    public static int binarySearch(int [] arr, int key){
        int begin = 0;
        int end = arr.length -1;
        int mid;
        while(begin <= end ){
            mid = (begin + end )/2;
            if(arr[mid] == key){
                return mid;
            } else if(arr[mid] > key){
                end =  mid - 1;
            }else if (arr[mid] < key){
                begin = mid + 1;
            }
        }
        return Not_found;

    }
}
