
/**
 * This program plays the game of craps
 *
 * @author Kate Salembier
 * @version 2020-01-14
 */
import java.util.Scanner;
public class Craps
{
    public static void playGame()
    {
        // first roll 
        Scanner in = new Scanner(System.in);
        Die game = new Die();
        int firstD1 = 0;
        int firstD2 = 0;
        int firstSum = 0;
        int nextD1 = 0;
        int nextD2 = 0;
        int nextSum = 0;
        System.out.println("Press <Enter> to roll the die");
        String firstRoll = in.nextLine();
        System.out.println("");
        if (firstRoll.equals(""))
        {
            firstD1 = game.RollD1();
            firstD2 = game.RollD2();
            firstSum = firstD1 + firstD2;
            System.out.println("You rolled a " + firstD1 + " and a " + firstD2 + " for a " + firstSum);
            System.out.println("");
        }
        if (firstSum == 7 || firstSum == 11)
        {
            System.out.println("Congratulations! You win!");
        }
        else if (firstSum == 2 || firstSum == 3 || firstSum ==12)
        {
            System.out.println("Oh no! You lose!");
        }
        else 
        {
            System.out.println("Your point is now: " + firstSum);
            System.out.println("");
            System.out.println("Press <Enter> to roll again");
            String nextRoll = in.nextLine();
            while (nextRoll.equals(""))
            {
                nextD1 = game.RollD1();
                nextD2 = game.RollD2();
                nextSum = nextD1 + nextD2;
                System.out.println("You rolled a " + nextD1 + " and a " + nextD2 + " for a " + nextSum);
                if (nextSum == 7)
                {
                    System.out.println("");
                    System.out.println("Oh no! You rolled a 7 before your rolled a " + firstSum + "! That means you lose!");
                    break;
                }
                else if (nextSum == firstSum)
                {
                    System.out.println("");
                    System.out.println("Congratulations! You rolled your point! You win!");
                    break;
                }
                else
                {
                    System.out.println("");
                    System.out.println("You didn't roll your point or a 7! Roll on!");
                    System.out.println("");
                    System.out.println("Press <Enter> to roll again");
                    nextRoll = in.nextLine();
                    System.out.println("");
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.println("WELCOME TO THE GAME OF CRAPS");
        System.out.println("");
        System.out.println("Would you like instructions (y/N)?");
        String instructions = in.nextLine();
        System.out.println("");
        if (instructions.equals("") || instructions.substring(0,1).toLowerCase().equals("n"))
        {
            // they pass on instructions
        }
        else 
        {
            System.out.println("HOW TO PLAY CRAPS");
            System.out.println("");
            System.out.println("A player rolls two six-sided dice and finds the sum of the two die.");
            System.out.println("On this first roll, a 7 or an 11 automatically wins, and a 2, 3, or 12 automatically loses, and play is over");
            System.out.println("If a 4, 5, 6, 8, 9, or 10 are rolled on this first roll, that number becomes the 'point'");
            System.out.println("The player continues to roll the two dice again until one of two things happens:");
            System.out.println("either they roll the'point' from that first roll again, in which case they win");
            System.out.println("or they roll a 7, in which case they lose");
        }

        System.out.println("");
        System.out.println("Would you like to play craps (Y/n)?");
        String play = in.nextLine();
        System.out.println("");
        if (play.equals("") || play.substring(0,1).toLowerCase().equals("y"))
        {
            playGame();
        }

        System.out.println("");
        System.out.println("Would you like to play again (Y/n)?");
        String playAgain = in.nextLine();
        System.out.println("");
        while (playAgain.equals("") || playAgain.substring(0,1).toLowerCase().equals("y"))
        {
            playGame(); 
            System.out.println("");
            System.out.println("Would you like to play again (Y/n)?");
            playAgain = in.nextLine();
            System.out.println("");
        }

        System.out.println("Thank you for playing!");
    }
}
