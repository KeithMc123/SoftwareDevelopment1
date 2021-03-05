package Wk13;

import java.util.Scanner;

public class Eightloop {
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int value = 0;
    int counter = 1;

    System.out.println("Please enter a number: ");
    value = input.nextInt();

    while(counter <= 5){
        System.out.println(value+" times "+counter+" = "+(value * counter));
        counter++;

    }

    input.close();
  }
}
