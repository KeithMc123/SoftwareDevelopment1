/*
Program Name: Exercise4
Inputs Required: no    
Variables/Types: int outer, int inner 
If/else statements: no
Loops: yes
Loop how many times: outer - 6, inner - 4
*/

package Wk20;

public class Exercise4{
  public static void main(String[] args){

    for(int outer = 1; outer <= 6; outer++){
        System.out.print("row "+outer+": ");
        for(int inner = 1; inner <=4; inner++){
            System.out.print("Column " +inner+" ");
        }

        System.out.println();
    }

    }
}