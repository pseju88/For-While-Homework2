import java.util.Scanner;

public class Sum_ofFirst_andLastDigit_14
{
    public static void main(String[] args) // Main Method declared
    {
        // Variable declared
        int number;
        int sum ;
        int first;
        int last;
        Scanner scanner = new Scanner(System.in);  // Scanner Object
        System.out.println("Enter any Five Digit Number : "); //Get input from the user
        number=scanner.nextInt();
        last = number%10;

        while (number>9) //Declaring While loop
        {
            number = number/10;
        }
        sum = last + number;
        System.out.println("Sum of First and Last Digit of Number is :" + sum); //output user input
    }
}
