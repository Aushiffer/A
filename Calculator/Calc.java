package Calculator;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Calc {
    
    public static void main(String[] args) {
        
        Scanner user_main = new Scanner(System.in);
        
        Mult multiplication = new Mult();
        Add addition = new Add();
        Subst substraction = new Subst();
        Div division = new Div();
        RandNumGen rng = new RandNumGen();
        PI pi = new PI();
        SquareRoot sq_rt = new SquareRoot();
        Power power = new Power();
        Fact factorial = new Fact();
        
        char[] basic_math = {'*', '+', '-', '/'};
        String[] misc = {"RNG", "PI", "SQRT", "POW", "FACT"};

    try {

        while(true) {
        
            System.out.println("Choose: ");

            for(int i=0; i<basic_math.length; i++) {

                System.out.print(basic_math[i]+"  ");

            }

            System.out.println();

            for(int i=0; i<misc.length; i++) {

                System.out.print(misc[i]+"  ");
            
            }

            System.out.println();

            String user_choice = user_main.nextLine().toUpperCase();

            while(!(user_choice.equals("*") // "!" is "not"
            ||user_choice.equals("+")
            ||user_choice.equals("-")
            ||user_choice.equals("/")
            ||user_choice.equals("RNG")
            ||user_choice.equals("PI")
            ||user_choice.equals("SQRT")
            ||user_choice.equals("POW")
            ||user_choice.equals("FACT"))) {

                System.out.println("Not an option... try again");
                user_choice = user_main.nextLine().toUpperCase();

            }

            System.out.println();
        
            if(user_choice.equals("*")) {

                multiplication.multiply();

            } else if(user_choice.equals("+")) {

                addition.add();

            } else if(user_choice.equals("-")) {

                substraction.substract();

            } else if(user_choice.equals("/")) {

                division.divide();

            } else if(user_choice.equals("RNG")) {

                rng.generateRNG();

            } else if(user_choice.equals("PI")) {

                pi.getPI();

            } else if(user_choice.equals("SQRT")) {

                sq_rt.sqrt();

            } else if(user_choice.equals("POW")) {

                power.pow();

            } else if(user_choice.equals("FACT")) {

                factorial.fact();

            } else {

                System.out.println();
                System.out.println("ERROR: something went wrong...");

            }
    
            System.out.println();
            System.out.println("Again? y/n");

            String y_n = user_main.nextLine().toLowerCase();

            while(!(y_n.equals("y")||y_n.equals("n"))) {

                System.out.println("Not an option... try again");
                y_n = user_main.nextLine().toLowerCase();

            }   

            System.out.println();

            if(y_n.equals("n")) {

                break;

            }
        
        }

    } catch(InputMismatchException inputExc) {

        System.out.println();
        System.out.println("FATAL ERROR: input mismatch");
        System.out.println("Shutting down...");
    
    }
        
    user_main.close();

    }
}