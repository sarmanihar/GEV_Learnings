import java.util.Scanner;

/*
3.Power of 2
a. Desc -> This program takes a command-line argument N and prints a table of the
powers of 2 that are less than or equal to 2^N.
b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
c. Logic -> repeat until i equals N.
* */
public class pow2 {
    public static void pow2(){
        int n;
        System.out.println("Enter input");
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        long tmp;
        for(int i=0;i<=n;i++){
            tmp=Math.round(Math.pow(2,i));
            System.out.println(tmp);
        }
    }
}
