import java.util.Scanner;

public class FibonacciSeries_2
{public static void main(String[] args) //Declaring Main method
{
    Scanner scanner=new Scanner(System.in); //Scanner object
    System.out.println("enter number of terms"); // Get input from User
    int n=scanner.nextInt();
    int i=0,j=1,nextTerm;
    System.out.println("Fibonacci series is "); //End User Input
    for(int c=0;c<n;c++) // Declaring For Loop
    {
        if(c<=1) // Condition for Fibonacci
            nextTerm=c;
        else
        {
            nextTerm=i+j;
            i=j;
            j=nextTerm;
        }
        System.out.println(nextTerm);
    }
}
}
