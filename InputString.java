import java.util.Scanner;

public class InputString{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name = input.next();
        System.out.println("Enter your first name here:");

        System.out.println("Hello " + name );

    }
}

