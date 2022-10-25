package Calculator;

import java.util.Scanner;

public class Div {
    
    Scanner user = new Scanner(System.in);

    double num0, num1;

    protected void divide() {

        System.out.println("First number: ");
        num0 = user.nextDouble();
        System.out.println();

        System.out.println("Second number: ");
        num1 = user.nextDouble();

        while(num1==0) {

            System.out.println("Impossible division detected. Please input a value that is x!=0");
            num1 = user.nextDouble();

            if(num1!=0) {

                break;

            }
        }

        System.out.println("The result is: "+num0/num1);

    }
}