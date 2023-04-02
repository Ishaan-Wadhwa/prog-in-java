// Initialize two
// -character variables in a
// program and display the characters in
// alphabetical order.      
import java.util.Scanner;
public class lab2q1 
{
    public static void main(String args[])
    {
char ch1,ch2;
Scanner sc = new Scanner(System.in);
System.out.print("enter the first character: ");
ch1 = sc.nextLine().charAt(0);
System.out.print("enter the second character: ");
ch2 = sc.nextLine().charAt(0);
if(ch1<ch2)
{
    System.out.println("alphabetical order : "+ ch1 +" "+ ch2);
}
else
{
    System.out.println("alphabetical order : "+ ch2 + " "+ ch1);
}
    }
}
