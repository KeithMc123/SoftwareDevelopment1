package Wk12;

import java.util.Scanner;

public class Arithmetic{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = 0, b = 0, c = 0, d = 0, e = 0;
        int a1 = 0, b1 = 0, c1 = 0, d1 = 0, e1 = 0;


        System.out.println("Enter a number for a: ");
        a = input.nextInt();
        a1 = a;
        System.out.println("Enter a number for b: ");
        b = input.nextInt();
        b1 = b;
        System.out.println("Enter a number for c: ");
        c = input.nextInt();
        c1 = c;
        System.out.println("Enter a number for d: ");
        d = input.nextInt();
        d1 = d;
        System.out.println("Enter a number for e: ");
        e = input.nextInt();
        e1 = e;

        a1 += 9;
        System.out.println("Value of a, "+a+" after adding 9 is: "+a1);

        b1 -=4;
        System.out.println("Value of b, "+b+" after subtracting 4 is: "+b1);
        
        c1 *=3;
        System.out.println("Value of c, "+c+" after multiplying by 3 is: "+c1);
        
        d1 /=2;
        System.out.println("Value of d, "+d+" after dividing by 2 is: "+d1);

        e1 %=5;
        System.out.println("Remainder value assigned to e, "+e+" after dividing by 5 is: "+e1);

        input.close();

    }
}