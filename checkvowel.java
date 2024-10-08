import java.util.Scanner;

   public class checkvowel
{
         public static void main(String args[])
         {
            Scanner sn = new Scanner(System.in);
            

            System.out.println("Enter a character:");
            char ch = sn.next().charAt(0);
              ch = Character.toLowerCase(ch);


            String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ?  "The character is a vowel." : "The character is not a vowel.";
        
     
         System.out.println(result);
         }
}                                    