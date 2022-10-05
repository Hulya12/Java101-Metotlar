import java.util.Scanner;

public class GelismisHesapMakinesi {

    static void plus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz : ");
        int counter = scan.nextInt();
        int number, result = 0;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                result += number;
            }
            result += number;

        }
        System.out.println("Sonuç : " + result);
    }

    static int minus() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci sayiyi  girin :");
        int a = inp.nextInt();
        System.out.print("Ikinci sayiyi  girin :");
        int b = inp.nextInt();
        return a - b;

    }
    static int times() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci sayiyi  girin :");
        int a = inp.nextInt();
        System.out.print("Ikinci sayiyi  girin :");
        int b = inp.nextInt();
        if(b==0){
            System.out.println("Bir işlemin 0 ile çarpımı 0'dır.");
            return 0;
        }
        if(a==0){
            System.out.println();
            return 0;
        }
        int result = a*b;
        System.out.println("Sonuç : "+result);
        return result;

    }
    static double divided() {
        Scanner inp = new Scanner(System.in);
        int right = 4;
        double result = 0;
        while (right > 0) {
            System.out.print("Birinci sayiyi  girin :");
            double a = inp.nextDouble();
            System.out.print("Ikinci sayiyi  girin :");
            double b = inp.nextDouble();
            result = a / b;


            if (b == 0) {
                right--;
                System.out.println("Bölen sıfır olamaz!");
                if (right == 0) {
                    System.out.println("Hiç Hakkınız Kalmadı ! ");
                    break;
                } else {
                    System.out.println( right + " Hakkınız Kaldı ");
                }
            }

            System.out.println("Sonuç : " + result);


        }
        return result;
    }
     static int power(int base,int exponent) {

         Scanner input = new Scanner(System.in);
         int right = 4;
         int result = 1;
         while (right > 0) {
             System.out.print("Taban değerini giriniz :");
             base = input.nextInt();
             System.out.print("Üs Değerini Giriniz : ");
             exponent = input.nextInt();


             if (base == 0 && exponent == 0) {
                 right--;
                 System.out.println("Taban ve üst değeri aynı anda sıfır olamaz !");
                 if (right == 0) {
                     System.out.println("Hiç Hakkınız Kalmadı!");
                     break;
                 }
                 System.out.println(right + "Hakkınız kaldı");
             } else {
                 for (int i = 1; i <= exponent; i++) {
                     result *= base;
                     System.out.println("Sonuç : " + result);
                 }
             }
         }
         return result;
     }

    static void mod(){
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen mod almak için ilk değeri giriniz : ");
        int a = input.nextInt();
        System.out.print("Lütfen mod almak için ikinci değeri giriniz : ");
        int b = input.nextInt();
        int result = a%b;
        System.out.println("İşlem Sonucunuz : "+result);

    }
    static void calt(){
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen büyük kenarı giriniz : ");
        int a = input.nextInt();

        System.out.print("Lütfen küçük kenarı giriniz : ");
        int b = input.nextInt();

        System.out.println("Çevresi : "+2*(a+b));
        System.out.println("Alanı : "+(a*b));
    }
    static void factorial(){
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen Sayıyı Giriniz : ");
        int n = input.nextInt();
        int result = 1;
        for(int i =1; i<=n;i++){
            result*=i;
        }
        System.out.println("İşlem Sonucunuz : "+result);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1-Toplama İşlemi \n"
                      +"2-Çıkarma İşlemi\n"
                      +"3-Çarpma İşlemi\n"
                      +"4-Bölme İşlemi\n"
                      +"5-Üslü Sayı Hesaplama İşlemi\n"
                      +"6-Mod Alma İşlemi\n"
                      +"7-Dikdörtgen Alan ve Çevre Hesaplama İşlemi\n"
                      +"8-Faktöriyel Hesaplama İşlemi\n"
                      +"0-ÇIKIŞ";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = input.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power(1,1);
                    break;
                case 6:
                    mod();
                    break;

                case 7:
                    calt();

                case 8:
                    factorial();
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);

    }


        }

