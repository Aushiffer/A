package Calculator;

import java.util.Scanner;

public class Add {
    
    Scanner user = new Scanner(System.in);

    double num0, num1, res;
    
    protected void add() {

        System.out.println("First number: ");
        num0 = user.nextDouble();
        System.out.println();

        System.out.println("Second number: ");
        num1 = user.nextDouble();
        System.out.println();

        res = num0+num1;
        
        System.out.println("The result is: "+res);

    }
}