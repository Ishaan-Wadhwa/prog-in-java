// Program to find ASCII code of a
// character 
import java.util.Scanner;
public class lab1q2 
{
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number to convert to ASCII code");
    char chr = sc.next().charAt(0);
    System.out.println("the ascii code of this character is " + (int)chr);
}    
}
