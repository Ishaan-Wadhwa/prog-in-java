import java.util.Scanner;
public class lab1Q1 
{
    static String name;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of yours: ");
        name = sc.nextLine();
        System.out.println("welcome "+ name);
    }
}                   
