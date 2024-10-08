import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

      
        System.out.print("Enter employee salary: ");
        double salary = sn.nextDouble();

        System.out.print("Enter employee's experience ");
        int experience = sn.nextInt();

       
        double bonus = (experience > 20) ? (0.20 * salary) : (0.10 * salary);


        System.out.println("The bonus for the employee is: "+ Bonus);
    }
}
