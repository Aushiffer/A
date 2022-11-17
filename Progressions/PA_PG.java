package Progressions;

import java.util.Scanner;

public class PA_PG {

    /*  
        Termo da PA: An = A1 + (n - 1) * r;
        Termo da PG: An = A1 * q^(n - 1);
    */

    static Scanner input = new Scanner(System.in);

    static int aritTerm() {

        System.out.println();
        System.out.println("Arithmethic Progression");
        System.out.println();

        System.out.println("Input the first term of the progression:");
        double a1 = input.nextDouble();
        
        System.out.println();
        System.out.println("Input the term you want to find:");
        int n = input.nextInt();

        System.out.println();
        System.out.println("Input the ratio of the progression:");
        double r = input.nextDouble();

        double an = a1 + (n - 1) * r;

        System.out.println();
        System.out.println("The term is: "+an);

        return 0;

    }

    static int geoTerm() {

        System.out.println();
        System.out.println("Geometric Progression");
        System.out.println();

        System.out.println("Input the first term of the progression:");
        double a1 = input.nextDouble();

        System.out.println();
        System.out.println("Input the term you want to find:");
        int n = input.nextInt();

        System.out.println();
        System.out.println("Input the ratio of the progression:");
        double q = input.nextDouble();

        double an = a1 * Math.pow(q, n - 1);

        System.out.println();
        System.out.println("The term is: "+(long) an);
        
        return 0;

    }

    public static void main(String[] args) {

        Scanner inputMain = new Scanner(System.in);

        System.out.println("Arithmethic and Geometric Progressions");
        System.out.println();

        System.out.println("Choose 1 for AP or choose 2 for GP:");
        String choice = inputMain.nextLine();
        
        while(!(choice.equals("1") || choice.equals("2"))) {

            System.out.println();
            System.out.println("Invalid input. Please try again:");
            choice = inputMain.nextLine();

        }

        if(choice.equals("1")) {

            aritTerm();

        } else if(choice.equals("2")) {

            geoTerm();

        } else {

            System.out.println("default");

        }
            
        inputMain.close();
        
    }
}