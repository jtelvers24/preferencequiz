package edu.wctc;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int score = 0;
        System.out.println("Welcome to the Preference Quiz!");
        Scanner keyboardInput = new Scanner(System.in);

            System.out.println("Do You Prefer mild or spicy");
            System.out.println("Enter 0 for the preference on the left");
            System.out.println("Enter 1 for the preference on the right");
            int answer = Integer.parseInt(keyboardInput.nextLine());

            if (answer == 1){
                score ++;
            }
            System.out.println("Do You Prefer tea or coffee");
            System.out.println("Enter 0 for the preference on the left");
            System.out.println("Enter 1 for the preference on the right");
            int answer2 = Integer.parseInt(keyboardInput.nextLine());
            if (answer2 == 1){
                score ++;
            }
            System.out.println("Do You Prefer breakfast or brunch");
            System.out.println("Enter 0 for the preference on the left");
            System.out.println("Enter 1 for the preference on the right");
            int answer3 = Integer.parseInt(keyboardInput.nextLine());
            if (answer3 == 1){
                score ++;
            }
            System.out.println("Do You Prefer summer or winter");
            System.out.println("Enter 0 for the preference on the left");
            System.out.println("Enter 1 for the preference on the right");
            int  answer4 = Integer.parseInt(keyboardInput.nextLine());
            if (answer4 ==1){
                score ++;
            }
            System.out.println("Do You Prefer paper or plastic");
            System.out.println("Enter 0 for the preference on the left");
            System.out.println("Enter 1 for the preference on the right");
            int answer5 = Integer.parseInt(keyboardInput.nextLine());
            if (answer5 == 1){
                score ++;
            }
            System.out.println("Your Score: " + score);
            if (score < 3){
                System.out.printf("You prefer life to be calm and organized");
            }
            else if (score > 3){
                System.out.printf("You prefer life to be spontaneous and active");
            }
            else if (score==3){
                System.out.printf("You prefer a good balance in life");
            }



    }
    }

