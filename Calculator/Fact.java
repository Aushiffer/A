package Calculator;

import java.util.Scanner;

public class Fact {

    Scanner user = new Scanner(System.in);
    
    long factExact(long num) {

        long x = 1;

        for(int i=1; i<=num; i++) {

            x *= i;

        }

        return x;

    }

    protected void fact() {

        System.out.println("Number:");
        long factorial = user.nextLong();
        System.out.println();

        System.out.println("The result is: "+factExact(factorial));

    }
}