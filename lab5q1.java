// WAP that implements method overriding
class derived extends lab5q1 {
    @Override
    public void display() 
    {
        a++;
        System.out.println("the value of a before overriding : " + a);
    }
}
public class lab5q1 
{
  int a= 90;
   public void display()
    {
        System.out.println("the value of a before overriding : "+a);
    }
   
    public static void main(String args[])
    {
        lab5q1 obj1 = new lab5q1();
        obj1.display();
        derived obj2 = new derived();
        obj2.display();

    }
}
