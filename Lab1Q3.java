//Write a Program to accept two integers as
//inputs and print their sum
import java.util.Scanner;
public class Lab1Q3 
{
    static int num1;
    static int num2;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to input : ");
        num1 = sc.nextInt();
        System.out.println("enter the number to input : ");
        num2 = sc.nextInt();
        System.out.println("the sum of the 2 numbers is : " + (num1 + num2));

    }
}
