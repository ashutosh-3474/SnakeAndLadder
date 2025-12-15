//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to snake and ladder game");

        //instance of player class
        Player player = new Player();
        //instance of dice class
        Dice dice = new Dice();


        //print statements
        System.out.println("Player's current position " + player.getCurrentPosition());

        //loop to make move till player reached to 100
        while (player.getCurrentPosition() < 100)
        {
            //roll dice to get number of steps
            int step = dice.roll();
            System.out.println("step" + step);

            //make move
            player.move(step);
        }

    }
}