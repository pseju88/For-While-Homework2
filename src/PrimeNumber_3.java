import java.util.Scanner;

public class PrimeNumber_3
{
//Declaring Local Variable
    static int number;
    static int count = 0;
    //Declaring Main method
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // create an object of Scanner class
        System.out.print(" Please Enter any Number : "); // Get User input
        int number = scanner.nextInt(); // Define variable inside the Object
        //Declaring For Loop
        for (int i = 1; i <= number; i++)
        {
            // condition for non Prime number
            if (number % i == 0)
            {
                count++;
            }
        }
        if (count == 2)
        {
            System.out.println("Given Number is Prime "); // Final Output
        }
        else
        {
            System.out.println("Given Number is Not Prime"); // Final Output
        }

    }
}
