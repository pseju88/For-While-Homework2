public class Print_Number_divided_by3and5_7
{
    public static void main(String args[])     //Declaring Main method

    {
        System.out.println("\nDivided by 3: "); //  first input
        for (int i = 1; i < 100; i++) // Declare For Loop
        {
            if (i % 3 == 0) // Condition for Number Dived by 3
                System.out.print(i + ", "); //Display Result
        }

        System.out.println("\n\nDivided by 5: "); //  Second input
        for (int i = 1; i < 100; i++) // Declare For Loop
        {
            if (i % 5 == 0) // Condition for Number Dived by 3
                System.out.print(i + ", "); // Display Result
        }

        System.out.println("\n\nDivided by 3 & 5: "); //  third input
        for (int i = 1; i < 100; i++)  // Declare For Loop
        {
            if (i % 3 == 0 && i % 5 == 0) // Condition for Number Dived by 3 and 5
                System.out.print(i + ", "); // Display Result
        }
        System.out.println("\n"); // for New line
    }
}
