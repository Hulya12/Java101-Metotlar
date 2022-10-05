import java.util.Scanner;

public class DeseneGoreMetotOlusturma {

    static void Desen(int sayi) {

        int a = sayi - 5;
        if (a >= -4) {
            System.out.print(a + " ");
            Desen(a);

            int b = a + 5;

            if (b <= sayi) {
                System.out.print(b + " ");
            }
        }
    }
    public static void main(String[] args) {
        //Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
        //Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
        //Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
        // Yine her ekleme işleminde sayının son değerini ekrana yazdırın.

        Scanner scan =new Scanner(System.in);

        System.out.print("Lütfen Sayıyı Giriniz : ");
        int sayi1 = scan.nextInt();

        System.out.println( sayi1 + " ");
        Desen(sayi1);

    }
}
