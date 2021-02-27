package Wk12;


import java.util.Scanner;

public class Last {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String a;
        int stringLength = 0;

        System.out.print("Enter a string: ");
        a = input.next();

        stringLength = a.length();

        System.out.println(stringLength);
        System.out.println("Last character is: "+a.charAt(--stringLength));



        input.close();
    }
}