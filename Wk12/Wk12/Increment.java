package Wk12;

public class Increment{
    public static void main(String[] args) {

        int number = 10;

        System.out.println("Number before post increment: "+number);
        System.out.println("Post increment number: "+(number++));
        System.out.println("Number after post increment: "+number);

        number = 10;

        System.out.println("Number before post increment: "+number);
        System.out.println("Pre increment number: "+(++number));
        System.out.println("Number after pre increment: "+number);

    }
}