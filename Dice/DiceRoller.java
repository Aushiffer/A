package Dice;

import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    
    static class SixFaces {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        
        int[] store_d6 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int dice_num, roll;
    
        void d6_roll() {

            System.out.println("From 1 to 10, how many d6 dices do you want to roll?");
        
            dice_num = input.nextInt();
            System.out.println();

            while(dice_num > 10||dice_num <= 0) {

                System.out.println("The number of dices must be a natural lower than 10 and higher than 0.");
                
                dice_num = input.nextInt(); 
                System.out.println();

            }

            for(int i=0; i<dice_num; i++) {

                roll = rand.nextInt(1, 7);
                store_d6[i] = roll;
                
                System.out.println(store_d6[i]);

            }

            int sum_dices = 0;

            for(int i=0; i<store_d6.length; i++) {

                sum_dices += store_d6[i];

            }
            
            System.out.println("Total: "+sum_dices);
        
        }
    }

    static class FourFaces {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int[] store_d4 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int dice_num, roll;

        void d4_roll() {

            System.out.println("From 1 to 10, how many d4 dices do you want to roll?");
            
            int dice_num = input.nextInt();
            System.out.println();

            while(dice_num > 10||dice_num <= 0) {

                System.out.println("The number of dices must be a natural lower than 10 and higher than 0.");
                
                dice_num = input.nextInt();
                System.out.println();

            }

            for(int i=0; i<dice_num; i++) {

                roll = rand.nextInt(1, 5);
                store_d4[i] = roll;
                
                System.out.println(store_d4[i]);

            }

            int sum_dices = 0;
            
            for(int i=0; i<store_d4.length; i++) {

                sum_dices += store_d4[i];

            }

            System.out.println("Total: "+sum_dices);

        }
    }

    static class EightFaces {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        
        int[] store_d8 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int dice_num, roll;
    
        void d8_roll() {

            System.out.println("From 1 to 10, how many d8 dices do you want to roll?");
        
            dice_num = input.nextInt();
            System.out.println();

            while(dice_num > 10||dice_num <= 0) {

                System.out.println("The number of dices must be a natural lower than 10 and higher than 0.");
                
                dice_num = input.nextInt(); 
                System.out.println();

            }

            for(int i=0; i<dice_num; i++) {

                roll = rand.nextInt(1, 9);
                store_d8[i] = roll;
                
                System.out.println(store_d8[i]);

            }

            int sum_dices = 0;

            for(int i=0; i<store_d8.length; i++) {

                sum_dices += store_d8[i];

            }
            
            System.out.println("Total: "+sum_dices);
        
        }
    }

    static class TenFaces {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        
        int[] store_d10 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int dice_num, roll;
    
        void d10_roll() {

            System.out.println("From 1 to 10, how many d10 dices do you want to roll?");
        
            dice_num = input.nextInt();
            System.out.println();

            while(dice_num > 10||dice_num <= 0) {

                System.out.println("The number of dices must be a natural lower than 10 and higher than 0.");
                
                dice_num = input.nextInt(); 
                System.out.println();

            }

            for(int i=0; i<dice_num; i++) {

                roll = rand.nextInt(1, 11);
                store_d10[i] = roll;
                
                System.out.println(store_d10[i]);

            }

            int sum_dices = 0;

            for(int i=0; i<store_d10.length; i++) {

                sum_dices += store_d10[i];

            }
            
            System.out.println("Total: "+sum_dices);
        
        }
    }

    static class TwelveFaces {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        
        int[] store_d12 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int dice_num, roll;
    
        void d12_roll() {

            System.out.println("From 1 to 10, how many d12 dices do you want to roll?");
        
            dice_num = input.nextInt();
            System.out.println();

            while(dice_num > 10||dice_num <= 0) {

                System.out.println("The number of dices must be a natural lower than 10 and higher than 0.");
                
                dice_num = input.nextInt(); 
                System.out.println();

            }

            for(int i=0; i<dice_num; i++) {

                roll = rand.nextInt(1, 13);
                store_d12[i] = roll;
                
                System.out.println(store_d12[i]);

            }

            int sum_dices = 0;

            for(int i=0; i<store_d12.length; i++) {

                sum_dices += store_d12[i];

            }
            
            System.out.println("Total: "+sum_dices);
        
        }
    }

    static class TwentyFaces {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        
        int[] store_d20 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int dice_num, roll;
    
        void d20_roll() {

            System.out.println("From 1 to 10, how many d20 dices do you want to roll?");
        
            dice_num = input.nextInt();
            System.out.println();

            while(dice_num > 10||dice_num <= 0) {

                System.out.println("The number of dices must be a natural lower than 10 and higher than 0.");
                
                dice_num = input.nextInt(); 
                System.out.println();

            }

            for(int i=0; i<dice_num; i++) {

                roll = rand.nextInt(1, 21);
                store_d20[i] = roll;
                
                System.out.println(store_d20[i]);

            }

            int sum_dices = 0;

            for(int i=0; i<store_d20.length; i++) {

                sum_dices += store_d20[i];

            }
            
            System.out.println("Total: "+sum_dices);
        
        }
    }

    public static void main(String[] args) {
        
        Scanner user = new Scanner(System.in);
        
        SixFaces six_faces = new SixFaces();
        FourFaces four_faces = new FourFaces();
        EightFaces eight_faces = new EightFaces();
        TenFaces ten_faces = new TenFaces();
        TwelveFaces twelve_faces = new TwelveFaces();
        TwentyFaces twenty_faces = new TwentyFaces();

        String[] dice_list = {"D4", "D6", "D8", "D10", "D12", "D20"};

        System.out.println("Welcome to the Java Dice Roller.");
        
        while(true) {

        System.out.println("What kind of dice do you want to use?");

        for(int i=0; i<dice_list.length; i++) {

            System.out.print(dice_list[i]+" // ");

        }

        System.out.println();

        String input = user.nextLine().toUpperCase();

        while(!(input.equals(dice_list[0])
        ||input.equals(dice_list[1])
        ||input.equals(dice_list[2])
        ||input.equals(dice_list[3])
        ||input.equals(dice_list[4])
        ||input.equals(dice_list[5]))) {

            System.out.println("Invalid input. Please try again:");
            System.out.println();
            input = user.nextLine().toUpperCase();

        }

        if(input.equals(dice_list[0])) {

            System.out.println();
            four_faces.d4_roll();

        } else if(input.equals(dice_list[1])) {

            System.out.println();
            six_faces.d6_roll();

        } else if(input.equals(dice_list[2])) {

            System.out.println();
            eight_faces.d8_roll();

        } else if(input.equals(dice_list[3])) {

            System.out.println();
            ten_faces.d10_roll();

        } else if(input.equals(dice_list[4])) {

            System.out.println();
            twelve_faces.d12_roll();

        } else if(input.equals(dice_list[5])) {

            System.out.println();
            twenty_faces.d20_roll();

        }

        System.out.println("Do you want to try it again? (Y/N)");
        System.out.println();

        String[] repeat_array = {"Y", "N"};
        
        String repeat_input = user.nextLine().toUpperCase();
        System.out.println();
        
        while(!(repeat_input.equals(repeat_array[0])||repeat_input.equals(repeat_array[1]))) {

            System.out.println("Invalid option. Please try again:");
            repeat_input = user.nextLine().toUpperCase();

        }
        
        if(repeat_input.equals(repeat_array[1])) {

            break;

        }
    }

        user.close();

    }
}