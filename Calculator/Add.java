package Calculator;

import java.util.Scanner;

public class Add {
    
    Scanner user = new Scanner(System.in);

    double doSum(double num1, double num2) {

        return num1 + num2;

    }

    protected void add() {

        System.out.println("First number:");
        double a = user.nextDouble();
        System.out.println();

        System.out.println("Second number:");
        double b = user.nextDouble();
        System.out.println();

        System.out.println("The result is: "+doSum(a, b));

    }
}