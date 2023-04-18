

interface Ifc 
{

        final int a = 20;

        void display();
    }

    // A class that implements the interface.
public class lab6q3 implements Ifc 
{
   
    // Implementing the interface:

    public void display()
    {
      System.out.println("Hiii");
    }
 
    // Driver Code
    
    public static void main(String[] args)
    {
        lab6q3 x = new lab6q3();
        x.display();
        System.out.println(a);
    }
}
