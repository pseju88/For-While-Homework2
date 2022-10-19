import java.util.Scanner;

public class SumofnNaturalNumber_6
{
    //Declare Variable
    static int i ,n, sum=0;

    public static void main(java.lang.String[] args)     //Declaring Main method

    {
        System.out.println("Enter Any Number : "); //Get user input

        Scanner ref = new Scanner(System.in); // Create scanner object
        n=ref.nextInt();
        // Declare For Loop
        for(i=1;i<=n;i++)
        {

            sum=sum+i;
        }
        System.out.println(" Addition = " +sum); // Display Final output

    }
}
