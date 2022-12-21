package Dice;

import java.util.Random;
import java.util.Scanner;

public class DiceRoller {

    static Random rng = new Random();
    static Scanner sc = new Scanner(System.in);

    static int[] numStorage() {
        
        int[] store = new int[10];

        return store;

    }

    static int sum(int[] a) {

        int n = 0;

        for(int i = 0; i < a.length; i++) {

            n += a[i];

        }

        return n;

    }

    int[] storeDice = numStorage();

    void addRNGToArray(int n, int p) {
        
        int randInt;

        int[] sides = new int[] {5, 7, 9, 11, 13, 19};

        for(int i = 0; i < n; i++) {

            randInt = rng.nextInt(1, sides[p - 1]);

            storeDice[i] = randInt;

        }

    }

    void roll() {

        System.out.println("Number of dices (MAX: 10): ");
        int rollToAdd = sc.nextInt();
        System.out.println();

        while(rollToAdd > 10) {

            System.out.println("The maximum number of dices is 10.");
            rollToAdd = sc.nextInt();
            System.out.println();

        }

        System.out.println("Dice type (1: d4; 2: d6; 3: d8; 4: d10; 5: d12; 6: d20): ");
        int diceChooser = sc.nextInt();
        System.out.println();

        while(diceChooser > 6) {

            System.out.println("The maximum number of dice types is 6.");
            diceChooser = sc.nextInt();
            System.out.println();

        }

        addRNGToArray(rollToAdd, diceChooser);
            
        for(int i = 0; i < storeDice.length; i++) {

            System.out.print(storeDice[i]+" ");

        }

        System.out.println();
        System.out.println("Sum: "+sum(storeDice));

    }
}
