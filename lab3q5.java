public class lab3q5 
{
    public static double area(int r)
    {
        return 3.14*r*r;
    }
    public static double area(Double base , double height)
    {
        return (base*height)/2;
    }
    public static int area(int length,int breadth)
    {
        return(length*breadth);
    }

   public static void main(String args[])
   {
        System.out.println("Area of the Circle : "+area(2));
        System.out.println("Area of the Triangle : "+ area(18.2,37.5));
        System.out.println("Area of the Rectangle : "+ area(12,34));
   }
}