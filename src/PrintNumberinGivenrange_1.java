import java.util.Scanner;

public class PrintNumberinGivenrange_1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //  // create a Scanner class.
        System.out.println("Enter Start Number ="); // To take end user input
        int a = scanner.nextInt(); // Read user input
        System.out.println("Enter End Number =");// To take end user input
        int b = scanner.nextInt(); // Read user input

        for (int i = a; i <= b; i++)  // Declaring For Loop
        {
            System.out.println("Printout = " + i); // output user input
        }
    }
}