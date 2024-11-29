import java.util.Scanner;

/*
Java Program to Check Whether an Alphabet is Vowel or Consonant
*/
public class vORc {
    public static void vORc(){
        System.out.println("Enter the letter");
        Scanner scanner=new Scanner(System.in);
        char c=scanner.next().toLowerCase().charAt(0);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            System.out.println("Its Vowel");
        }
        else{
            System.out.println("Its consonant");
        }
        scanner.close();
    }
}
