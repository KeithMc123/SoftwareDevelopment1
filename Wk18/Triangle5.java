package Wk18;

public class Triangle5{
  public static void main(String[] args){

    int outer = 1;
    int inner_spaces = 9;
    int inner_stars = 1;

    while(outer <= 9){
        while(inner_spaces > outer){
            System.out.print(" ");
            inner_spaces--;
        }
        inner_spaces = 9;

        while(inner_stars <= (outer * 2) - 1){
            System.out.print("*");
            inner_stars++;
        }
        inner_stars = 1;
        System.out.println();
        outer++;
    }

  }
} 