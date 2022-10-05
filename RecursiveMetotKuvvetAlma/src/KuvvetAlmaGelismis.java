import java.util.Scanner;

public class KuvvetAlmaGelismis {

    static int power(int a , int b){

        if(b==0){
            return 1;
        }

        return power(a,b-1) * a;

    }
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.print("Lütfen Taban Değerini Giriniz : ");
        int a = scan.nextInt();

        System.out.print("Lütfen Üs Değerini Giriniz : ");
        int b = scan.nextInt();

        System.out.println("Sonuç : " +power(a,b));


    }
}
