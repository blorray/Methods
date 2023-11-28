
import java.util.Scanner;

public class methods
 
{

    public static void main(String[] args)
 
{
        Scanner scanner = new Scanner(System.in);
  System.out.println("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.println("Enter the third number: ");
        int number3 = scanner.nextInt();

        int smallestNumber = Math.min(Math.min(number1, number2), number3);
        int largestNumber = Math.max(Math.max(number1, number2), number3);

        System.out.println("The smallest number: " + smallestNumber);
        System.out.println("The largest number: " + largestNumber);

        System.out.println(largestNumber + " is your largest and " + smallestNumber + " is your smallest number.");
    }
}