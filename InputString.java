import java.util.Scanner;

public class InputString{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

     
        System.out.println("Enter your first name here:");
        String name = input.next();

        System.out.println("Hello " + name );

    }
}
