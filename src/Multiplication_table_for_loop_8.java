import java.util.Scanner;

public class Multiplication_table_for_loop_8
{
    public static void main(String[] args) //Declaring Main method
    {
        int num; // Declaring Local variable
        System.out.println("Enter any Number ="); // Ger user input
        Scanner r = new Scanner(System.in); // Create scanner object
        num= r.nextInt();
        for(int i=1; i<=10;i++) // Declare For Loop
        {
            System.out.println(num+ "*"+i+"="+num*i); //Final result
        }
    }
}
