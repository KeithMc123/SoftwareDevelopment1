package Wk14;

import java.util.Scanner;

public class LargeSmall {
    
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int number = 0;
    int smallest = 0;
    int largest = 0;


    System.out.print("Enter number 1: ");
    number = input.nextInt();
    largest = number;
    smallest = number;
    
    int counter = 2;
    while(counter <= 5){
        System.out.print("Enter number "+counter+": ");  

        if(largest < number){
            largest = number;
        }
        if(smallest > number){
            smallest = number;

        }
        counter++;
    }
    System.out.println("The largest number is: "+largest);
    System.out.println("The smallest number is: "+smallest);   

    
    input.close();
    }
    }
