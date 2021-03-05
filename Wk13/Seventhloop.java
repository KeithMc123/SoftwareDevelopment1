package Wk13;

public class Seventhloop {
    
    public static void main(String[] args){


        int x = 1;

        while(x < 11){
            if((x % 2) == 0){
                System.out.println("Even number: "+x);
            }
            x++;
        }
        System.out.println();
        x = 2;
        while(x < 11){

            System.out.println("Even number: "+x);
            x = x + 2;
        }
    }
}
