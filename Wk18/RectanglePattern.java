package Wk18;

import java.util.Scanner;
public class RectanglePattern {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int rows = 0;
        int columns = 0;
        
        System.out.print("Enter number of rows: ");
        rows = input.nextInt();
        System.out.print("Enter number columns: ");
        columns = input.nextInt();

        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= columns; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        input.close();
    }
}
