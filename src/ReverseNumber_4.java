import java.util.Scanner;

public class ReverseNumber_4
{

    //Declaring Main method
    public static void main(String args[])
    {
        // Declaring Local variable
        int num=0;
        int reversenum =0;

        System.out.println("Input your number and press enter: "); // Get input From User
        Scanner in = new Scanner(System.in); // Creating  Scanner Object

        num = in.nextInt();

        //While Loop: Logic to find out the reverse number
        while( num != 0 )
        {
            reversenum = reversenum * 10;
            reversenum = reversenum + num%10;
            num = num/10;
        }

        System.out.println("Reverse of input number is: "+reversenum); // Display Final Input
    }
}
