package Calculator;

import java.util.Random;

public class CalcFunctions {
    
    public int sum(int a, int b) {

        return a + b;

    }

    public int minus(int a, int b) {

        return a - b;

    }

    public int times(int a, int b) {

        return a * b;

    }

    public double divide(int a, int b) {

        return a / b;

    }

    public double pow(int a, int b) {

        return Math.pow(a, b);

    }

    public double sqrt(int a) {

        return Math.sqrt(a);

    }

    public int rng(int a, int b) {

        Random randInt = new Random();

        return randInt.nextInt(a, b);

    }

    public void conditionals(int a, int x, int y) {

        if(a == 1) {

            System.out.println(sum(x, y));

        } else if(a == 2) {

            System.out.println(minus(x, y));

        } else if(a == 3) {

            System.out.println(times(x, y));

        } else if(a == 5) {

            System.out.println(pow(x, y));

        } else if(a == 7) {

            System.out.println(rng(x, y));

        }

    }

    public void divideConditional(int x, int y) {

        System.out.println(divide(x, y));

    }

    public void sqrtConditional(int x) {

        System.out.println(sqrt(x));

    }

}