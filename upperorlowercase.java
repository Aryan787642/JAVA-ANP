import java.util.Scanner;

public class upperorlowercase
 {
    public static void main(String args[])
       {
        Scanner sn = new Scanner(System.in);
        
        System.out.println("Enter a character: ");
        char ch = sn.next().charAt(0);  
        
        String result = (ch >= 'A' && ch <= 'Z') ? "Uppercase" : (ch >= 'a' && ch <= 'z') ? "Lowercase" : "Not a letter";
        
      
        System.out.println(result);
        
       }
 }
