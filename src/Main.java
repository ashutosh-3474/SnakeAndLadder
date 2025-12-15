//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to snake and ladder game");

        //instance of player class
        Player player = new Player();
        //instance of dice class
        Dice dice = new Dice();

        int steps = dice.roll();

        //print statements
        System.out.println("Player's current position " + player.getCurrentPosition());
        System.out.println("Dice rolled: " + steps);
        player.move(steps);

    }
}