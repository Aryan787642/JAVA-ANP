import java.util.Scanner;

public class votelegibility {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        System.out.print("Enter age: ");
        int age = sn.nextInt();
        
        String result = (age >= 18) ? "You are eligible to vote." : "You are not eligible to vote.";
        
        System.out.println(result);
        
    }
}
