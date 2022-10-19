import java.util.Scanner;

public class Sum_ofOddEven_11
{
    public static void main(String[] args) // main method
    {
        System.out.println("Enter the number :"); // Get user input
        Scanner scanner = new Scanner(System.in); // Create scanner object
        java.lang.String input = scanner.nextLine();
        scanner.close();
        int oddSum = 0;
        int evenSum = 0;
        //Declaring For Loop
        for (int i = 0; i < input.length(); i++)
        {
            int digit = input.charAt(i) - '0';

            if (digit % 2 == 0)
            {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
        }
        System.out.printf("The sum of the odd digits are = %d\n", oddSum);//Display result for sum og odd number
        System.out.printf("The sum of the even digits are = %d", evenSum);// Display result for sum of even number
    }
}
