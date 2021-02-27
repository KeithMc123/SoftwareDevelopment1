package Wk12;

import java.util.Scanner;

public class Compound{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = 0;

        System.out.println("Please enter a number: ");
        x = input.nextInt();

        // x = x + 2
        x += 2;

        System.out.println("x after adding 2 using compound assignment is: "+x);

        x -= 5;

        System.out.println("x after subtracting 5 using compound assignment is: "+x);

        input.close();
    }
}