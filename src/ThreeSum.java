import java.util.ArrayList;
import java.util.HashSet;
import java.awt.*;
import java.util.*;
import java.util.List;
/*
Sum of three Integer adds to ZERO
a. Desc -> A program with cubic running time. Read in N integers and counts the
number of triples that sum to exactly 0.
b. I/P -> N number of integer, and N integer input array
c. Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
d. O/P -> One Output is number of distinct triplets as well as the second output is to print the distinct triplets.
*/
public class ThreeSum {
    public static void threeSum(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the no of integers");
        int n=scanner.nextInt();
        System.out.println("Enter the elements");
        ArrayList<Integer> arr=new ArrayList<>();
        int in;
        for(int i=0;i<n;i++){
            in=scanner.nextInt();
            arr.add(in);
        }
        int ans=0;
        Set<List<Integer>> S=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr.get(i)+arr.get(j)+arr.get(k)==0){
                        S.add(Arrays.asList(arr.get(i),arr.get(j),arr.get(k)));
                    }
                }
            }
        }
        for(List<Integer>  triplate:S) {
            System.out.println(triplate);
        }
    }
}
