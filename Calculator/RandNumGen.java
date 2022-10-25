package Calculator;

import java.util.Scanner;
import java.util.Random;

public class RandNumGen {

    Scanner user_rand = new Scanner(System.in);
    Random rand = new Random();
    
    int num1, num2;

    protected void generateRNG() {

        System.out.println("First number: ");

        num1 = user_rand.nextInt();

        while(num1<0) {

            System.out.println("x>=0");
            num1 = user_rand.nextInt();

            if(num1>=0) {

                break;

            }
        }

        System.out.println("Second number: ");

        num2 = user_rand.nextInt();

        while(num2<num1) {

           System.out.println("num2>num1");
           num2 = user_rand.nextInt();

           if(num2>num1) {

                break;

           }
        }

        System.out.println(rand.nextInt(num1, num2));

    }
}