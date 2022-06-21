// This template is used to create Obstacle objects for the AmazonWorkSample
// class.
public class Obstacle
{
  // Declare the variables for the position of the obstacle.
  private int xPosition;
  private int yPosition;

  // Constructor method for the Obstacle object.
  public Obstacle(int givenX, int givenY)
  {
    // Store the given coordinates into the variables of the object.
    xPosition = givenX;
    yPosition = givenY;
  } // Obstacle method

  // This method returns the x-coordinate of the obstacle.
  public int getX()
  {
    return xPosition;
  } // giveX method

  // This method returns the y-coordinate of the obstacle.
  public int getY()
  {
    return yPosition;
  } // giveY method

  // The toString method returns the coordinates of the obstacle.
  public String toString()
  {
    return "(" + Integer.toString(xPosition) + ", "
           + Integer.toString(yPosition) + ")";
  } // toString method
} // Obstacle class
