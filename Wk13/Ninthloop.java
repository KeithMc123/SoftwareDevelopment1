package Wk13;

import java.util.Scanner;
public class Ninthloop {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int total = 0;
        int counter = 1;

        while(counter <=5){
            System.out.print("Enter a grade for student "+counter+": ");
            total = total + input.nextInt();
            counter++;

        }

        System.out.println("Total of all 5 grades is: "+total);
        System.out.println("Average grade is: "+(total / 5));
        
        input.close();
    }
}
