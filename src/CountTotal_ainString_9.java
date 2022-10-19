import java.util.Scanner;

public class CountTotal_ainString_9
{
    //main method
    public static void main(String[] args) {
    // Declaring variable
    java.lang.String str;
    char ch , a;
    int x,i,y=0;
    Scanner scanner = new Scanner(System.in); //create scanner object
    System.out.println("Enter String");
    str = scanner.nextLine();
    System.out.println("Enter any Character to find how many number of te given character is present in your String: ");
    ch=scanner.next().charAt(0);
    //logic
    x=str.length();
    for (i = 0; i<x;i++){
        a=str.charAt(i);
        if (ch==a) y++;
    }
    System.out.println("Total number of selected character is:: "+y); //Print Result
}
}
