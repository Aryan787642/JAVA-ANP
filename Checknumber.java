import java.util.Scanner;

public class Checknumber
 {
    public static void main(String args[])
      {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();  
        
        String result = (number > 0) ? "The number is positive." : (number < 0) ? "The number is negative." :
                        "The number is zero.";
        
        
        System.out.println(result);
        
        
      }
 }
