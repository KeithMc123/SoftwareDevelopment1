
import java.util.Scanner;

public class Multiple{
  public static void main(String[] args){
 
    Scanner input = new Scanner(System.in);

    int first = 0;
    int second = 0;

    System.out.print("Please enter first number: ");
    first = input.nextInt();

    System.out.print("Please enter second number: ");
    second = input.nextInt();

    if((first % second) == 0){
        System.out.println(first+" is a multiple of "+second);
    }
  
    if((first % second) != 0){
        System.out.println(first+" is not a multiple of "+second);
    }

    input.close();
  }
} 