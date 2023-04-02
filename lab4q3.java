public class lab4q3 
{
static int count =0;
lab4q3()
{
    count++;
    System.out.println("object created");
}
public static void main(String args[])
{
    lab4q3 o1 = new lab4q3();
    lab4q3 o2 = new lab4q3();
    lab4q3 o3 = new lab4q3();
    System.out.println("total "+count+" objects created.");
}
}
