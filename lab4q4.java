import java.util.Scanner;

public class lab4q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int cube = getCube(num);

        System.out.println("The cube of " + num + " is " + cube);
    }

    public static int getCube(int num) {
        return num * num * num;
    }
}
