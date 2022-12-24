package RandomNumberGenerator;

import java.util.Random;
import java.util.Scanner;

public class RNG {

    Random rng = new Random();
    Scanner sc = new Scanner(System.in);

    int createRNG(int a, int b) {

        return rng.nextInt(a, b);

    }

    void runRNG() {

        System.out.println("Origin: ");
        int x = sc.nextInt();
        System.out.println();

        System.out.println("Bound (must be greater than the origin): ");
        int y = sc.nextInt();
        System.out.println();

        while(y <= x) {

            System.out.println("Invalid input. The bound value can't be greater than the origin value.");
            y = sc.nextInt();
            System.out.println();

        }

        System.out.println("Your randomly generated number between "+x+" and "+y+" is: "+createRNG(x, y));

    }

    public static void main(String[] args) {

        RNG RNG = new RNG();

        RNG.runRNG();

    }

}
