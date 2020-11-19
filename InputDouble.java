import java.util.Scanner;

public class InputDouble{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal number:");
        double decimal = input.nextDouble();

        System.out.println("Number entered is: " + decimal );

        input.close();

    }
}

