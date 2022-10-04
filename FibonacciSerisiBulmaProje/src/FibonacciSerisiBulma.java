import java.util.Scanner;

public class FibonacciSerisiBulma {

    static int fib(int n) {

        if (n == 2 || n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n değerini giriniz : ");
        int n = input.nextInt();
        if (n > 0) {
            System.out.println(fib(n));
        } else {
            System.out.println("Hatalı değer girdiniz.");
        }
    }
}