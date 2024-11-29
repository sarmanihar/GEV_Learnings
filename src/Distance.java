import java.util.Scanner;
/*
Write a program Distance.java that takes two integer command-line arguments x
and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
*/
public class Distance {
    public static void calcDist(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter x and Y co ordinate");
        double x,y;
        x=scanner.nextInt();
        y=scanner.nextInt();
        double dist=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.println("Distance is : "+dist);
    }
}
