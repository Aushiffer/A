package Calculator;

import java.util.Scanner;

public class SquareRoot {
    
    Scanner user = new Scanner(System.in);
    
    double doSqrt(double num) {

        return Math.sqrt(num);

    }

    protected void sqrt() {

        System.out.println("Number:");
        double a = user.nextDouble();
        System.out.println();

        while(a < -1) {

            System.out.println("Invalid operation. N must be greater or equal to -1.");
            a = user.nextDouble();
            System.out.println();

        }
        
        if(a == -1) {

            System.out.println("The result is: i (imaginary unit)");

        } else if(a > -1) {

            System.out.println("The result is: "+doSqrt(a));

        }

    }
}