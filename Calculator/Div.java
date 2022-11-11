package Calculator;

import java.util.Scanner;

public class Div {
    
    Scanner user = new Scanner(System.in);

    double doDiv(double num1, double num2) {

        return num1 / num2;

    }

    protected void divide() {

        System.out.println("First number:");
        double a = user.nextDouble();
        System.out.println();

        System.out.println("Second number:");
        double b = user.nextDouble();
        System.out.println();

        while(b == 0) {

            System.out.println("You can't divide a number by 0. Please input another number:");
            b = user.nextDouble();
            System.out.println();
            
        } 
        
        System.out.println("The result is: "+doDiv(a, b));

    }
}