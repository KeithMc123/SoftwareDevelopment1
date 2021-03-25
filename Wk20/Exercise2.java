/*
Program Name: Exercise2
Inputs Required: yes     
Variables/Types: int number
If/else statements: no
Loops: no
Loop how many times: not applicable
*/
package Wk20;

import java.util.Scanner;

public class Exercise2 {
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int number = 0;
    
    System.out.print("Enter a number: ");
    number = input.nextInt();
    
    if(number >= 10 && number <= 20){
        number = number + 10;
    }else if(number >= 30 && number <= 40){
        number = number + 30;
    }else if(number >= 50 && number <= 60){
        number = number + 50;
    }else{
        number = number + 100;
    }
    
    System.out.println("Input number updated to: "+number);

    input.close();
  }
} 