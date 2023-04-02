// Write a program to print even numbers
// between 23 and 57. Each number should
// be printed in a separate row
public class lab2q3 
{
    public static void main(String args[])
    {
            int i;
            int num;
            for(i=23;i<=57;i++)
            {
                if(i%2 == 0)
                {
                    num = i;
                    System.out.println("the even numbers are " + num);
                }
            }
    }
}
