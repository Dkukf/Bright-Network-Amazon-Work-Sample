// This template is used to create Obstacle objects for the AmazonWorkSample
// class.
public class Obstacle
{
  // Declare the variables for the position of the obstacle object.
  private int xPosition;
  private int yPosition;

  // Constructor method for the Obstacle object.
  public Obstacle(int givenX, int givenY)
  {
    // Store the given coordinates into the variables of the object.
    setX(givenX);
    setY(givenY);
  } // Obstacle method

  // This method returns the x-coordinate of the obstacle object.
  public int getX()
  {
    return xPosition;
  } // giveX method

  // This method returns the y-coordinate of the obstacle object.
  public int getY()
  {
    return yPosition;
  } // giveY method

  // This method sets the x-coordinate of the obstacle object.
  public void setX(int givenX)
  {
    xPosition = givenX;
  } // setX method

  // This method sets the y-coordinate of the obstacle object.
  public void setY(int givenY)
  {
    yPosition = givenY;
  } // setX method

  // This method reports the location of the obstacle object when invoked.
  public String toString()
  {
    return "(" + Integer.toString(xPosition) + ", "
           + Integer.toString(yPosition) + ")";
  } // toString method
} // Obstacle class
