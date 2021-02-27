package Wk12;

import java.util.Scanner;

public class Fullname2{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String firstName, middle, surname;

        System.out.println("Enter first name: ");
        firstName = input.next();
        input.nextLine();
        System.out.println("Enter middle name: ");
        middle = input.nextLine();
        System.out.println("Enter surname: ");
        surname = input.next();

        if(middle.isEmpty()){
        System.out.println(firstName.concat(" ").concat(surname));   
        }else{
        System.out.println(firstName.concat(" ").concat(middle).concat(" ").concat(surname));
        }
        input.close();

    }
}
