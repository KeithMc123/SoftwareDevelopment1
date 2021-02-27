package Wk8;
import java.util.Scanner;

public class OddEven{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    int num = 0;

    System.out.print("Please enter a number: ");
    num = input.nextInt();

    if((num % 2) == 0){
        System.out.println("Number entered is an even number.");
    }

    if((num % 2) != 0){
        System.out.println("Number entered is an odd number.");
    }

    input.close();
  }
} 