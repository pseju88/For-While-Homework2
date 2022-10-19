import java.util.Scanner;

public class PalindromeNumber_12
{
    //Declaring Main method
    public static void main(String[] args)
    {
        // Declare variable
        int n ,c , s= 0,r;
        System.out.println("Enter Any Number :"); // Get User input
        Scanner ref=new Scanner(System.in); // Create scanner object
        n= ref.nextInt(); // Local Variable declared
        c=n;
        //Declaring While Loop
        while (n>0)
        {
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if(c==s)
            System.out.println("NUmber is Palindrome Number ="); //Display resul
        else
            System.out.println("NUmber is Not Palindrome Number = "); // Display result
    }
}
