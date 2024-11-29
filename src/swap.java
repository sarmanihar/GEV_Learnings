import java.util.Scanner;

/*
Java Program to Swap Two Numbers
*/
public class swap {
    public static void swap(){
        System.out.println("Enter the two numbers");
        double a,b;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextDouble();
        b=scanner.nextDouble();
        double tmp=a;
        a=b;
        b=tmp;
        System.out.println("After swapping ");
        System.out.println("a : "+a+" "+"b : "+b);
        scanner.close();
    }
}
