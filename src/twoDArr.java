/*
1.2D Array
a. Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from
standard input and printing them out to standard output.
b. I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
c. Logic -> create 2 dimensional array in memory to read in M rows and N cols
d. O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with
OutputStreamWriter to print the output to the screen.
*/
import java.util.Arrays;
import java.util.Scanner;

public class twoDArr {
    public static void print2darr(){
        int m,n;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter no of rows and columns");
        m=scanner.nextInt();
        n=scanner.nextInt();
        System.out.println("Enter the array inputs");
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
