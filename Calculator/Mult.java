package Calculator;

import java.util.Scanner;

public class Mult {
    
    Scanner user = new Scanner(System.in);
    
    double num0, num1;

    protected void multiply() {

        System.out.println("First number: ");
        num0 = user.nextDouble();
        System.out.println();
        
        System.out.println("Second number: ");
        num1 = user.nextDouble();
        System.out.println();
        
        System.out.println("The result is: "+num0*num1);

    }
}