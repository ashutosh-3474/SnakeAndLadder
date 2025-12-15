//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to snake and ladder game");

        //instance of player class
        Player player1 = new Player();
        Player player2 = new Player();
        //instance of dice class
        Dice dice = new Dice();

        //loop to make move till any of the 2 player reached to 100
        while (player1.getCurrentPosition() < 100 && player2.getCurrentPosition() < 100)
        {
            //roll dice to get number of steps player 1
            int step1 = dice.roll();

            //make move for player 1
            player1.move(step1);

            //check for win of player 1
            if (player1.getCurrentPosition() == 100)
            {
                System.out.println("Player 1 won!!");
                break;
            }

            //roll dice to get number of steps player 2
            int step2 = dice.roll();

            //make move for player 2
            player2.move(step2);

            //check for win of player 2
            if (player2.getCurrentPosition() == 100)
            {
                System.out.println("Player 2 won!!");
                break;
            }
        }

        //final state of the game
        System.out.println("Player 1:");
        System.out.println("Position: " + player1.getCurrentPosition());
        System.out.println("Total number of Dice Rolls: " + player1.getTotalNumberOfDiceRoll());

        System.out.println("Player 2:");
        System.out.println("Position: " + player2.getCurrentPosition());
        System.out.println("Total number of Dice Rolls: " + player2.getTotalNumberOfDiceRoll());

    }
}