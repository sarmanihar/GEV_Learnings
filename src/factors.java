import java.util.Scanner;

/*
5.Factors
a. Desc -> Computes the prime factorization of N using brute force.
b. I/P -> Number to find the prime factors
c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
d. O/P -> Print the prime factors of number N.
*/
public class factors {
    public static void printFactors(){
        Main.sieve();
        System.out.println("Enter the input");
        int n;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(Main.isPrime[i]) {
                    System.out.println(i);
                }
                if(Main.isPrime[n/i]){
                    System.out.println(n/i);
                }
            }
        }
    }
}
