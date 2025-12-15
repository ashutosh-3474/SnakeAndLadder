public class Player {
    //current position of the player during game
    private  int currentPosition;

    //constructor
    public Player() {
        //initialise current position with zero
        this.currentPosition = 0;
    }

    //getter for the current position
    public int getCurrentPosition() {
        return currentPosition;
    }

    public void move(int steps)
    {
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
