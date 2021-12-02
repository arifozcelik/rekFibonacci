package kitapSonuOrnekleri;

import java.util.Scanner;

public class rekFibonacci {

        //özyinelemli fib isimli fonksiyon
        static int fib(int n){
            int fb;
            if (n == 0 || n==1)
                fb=n;
            else
                fb = fib(n-1) + fib(n-2);
            return fb;
        }//fib sonu

    public static void main(String[] args) {
        System.out.printf("Kaçıncı eleman:");
        int n;
        Scanner gir = new Scanner(System.in);
        n = gir.nextInt();
        System.out.printf("%d.eleman:%d",n,fib(n));
    }
}
