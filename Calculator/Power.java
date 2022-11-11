package Calculator;

import java.util.Scanner;

public class Power {
    
    Scanner user = new Scanner(System.in);
    
    double doPow(double num, int pow) {

        return Math.pow(num, pow);

    }

    protected void pow() {

        System.out.println("Number:");
        double a = user.nextDouble();
        System.out.println();
        
        System.out.println("Power:");
        int b = user.nextInt();
        System.out.println();

        System.out.println("The result is: "+doPow(a, b));

    }
}