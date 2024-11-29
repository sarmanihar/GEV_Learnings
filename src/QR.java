import java.util.Scanner;

/*
6.Java Program to Compute Quotient and Remainder
*/
public class QR {
    public static void getQR(){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter dividant");
        int a=scanner.nextInt();

        System.out.println("Enter divider");
        int b=scanner.nextInt();

        int Q=a/b;
        int r=a%b;
        System.out.println("Quotient : "+Q);
        System.out.println("Remainder : "+r);
    }
}
