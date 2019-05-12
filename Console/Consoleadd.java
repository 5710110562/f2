import java.util.Scanner;

public class Consoleadd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer : ");
        int a = sc.nextInt();
        System.out.print("Enter second integer : ");
        int b = sc.nextInt();

        sc.close();
        System.out.println("Adding Gives : " + (b+a) );
    }
}