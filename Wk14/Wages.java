package Wk14;

import java.util.Scanner;

public class Wages{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    double hours = 0;
    double rate = 0;
    double pay = 0;

    int counter = 1;
    while(counter <= 3){
        System.out.print("Enter hours worked: ");  
        hours = input.nextDouble();
        System.out.print("Enter hourly rates: ");  
        rate = input.nextDouble();
        
        if(hours > 40){
            pay = (40.0 * rate) + ((hours - 40) * (rate * 1.5));
        }else{
            pay = hours * rate;
        }
        
        System.out.println("Pay for employee "+counter+" is: "+pay);
        System.out.println();
        counter++;
    }
    input.close();
 
}
}