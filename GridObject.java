// This is an abstract class for the Obstacle and SelfDrivingVehicle classes.
// The xPosition and yPosition coordinate variables must be implemented.
abstract class GridObject
{
  // Declare the variables for the position of the grid object.
  private int xPosition;
  private int yPosition;

  // This method returns the x-coordinate of the grid object.
  public int getX()
  {
    return xPosition;
  } // giveX method

  // This method returns the y-coordinate of the grid object.
  public int getY()
  {
    return yPosition;
  } // giveY method

  // This method sets the x-coordinate of the grid object.
  public void setX(int givenX)
  {
    xPosition = givenX;
  } // setX method

  // This method sets the y-coordinate of the grid object.
  public void setY(int givenY)
  {
    yPosition = givenY;
  } // setX method

  // This method reports the location of the GridObject when invoked.
  public String toString()
  {
    return "(" + Integer.toString(xPosition) + ", "
           + Integer.toString(yPosition) + ")";
  } // toString method
} // GridObject class
