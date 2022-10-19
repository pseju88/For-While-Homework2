import java.util.Scanner;

public class FactorialNumber_5
{
    public static void main(String[] args)     //Declaring Main method
    {
        //Declaring Local variable

        int n, fact=1 ;

        System.out.println("Enter Any Number : "); //To take end user input
        Scanner ref = new Scanner(System.in); // create Scanner Object
        n=ref.nextInt();
        // Declaring For Loop
        for(int i = 1; i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial Number" + fact); //Final output
    }
}
