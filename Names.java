import java.util.Scanner;

public class Names{
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter your first name here:");
            String name = input.next();
            System.out.print("Enter your second name here:");
            String name2 = input.next();

            System.out.println(name);
            System.out.println(name2);

        input.close();
    }
}

