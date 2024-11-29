import java.util.Scanner;

/*
2.Leap Year
    a. I/P -> Year, ensure it is a 4 digit number.
    b. Logic -> Determine if it is a Leap Year.
    c. O/P -> Print the year is a Leap Year or not.
*/
public class leapYear2 {
    public static void isLeap(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Year");
        int a=scanner.nextInt();
        if(a%4==0){
            System.out.println("Its a leap Year");
        }
        else{
            System.out.println("Its not a leap year");
        }
    }
}
