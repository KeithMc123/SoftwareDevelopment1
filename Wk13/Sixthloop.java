package Wk13;

import java.util.Scanner;

public class Sixthloop {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int counter = 0;

        System.out.println("Please enter loop counter: ");
        counter = input.nextInt();

        System.out.println("Before Loop");
        while(counter < 5){
            System.out.println("Inside loop counter - Counter = "+counter);
            counter++;

        }

        System.out.println("After Loop");

        input.close();
    }

}
