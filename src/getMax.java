/*
Java Program to Find the Largest Among Three Numbers
*/
import java.util.Scanner;

public class getMax {
    public static void getMax(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the three numbers");
        double a,b,c;
        a=scanner.nextDouble();
        b=scanner.nextDouble();
        c=scanner.nextDouble();

        if(a>=b && a>=c){
            System.out.println(a);
        }
        else if(b>=a && b>=c){
            System.out.println(b);
        }
        else
            System.out.println(c);
    }
}
