import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print("1.Enter Number : ");
        int number1=scanner.nextInt();
        System.out.print("2.Enter Number : ");
        int number2=scanner.nextInt();
        System.out.print("3.Enter Number : ");
        int number3=scanner.nextInt();
        int theBiggest=0;

        if (theBiggest<number1){
            theBiggest=number1;
        }
        if (theBiggest<number2){
            theBiggest=number2;
        }
        if (theBiggestk<number3){
            theBiggest=number3;
        }
        System.out.println("Largest Number : "+theBiggest);



    }
}
