//Ryan Talmage
//CSC1060681
//November 27th 2023
//Homework 6: In this program a variation of craps will be played
public class Main {
    public static void main(String[] args) {
        //role dice for first roll and gather the total

        int firstRollDice1 = (int)(Math.random()*6) + 1;
        int firstRollDice2= (int)(Math.random()*6) + 1;
        int firstDiceRollTotal= firstRollDice1 + firstRollDice2;
        System.out.println("Your fist roll is a " + firstDiceRollTotal);


//outcomes for first roll of the dice which are losing, winning or setting the point so the game continues
        if(firstDiceRollTotal == 2 || firstDiceRollTotal == 3 || firstDiceRollTotal == 12) {
            System.out.println("oh crap you got craps you lose!");
        } else if (firstDiceRollTotal == 7 || firstDiceRollTotal ==11) {
            System.out.println("Natural, you Win!");
        } else {
            System.out.println("Point has been set to " + firstDiceRollTotal + " Good Luck!");
            //establish point variable
            int point = firstDiceRollTotal;

            //loop to roll dice until either a 7 or point value is rolled
            while(true) {
                int dice1 = (int)(Math.random()*6) + 1;
                int dice2= (int)(Math.random()*6) + 1;
                int rolltotal = dice1 + dice2;
                System.out.println("You rolled a " + rolltotal);
                if(rolltotal == point) {
                    System.out.println("you Win!");
                    break;
                } else if (rolltotal == 7) {
                    System.out.println("you got the unlucky 7, you lose!");
                    break;
                }
            }
        }




    }
}