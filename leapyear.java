
import java.util.Scanner;
public class leapyear
{
         public static void main(String[] args)
         {
         Scanner sn = new Scanner(System.in);
         
         System.out.println("Enter a year: ");
         
          int year = scanner.nextInt();
         
         String result = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ?"is a leap year" : "is not a leap year";
          System.out.println(year + " " + result);

         }
}