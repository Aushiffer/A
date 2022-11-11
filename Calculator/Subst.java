package Calculator;

import java.util.Scanner;

public class Subst {
    
    Scanner user = new Scanner(System.in);

    double doSubst(double num1, double num2) {

        return num1 - num2;

    }

    protected void substract() {

        System.out.println("First number:");
        double a = user.nextDouble();
        System.out.println();

        System.out.println("Second number:");
        double b = user.nextDouble();
        System.out.println();

        System.out.println("The result is: "+doSubst(a, b));

    }
}