//Ryan Talmage
//CSC 1060681 Java 1
//December 9th 2023
//In this program the game 30 or Bust will be played between 2 players


import java.util.Scanner;

public class Main {

    //creates a class for rolling the dice
    public static class rollDice {
        //method roll created and can be used outside the class rollDice
        public static int roll() {
            //return is used so that whatever number is generated in lines below is able to be used as the value for a dice when it is rolled
            //later in the code
            return (int) (Math.random() *6) +1;
        }
    }

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        //Gather the names of the 2 players
        System.out.println("What is the name of the player who dares to go first? ");
        String Player1 = Scan.nextLine();

        System.out.println("What is the name of the player who would like to go second? ");
        String Player2 = Scan.nextLine();

        //Introducing the players to the game and explaining the rules

        System.out.println("Welcome " + Player1 + " and " + Player2 + " Today you have embarked on a great journey to play the thrilling game: 30 or bust");
        System.out.println("In this game you and another player will take turns rolling a pair of dice, once you have rolled the dice, you can choose 1 of 3 options");
        System.out.println("option 1 add the value of dice 1 to your player score, option 2 add the value of dice 2 to your player score,option 3 add the total of the 2 dice to your player score");
        System.out.println("You will continue to take turns with the other player until one player is able to get to exactly 30, if you go over 30 your score will reset to 0 but the game will continue");

        //Players are asked if they would like a tip which can be useful for game strategy
        System.out.println("Would you like to know a tip that could help you in this game? (Please enter yes or no): ");
        String tip = Scan.nextLine();

        //if users choose yes the if case will be executed, when no or anything else is inputted the game will tell them they are experts

        if (tip.equalsIgnoreCase("yes")) {
            System.out.println("TIP: When rolling a pair of dice, the most common dice total that is rolled is 7, this has a 1 in 6 chance of occuring");
        } else {
            System.out.println("Looks like you 2 are experts");
        }
        //blank line is printed for ease of reading for players
        System.out.println(" ");

        //wish players luck and remind them most important game rule
        System.out.println("I wish you the best of luck " + Player1 + " and " + Player2 + " remember that the first player to get their player score to exactly 30 is the Big Winner!!");

        //programming 30 or bust game


        //key variables such as the players scores, dice values, and dice total values are initialized
        int player1Score = 0;
        int player2Score = 0;
        int dice1 = 0;
        int dice2 = 0;
        int diceTotal = 0;

        //the line below comments starts the while loop, the entire game is written under this while loop so the game simply continues
        //until a break is encountered and the only 2 breaks are when player 1 or player 2 wins the game.
        while (true) {
            //begins by telling player1 that it is their turn and their score
            System.out.println(Player1 + " Your Turn!");
            System.out.println("Your score is " + player1Score);
            //pair of dice are rolled and the results are displayed to the player
            //to get dice values, the rollDice class which contains the roll method is used to get random dice values
            dice1 = rollDice.roll();
            dice2 = rollDice.roll();
            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);
            diceTotal= (dice1 + dice2);
            System.out.println("Dice Total: " + diceTotal);

            //player is asked their decision and can input 1,2 or 3. this value is stored under the decision variable
            System.out.println("Which would you like to add to your total score? (1) dice 1 only (2) dice2 only (3) dice 1 and 2 total, Please enter 1 2 or 3");
            int decision = Scan.nextInt();

            //this if statement updates the players score according to their decision, the else condition is for when there
            // is an invalid input, they will be just be given a warning and their score will be updated to the value of dice1
            if (decision == 1) {
                player1Score = player1Score + dice1;
            } else if (decision == 2) {
                player1Score = player1Score + dice2;
            } else if (decision == 3) {
                player1Score = player1Score + diceTotal;
            }
            else {
                System.out.println("This input was INVALID, please make sure you enter 1 2 or 3, for this turn, dice 1 will be added to your total for this turn");
                player1Score = player1Score + dice1;
            }

            //This if statement checks the players new score at the end of the round to see if won
            //busted or won, and the printlin statement under each prints to the terminal so the player knows their status
            if (player1Score < 30) {
                System.out.println( Player1 + " Your score is now: " + player1Score);
            } else if (player1Score > 30) {
                player1Score = 0;
                System.out.println("Uh Oh you busted! " + Player1 + " Your score is now: " + player1Score);
            //break after the else condition because this means they have one and the game is over, so code can be exited
            } else {
                System.out.println("Banggggg! " + Player1 + " You are the Big Winner!!!");
                break;
            }
            ////blank line is printed so that players turns are visually separated in the terminal
            System.out.println(" ");

            //Player #2's turn
            //Player #2 is coded exactly the same as player1, just the Player1 and player1Score variable
            //are changed to Player2 and player2Score
            System.out.println(Player2 + " Your Turn!");
            System.out.println("Your score is " + player2Score);
            dice1 = rollDice.roll();
            dice2 = rollDice.roll();
            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);
            diceTotal= (dice1 + dice2);
            System.out.println("Dice Total: " + diceTotal);
            System.out.println("Which would you like to add to your total score? (1) dice 1 only (2) dice2 only (3) dice 1 and 2 total, Please enter 1 2 or 3");
            decision = Scan.nextInt();
            if (decision == 1) {
                player2Score = player2Score + dice1;
            } else if (decision == 2) {
                player2Score = player2Score + dice2;
            } else if (decision == 3) {
                player2Score = player2Score + diceTotal;
            }else {
                System.out.println("This input was INVALID, please make sure you enter 1 2 or 3, for this turn, dice 1 will be added to your total for this turn");
                player1Score = player1Score + dice1;
            }
            if (player2Score < 30) {
                System.out.println( Player2 + " Your score is now: " + player2Score);
            } else if (player2Score > 30) {
                player2Score = 0;
                System.out.println( "Uh Oh you busted! " + Player2 + " Your score is now: " + player2Score);
            } else {
                System.out.println("Banggggg! " + Player2 + " You are the Big Winner!!!");
                break;
            }
            System.out.println( " ");
            //Since this is a while true loop, once player 2's turn is over, the code loops back to start of loop
            //Once again the only way to stop the loop and exit the code is for a player to win the game

        }
    }
}