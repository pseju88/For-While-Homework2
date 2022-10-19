import java.util.Scanner;

public class Sum_of5Digit_10
{
    public static void main(String[] args) //Declaring Main method
    {
        int n,r,sum=0; // Declare Variable
        System.out.println("Enter any  5 Number :"); // Get User input
        Scanner ref =new Scanner(System.in); // Create Scanner Object
        n=ref.nextInt();
        while (n>0) // Declare While Loop
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println("Sum of Digit = "+ sum); //Final Result
    }
}
