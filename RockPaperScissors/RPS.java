package RockPaperScissors;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class RPS {
    public static void main(String[] args) {
        
        Random cpuChoice = new Random();
        Scanner user = new Scanner(System.in);
        ArrayList<String> cpuChoiceList = new ArrayList<String>(3);

        cpuChoiceList.add("rock ");
        cpuChoiceList.add("scissors ");
        cpuChoiceList.add("paper");
        
        int userScore = 0; int javaScore = 0;
        
        System.out.println("Welcome to the Java version of the classic \"Rock, Paper and Scissors\" game!");
        System.out.print("What's your name? ");
        String username = user.nextLine();
        
        while(true) {
            
            if(!(username.isBlank())) {
                
                break;

            }
            
            if(username.isBlank()) {
            
            System.out.println("Please input something on the name field: ");
            username = user.nextLine();

            }

        }
        
        System.out.println("Hi, "+username+"!");
        System.out.print("\n");
        
        while(true) {
        System.out.println("- "+username+", please choose one of these: ");
        
        for(int i=0; i<cpuChoiceList.size(); i++) {
            
            System.out.println("* "+cpuChoiceList.get(i)); 
        
        }
        
        System.out.print("-> ");
        String userText = user.nextLine();
        
        while(!(userText.equalsIgnoreCase("rock")
        ||userText.equalsIgnoreCase("paper")
        ||userText.equalsIgnoreCase("scissors"))) {
            
            System.out.println("That's not a valid option. Please input \"ROCK\", \"SCISSORS\", or \"PAPER\".");
            userText = user.nextLine();

        }
       
        int randNum = cpuChoice.nextInt(cpuChoiceList.size());
        int det;
        
        System.out.print("\n");

        System.out.println(username+" chose: "+userText);
        System.out.println("Java chose: "+cpuChoiceList.get(randNum));
        System.out.print("\n");
        
        if(userText.equalsIgnoreCase("rock")) {
            
            det = 0;
            
            if(randNum>det && randNum==1) {
                
                System.out.println(username+" won!");
                userScore++;

            } else if(randNum>det && randNum==2) {
                
                System.out.println("Java won!");
                javaScore++;

            } else if(randNum==det) {
                
                System.out.println("It's a tie!");
                userScore++;
                javaScore++;

            }

        } else if(userText.equalsIgnoreCase("scissors")) {
            
            det = 1;

            if(randNum<det) {
                
                System.out.println("Java won!");
                javaScore++;

            } else if(randNum>det) {
                
                System.out.println(username+" won!");
                userScore++;

            } else if(randNum==det) {
                
                System.out.println("It's a tie!");
                userScore++;
                javaScore++;

            }
        } else if(userText.equalsIgnoreCase("paper")) {
            
            det = 2;

            if(randNum<det && randNum==1) {
                
                System.out.println("Java won!");
                javaScore++;

            } else if(randNum<det && randNum==0) {
                
                System.out.println(username+" won!");
                userScore++;

            } else if(randNum==det) {
                
                System.out.println("It's a tie!");
                userScore++;
                javaScore++;

            }
        }
        
        System.out.println("Score: "+username+" "+userScore+" X "+javaScore+" Java");
        System.out.print("\n");

        System.out.println("Want to play again? (Y/N)");
        System.out.print("-> ");
        String yesOrNo = user.nextLine();
        
        while(!(yesOrNo.equalsIgnoreCase("Yes")
        ||yesOrNo.equalsIgnoreCase("Y")
        ||yesOrNo.equalsIgnoreCase("No")
        ||yesOrNo.equalsIgnoreCase("N"))) {
            
            System.out.println("That's not a valid option!");
            System.out.print("\n");
            System.out.println("Want to play again? (Y/N)");
            yesOrNo = user.nextLine();
            
            if(yesOrNo.equalsIgnoreCase("Yes")
            ||yesOrNo.equalsIgnoreCase("Y")
            ||yesOrNo.equalsIgnoreCase("No")
            ||yesOrNo.equalsIgnoreCase("N")) {
                
                break;

            }
        }
        
        if(yesOrNo.equalsIgnoreCase("N")||yesOrNo.equalsIgnoreCase("No")) {
            
            System.out.println("Game over!");
            if(userScore>javaScore) {
                
                System.out.println(username+" triumphs over Java!");

            } else if(userScore==javaScore) {
                
                System.out.println(username+" ties with Java!");

            } else {
                
                System.out.println("Java triumphs over "+username+"!");

            }
            
            break;

        }
    }
    
    user.close();

    } 
}