/*
1.Flip Coin and print percentage of Heads and Tails
    a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
    b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or
    heads
    c. O/P -> Percentage of Head vs Tails
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FCP1 {
    public static void printHT(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("The number of times to Flip Coin");
        int n=scanner.nextInt();
        double op;
        float tc=0,hc=0;
        for(byte i =0;i<n;i++){
            op=Math.random();
            if(op<0.5){
                tc++;
            }
            else{
                hc++;
            }
        }
        float ph=(hc/n)*100;
        ph=Math.round(ph*100)/100.0f;
        System.out.println("Percentage of Head : "+ph);

        float pt=(tc/n)*100;
        pt=Math.round(pt*100)/100.0f;
        System.out.println("Percentage of tails : "+pt);
    }
}
