import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print("1.Sayıyı Giriniz : ");
        int sayi1=scanner.nextInt();
        System.out.print("2.Sayıyı Giriniz : ");
        int sayi2=scanner.nextInt();
        System.out.print("3.Sayıyı Giriniz : ");
        int sayi3=scanner.nextInt();
        int enBüyük=0;

        if (enBüyük<sayi1){
            enBüyük=sayi1;
        }
        if (enBüyük<sayi2){
            enBüyük=sayi2;
        }
        if (enBüyük<sayi3){
            enBüyük=sayi3;
        }
        System.out.println("En Büyük Sayi : "+enBüyük);



    }
}
