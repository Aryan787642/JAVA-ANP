import java.util.Scanner;

public class PassOrFail
 {
    public static void main(String[] args)
       {
        Scanner sn = new Scanner(System.in);
        
        System.out.print("Enter your marks: ");
        int marks = sn.nextInt();
        
    
        String result = (marks >= 40) ? "Pass" : "Fail"; 
       
        System.out.println(result);
        

     }
 }
