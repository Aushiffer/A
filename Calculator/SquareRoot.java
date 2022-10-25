package Calculator;

import java.util.Scanner;

public class SquareRoot {
    
    Scanner user = new Scanner(System.in);
    
    double num0;

    protected void sqrt() {

        System.out.println("Number: ");
        num0 = user.nextDouble();
        System.out.println();

        if(num0==-1) {

            System.out.println("The result is: i");
        
        } else {

            System.out.println("The result is: "+Math.sqrt(num0));

        }

    }
}