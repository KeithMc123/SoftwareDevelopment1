package Wk8;

import java.util.Scanner;

public class FirstCondition{
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);

    int x = 0;

    System.out.print("Please enter a number: ");
    x = input.nextInt();

    if(x == 7){
        System.out.println("Number entered was equal to 7");
    }


    input.close();
  }
} 