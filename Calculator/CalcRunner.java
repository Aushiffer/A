package Calculator;

import java.util.Scanner;

public class CalcRunner extends CalcFunctions {
    
    void run() {

        Scanner sc = new Scanner(System.in);

        String[] options = new String[] {"Add", "Subtract", "Multiply", "Divide", "Power", "Square Root", "RNG"};
        int[] sample = new int[] {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Operation input: ");

        for(int i = 0; i < options.length; i++) {

            System.out.println(sample[i]+": "+options[i]);

        }
        
        System.out.println();

        int select = sc.nextInt();

        while(select > 7 || select < 1) {

            System.out.println("The input must be an natural, higher than 0 and lower or equal to 7");
            select = sc.nextInt();

        }

        if(select == 4) {

            System.out.println("Numbers to use: ");
            int n = sc.nextInt();
            int m = sc.nextInt();

            while(m == 0) {

                System.out.println("It's impossible to divide by zero. Input another value: ");
                m = sc.nextInt();

            }

            System.out.println();

            divideConditional(n, m);

        } else if(select == 6) {

            System.out.println("Number to use: ");
            int n = sc.nextInt();
            System.out.println();
            sqrtConditional(n); 

        } else {

            System.out.println("Numbers to use: ");
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println();
            conditionals(select, n, m);

        }

        sc.close();

    }

}
