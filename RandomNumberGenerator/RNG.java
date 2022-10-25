package RandomNumberGenerator;

import java.util.Scanner;
import java.util.Random;

public class RNG {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        Random rand = new Random();
        
        int userMin, userMax;
        int rng;

        System.out.println("RNG do Caio MUITO FODAAAAA!!");
        System.out.println("Especifique o valor mínimo (deve ser maior ou igual a 0).");
        userMin = userInput.nextInt();
        
        while(true) {
            
            if(userMin>=0) {
                
                break;

            } else {
                
                System.out.println("O número mínimo inserido deve ser maior ou igual a 0.");
                userMin = userInput.nextInt();
                
            }
        }
        
        System.out.println("E agora o valor máximo (deve ser maior que o número mínimo). ");
        userMax = userInput.nextInt();
        
        while(true) {
            
            if(userMax>userMin) {
                
                break;

            } else if(userMax<userMin) {
                
                System.out.println("O número máximo inserido deve ser maior que o mínimo inserido.");
                userMax = userInput.nextInt();

            }
        }
        
        rng = rand.nextInt(userMin, userMax);
        
        System.out.println("Seu número é... "+rng);
        userInput.close();
    
    }
}