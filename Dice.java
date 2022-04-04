package hillel.lesson7;

import java.util.Random;

public class Dice {
    private static int noOfPlayers = 3;


    public static void main(String[] args) {
        rollDices();
        serveDices();
    }

    private static int rollDices() {
        Random random = new Random();
        return random.nextInt(6) + 1;

        }

        private static void serveDices() {
        int dice1, dice2;
        for (int round = 1; round <= 3; round++) {
            System.out.println("Round" + round);
            for (int player = 1; player <= noOfPlayers; player++) {
                dice1 = rollDices();
                dice2 = rollDices();
                System.out.printf("Player %d gets dices: dice1 = %d, dice2 = %d\n", player, dice1, dice2);
            }
            System.out.println("");
        }

    }


}
