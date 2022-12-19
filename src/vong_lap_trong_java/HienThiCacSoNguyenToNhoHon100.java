package vong_lap_trong_java;

public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        System.out.println("Hiển thị số nguyên tố nhỏ hơn 100 !!!");
        int A = 2;
        while( A < 100){
            if(isPrime(A)){
                System.out.print( A + " ");
            }
            A++;
        }
    }
    public static boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        for (int i = 2; i <Math.sqrt(n) ; i++) {
            if( n % i == 0){
                return false;
            }
        }
        return true;
    }
}
