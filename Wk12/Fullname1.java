package Wk12;

import java.util.Scanner;

public class Fullname1{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String firstName, surname;

        System.out.println("Enter first name: ");
        firstName = input.next();
        System.out.println("Enter surname: ");
        surname = input.next();

        System.out.println(firstName.concat(" ").concat(surname));

        input.close();

    }
}
