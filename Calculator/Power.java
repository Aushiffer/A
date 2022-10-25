package Calculator;

import java.util.Scanner;

public class Power {
    
    Scanner user = new Scanner(System.in);
    
    double num, pow;

    protected void pow() {

        System.out.println("Number: ");
        num = user.nextDouble();
        System.out.println();

        System.out.println("Power: ");
        pow = user.nextDouble();
        System.out.println();

        System.out.println("The result is: "+Math.pow(num, pow));

    }
}