package Wk12;

public class Decrement{
    public static void main(String[] args) {

        int number = 10;

        System.out.println("Number before post decrement: "+number);
        System.out.println("Post decrement number: "+(number--));
        System.out.println("Number after post decrement: "+number);

        number = 10;

        System.out.println("Number before post decrement: "+number);
        System.out.println("Pre decrement number: "+(--number));
        System.out.println("Number after pre decrement: "+number);

    }
}