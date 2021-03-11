package Wk18;

public class NestedWhile{
  public static void main(String[] args){

    int counter = 0;
    int inner_counter = 0;

    System.out.println();

    while(counter < 2){
        inner_counter = 0;
        while(inner_counter < 3){
            System.out.print("*");
            inner_counter = inner_counter + 1;
        }
        System.out.print("\n");
        counter = counter + 1;
    }
    System.out.println();
  }
} 