import java.util.Scanner;
public class lab2q2 {
    public static void main(String args[])
    {
String colorcode;
Scanner sc = new Scanner(System.in);
System.out.println("enter the color code :");
colorcode = sc.nextLine();

if(colorcode.charAt(0)=='#' && colorcode.length()>=7)
{
    int i=1;//because the firt character is already checked a #.

    while(i < colorcode.length())
{
if(colorcode.charAt(i)>='A' && colorcode.charAt(i)<='F'||colorcode.charAt(i)>='0' && colorcode.charAt(i)<='9')
{
i++;
}

else
{
break;
}

}
if(i == colorcode.length()){
System.out.println("color code received");}
}
else
{
System.out.println("color code invalid");
}

}
}
