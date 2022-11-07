package OddOrEven;

import java.util.Scanner;

public class OddEven {
   
     static boolean isEven(int num) {

          if(num % 2 == 0) {

               return true;
    
          } else {

               return false;

          }

     }
     
     void get_isEven() {

          Scanner scan = new Scanner(System.in);

          System.out.print("Number: ");
          int input = scan.nextInt();
        
          System.out.println("Even: "+isEven(input));

          scan.close();

   }   
     public static void main(String[] args) {
        
          OddEven odd_even = new OddEven();

          odd_even.get_isEven();

     }
}