import java.util.Scanner;

/*
Java Program to Check Whether a Number is Even or Odd
*/
public class eORo {
    public static void evORod(){
        System.out.println("Enter the number");
        Scanner scanner=new Scanner(System.in);
        double a=scanner.nextDouble();
        if(a%2==0){
            System.out.println("Its even");
        }
        else{
            System.out.println("Its odd");
        }
        scanner.close();
    }
}
