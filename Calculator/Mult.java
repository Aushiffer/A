package Calculator;

import java.util.Scanner;

public class Mult {
    
    Scanner user = new Scanner(System.in);
    
    double doMult(double num1, double num2) {

        return num1 * num2;

    }

    protected void multiply() {

        System.out.println("First number:");
        double a = user.nextDouble();
        System.out.println();

        System.out.println("Second number:");
        double b = user.nextDouble();
        System.out.println();

        System.out.println("The result is: "+doMult(a, b));

    }
}