import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    static final int maxi=1000;
    static boolean[] isPrime=new boolean[maxi+1];

    public static void sieve(){
        Arrays.fill(isPrime, true);
        isPrime[0]=isPrime[1]=false;
        for(int i=2;i*i<=maxi;i++){
            if(isPrime[i]) {
                for (int j = i * i; j <= maxi; j += i) {
                    if (j % i == 0) {
                        isPrime[j] = false;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
//        factors.printFactors();





    }
}