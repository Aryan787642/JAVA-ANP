import java.util.Scanner;

public class evenodd  
{
    public static void main(String args[])
       {
        
        Scanner sn = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num. = sn.nextInt();
        
        String result = (number % 2 == 0) ? "The number is even." : "The number is odd.";
        
        System.out.println(result);
        
        
       }
 }
