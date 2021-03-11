package Wk18;

public class Triangle3{
  public static void main(String[] args){

    int outer = 10;
    int inner_spaces = 10;
    int inner_stars = 1;

    while(outer >= 1){
        while(inner_spaces > outer){
            System.out.print(" ");
            inner_spaces--;
        }
        inner_spaces = 10;

        while(inner_stars <= outer){
            System.out.print("*");
            inner_stars++;
        }
        inner_stars = 1;
        System.out.println();
        outer--;
    }

  }
} 