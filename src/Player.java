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
        int moveOption = (int)(Math.random()*3);
        if (moveOption == 1)
        {
            //No move
            return;
        }
        else if (moveOption == 1)
        {
            //ladder
            currentPosition += steps;
        }
        else
        {
            //snake
            currentPosition -= steps;
        }
        System.out.println("Current updated position of the player is " + currentPosition);
    }
}
