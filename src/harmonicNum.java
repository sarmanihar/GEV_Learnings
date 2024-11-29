import java.util.Scanner;

/*
4.Harmonic Number
a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
(http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
b. I/P -> The Harmonic Value N. Ensure N != 0
c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
d. O/P -> Print the Nth Harmonic Value.
*/
public class harmonicNum {
    public static void getHN(){
        System.out.println("Enter N");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        double sum=0;
        for(int i=1;i<=n;i++){
            sum+=1.0/i;
        }
        System.out.println("Harmonic value is : "+sum);
    }
}
