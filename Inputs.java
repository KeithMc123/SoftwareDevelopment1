import java.util.Scanner;

public class Inputs{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name here:");
        String name = input.next();

        System.out.println("Enter a whole number: ");
        int number = input.nextInt();

        System.out.println("Enter a decimal number:");
        double decimal = input.nextDouble();

        System.out.println(name+ ", you entered the numbers: " +number+ ", " +decimal );

        input.close();
    }
}

