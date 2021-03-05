package Wk13;

import java.util.Scanner;

public class Fifthloop {
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int i = 1;
    int x = 0;

    System.out.print("Enter a counter value: ");
    x = input.nextInt();
    
    while(i <= x){
        System.out.println("Loop counter: "+i);
        i++;
    }

    input.close();
  }
}   
