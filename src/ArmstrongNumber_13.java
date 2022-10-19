import java.util.Scanner;

public class ArmstrongNumber_13
{
    //Declaring Main method
    public static void main(String[] arg)
    {
        int a,arm=0,n,temp; // Declaring Variable
        Scanner sc=new Scanner(System.in); // Create Scanner object
        System.out.println("Enter a 3 digit number = "); // Get user input
        n=sc.nextInt();
        temp=n;
        // Declaring For Loop
        for( ;n!=0;n/=10 )
        {
            a=n%10;
            arm=arm+(a*a*a);
        }
        if(arm==temp)
            System.out.println(temp+" is an armstrong number : "); //Result
        else
            System.out.println(temp+" is not an armstrong number : "); //Result
    }
}
