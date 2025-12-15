public class Player {
    //current position of the player during game
    private  int currentPosition;
    //to track total number of dice roll to reach win position
    private  int totalNumberOfDiceRoll = 0;


    //constructor
    public Player() {
        //initialise current position with zero
        this.currentPosition = 0;
    }

    //getters
    public int getCurrentPosition() {
        return currentPosition;
    }

    public int getTotalNumberOfDiceRoll() {
        return totalNumberOfDiceRoll;
    }

    public void move(int steps)
    {
        //increment the number of dice roll
        totalNumberOfDiceRoll++;

        //store the previous position to use later
        int previousPosition = currentPosition;

        //use random method to get one out of possible move (no play, ladder, snake)
        int moveOption = (int)(Math.random()*3);

        if (moveOption == 1)
        {
            //No move
            return;
        }
        else if (moveOption == 2)
        {
            //ladder
            currentPosition += steps;
        }
        else
        {
            //snake
            currentPosition -= steps;
        }

        //update the position to 0, if it goes negative
        if (currentPosition < 0) currentPosition = 0;

        //update positon to previous position if it goes beyond 100 to meet exact win condition
        if (currentPosition > 100) currentPosition = previousPosition;

        System.out.println("Current updated position of the player is " + currentPosition);
    }
}
