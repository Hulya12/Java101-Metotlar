import java.util.Scanner;

public class GelismisAsalSayiBulmaProjesi {
    static void prime (int sayi , int b) {
        if (b == sayi) {
            System.out.println(sayi + " bir asal sayıdır.");
            return;

        } else if (sayi % b == 0) {
            System.out.println(sayi + " bir asal sayı değildir.");
            return;

        } else if(sayi<0){
            System.out.println(sayi + " bir asal sayı değildir.");
        }

            prime(sayi, b + 1);


    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        int sayi = scan.nextInt();

        prime(sayi,2);



    }
}
