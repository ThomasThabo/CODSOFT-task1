package com.mycompany.numbergame;

import java.util.Random;
import java.util.Scanner;
public class NumberGame {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
       
        
        
        int int1 = random.nextInt(100)+1;
        int max = 5;
        int attempts = 0;
        
        System.out.println("You have " + max +" attempts to Guess the correct number");
        
       while (attempts < max) {
        System.out.println("Guess a number 1 to 100 (Attempts remaining: " + (max - attempts)+ "):" );
        int Guess = scanner.nextInt();
        scanner.nextLine();
        
       
         if(Guess == int1){
        System.out.println("You guessed Correctly!!");
        break;
        }
         else if(Guess < int1){
         System.out.println("Sorry your Guess was too Low.Try again.");
         }
         else if(Guess > int1){
         System.out.println("Sorry your Guess was too High.Try again.");
         }
         
         attempts ++;
         
         if (attempts == max){
             System.out.println("Sorry you have run out of attempts.  The correct Number was: " + int1 );
         }
         }
     
         scanner.close();
    }
}
