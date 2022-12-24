package RockPaperScissors;

import java.util.Scanner;
import java.util.Random;

public class RPS {

    static int jChoice() {

        Random rand = new Random();

        return rand.nextInt(0, 3);

    }

    public static void main(String[] args) {

        String[] compChoice = new String[] {"rock", "paper", "scissors"};

        int pScore = 0;
        int jScore = 0;

        Scanner scan = new Scanner(System.in);

        while(true) {

            System.out.println("Rock, paper and scissors");
            System.out.println();

            System.out.println("Choose one of them: ");
            String pChoice = scan.nextLine().toLowerCase();
            System.out.println();
            
            while(!(pChoice.equals("rock") || pChoice.equals("paper") || pChoice.equals("scissors"))) {

                System.out.println("Invalid input. Please try again: ");
                pChoice = scan.nextLine().toLowerCase();
                System.out.println();

            }

            String jChoice_2 = compChoice[jChoice()]; 
            System.out.println();

            System.out.println("Java chose: "+jChoice_2);

            if(pChoice.equals("rock") && jChoice_2.equals(compChoice[0])) {

                System.out.println("Tie!");
                System.out.println();

            } else if(pChoice.equals("rock") && jChoice_2.equals(compChoice[1])) {

                System.out.println("Java wins!");
                System.out.println();
                jScore++;

            } else if(pChoice.equals("rock") && jChoice_2.equals(compChoice[2])) {

                System.out.println("Player wins!");
                System.out.println();
                pScore++;

            } else if(pChoice.equals("paper") && jChoice_2.equals(compChoice[0])) {

                System.out.println("Player wins!");
                System.out.println();
                pScore++;

            } else if(pChoice.equals("paper") && jChoice_2.equals(compChoice[1])) {

                System.out.println("Tie!");
                System.out.println();

            } else if(pChoice.equals("paper") && jChoice_2.equals(compChoice[2])) {

                System.out.println("Java wins!");
                System.out.println();
                jScore++;

            } else if(pChoice.equals("scissors") && jChoice_2.equals(compChoice[0])) {

                System.out.println("Java wins!");
                System.out.println();
                jScore++;

            } else if(pChoice.equals("scissors") && jChoice_2.equals(compChoice[1])) {

                System.out.println("Player wins!");
                System.out.println();
                pScore++;

            } else if(pChoice.equals("scissors") && jChoice_2.equals(compChoice[2])) {

                System.out.println("Tie!");
                System.out.println();

            } else {

                System.out.println("default");

            }

            System.out.print("\nPlayer score: "+pScore+" \nJava score: "+jScore);
            System.out.println();
            System.out.println();
            System.out.println();

            System.out.println("Want to play again? (Y/N)");
            String pRepeat = scan.nextLine().toLowerCase();
            System.out.println();

            while(!(pRepeat.equals("y") || pRepeat.equals("n"))) {

                System.out.println("Invalid input. Please try again: ");
                pRepeat = scan.nextLine().toLowerCase();
                System.out.println();

            }

            if(pRepeat.equals("n")) {

                break;

            }

        }

        if(pScore > jScore) {

            System.out.println("Player won the battle!");

        } else if(pScore < jScore) {

            System.out.println("Java won the battle!");

        } else if(pScore == jScore) {

            System.out.println("It's a tie!");
            
        }

        scan.close();

    }

}
