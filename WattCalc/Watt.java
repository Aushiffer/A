package WattCalc;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Watt {
    
    public double watt1(double tension, double ohm) {

        return Math.pow(tension, 2) / ohm; // returns P = U^2 / R

    }

    public double watt2(double tension, double amp) {

        return tension * Math.pow(amp, 2); // returns P = U * i^2

    }

    public double watt3(double energy, double timespan) {

        return energy / timespan; // returns P = E / Δt

    }
    
    protected void calc() {
        
        Scanner input = new Scanner(System.in);
        Scanner choice_input = new Scanner(System.in);

        String choice;
        
        try {

            System.out.println("Method: (Inputs: \"1\", \"2\" or \"3\")");

            choice = choice_input.nextLine();
            System.out.println();

            while(!(choice.equals("1")||choice.equals("2")||choice.equals("3"))) {

                System.out.println("ERROR: Invalid input, try again (Valid inputs: \"1\", \"2\" or \"3\")");
                choice = input.nextLine();
                System.out.println();

            }

            if(choice.equals("1")) {

                System.out.println("Input tension (U):");
                double tension_input = input.nextDouble();

                System.out.println();
                System.out.println("Input ohm (R):");
                double ohm_input = input.nextDouble();

                System.out.println();
                System.out.println("Potency: "+watt1(tension_input, ohm_input)+" watts");

            } else if(choice.equals("2")) {
                
                System.out.println("Input tension (U):");
                double tension_input = input.nextDouble();

                System.out.println();
                System.out.println("Input amperage (i):");
                double amp_input = input.nextDouble();

                System.out.println();
                System.out.println("Potency: "+watt2(tension_input, amp_input)+" watts");

            } else if(choice.equals("3")) {

                System.out.println("Input energy (E):");
                double energy_input = input.nextDouble();

                System.out.println();
                System.out.println("Input timespan in seconds (t):");
                double tSpan_input = input.nextDouble();

                System.out.println();
                System.out.println("Potency: "+watt3(energy_input, tSpan_input)+" watts");

            } else {

                System.out.println();
                System.out.println("Uh oh, something went REALLY wrong...");

            }
    
        } catch(InputMismatchException inputExc) {

            System.out.println();
            System.out.println("FATAL ERROR: Failed input");
            System.out.println("SHUTTING DOWN...");

        } finally {

            input.close();
            choice_input.close();

        }
    }

    public static void main(String[] args) {

        Watt watt = new Watt();

        watt.calc();

    }
}