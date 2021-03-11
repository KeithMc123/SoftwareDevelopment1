package Wk18;

public class Triangle4{
  public static void main(String[] args){

    int outer = 10;
    int inner_spaces = 1;
    int inner_stars = 10;

    while(outer >= 1){
        while(inner_spaces < outer){
            System.out.print(" ");
            inner_spaces++;
        }
        inner_spaces = 1;

        while(inner_stars >= outer){
            System.out.print("*");
            inner_stars--;
        }
        inner_stars = 10;
        System.out.println();
        outer--;
    }

  }
} 