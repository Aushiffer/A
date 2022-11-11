package Calculator;

import java.util.Scanner;
import java.util.Random;

public class RandNumGen {

    Scanner user_rand = new Scanner(System.in);
    Random rand = new Random();
    
    int doRandom(int num1, int num2) {

        return rand.nextInt(num1, num2);

    } 
    
    protected void generateRNG() {

        System.out.println("Origin (n must be an natural number):");
        int a = user_rand.nextInt();
        System.out.println();

        while(a < 0) {

            System.out.println("n must be greater or equal to zero.");
            a = user_rand.nextInt();
            System.out.println();

        } 

        System.out.println("Bound (p must be greater than n):");
        int b = user_rand.nextInt();
        System.out.println();

        while(b <= a) {

            System.out.println("P must be greater than n.");
            b = user_rand.nextInt();
            System.out.println();

        }

        System.out.println("The result is: "+doRandom(a, b));

    }
}