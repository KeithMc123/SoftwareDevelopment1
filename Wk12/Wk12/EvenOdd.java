package Wk12;

import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = 0;
        int y = 0;

        System.out.println("Please enter a number: ");
        x = input.nextInt();
        y = x;

        //x = x % 2;
        x %= 2;
        if(x == 0){
            System.out.println(y+" is an even number.");
        }else{
            System.out.println(y+" is an odd number.");
        }

        input.close();
    }
}