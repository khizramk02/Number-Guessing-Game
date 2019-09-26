package practice;

import java.util.Random;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I know your Name please: ");
        String name = scanner.next();
        System.out.println("WELCOME "+name);
        System.out.println("shall we begin?");
        String answer = scanner.next();
        if(answer.equalsIgnoreCase("yes")){
          System.out.println("Please enter the number: ");
        int number = scanner.nextInt();
        
        Random num = new Random();
        int x = num.nextInt(20)+1;
        
        int timestried = 0;
        boolean haswon = false;
        boolean shouldfinish = false;
        
        while(!shouldfinish){
            if(timestried>4){
                shouldfinish = true;
                haswon = false;
            }
            if (number== x){
            haswon = true;
            shouldfinish = true;
                
    }
        else if (number<x){
            System.out.println("Guess higher");
            number = scanner.nextInt();
            timestried++;
        
    }
        else{
            System.out.println("Guess smaller");
            number = scanner.nextInt();
            timestried++;
        }  
        
}
        if(haswon){
            System.out.println("CONGRATULATIONS, you have won the game in "+timestried+ "times");
            
            
        }
        else{
            System.out.println("game over");
            System.out.println("the number was: "+x);
        }
        
        
        
}
        else{
            System.out.println("bye");
        }
        
        
    
}
}
