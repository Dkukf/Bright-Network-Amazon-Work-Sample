// This template is used to create a self-driving vehicle object for the
// AmazonWorkSample class.
public class SelfDrivingVehicle
{
  // Declare the variables for the position of the vehicle.
  private int xPosition;
  private int yPosition;

  // This is the constructor method of the self-driving vehicle object.
  public SelfDrivingVehicle()
  {
    // Initially, the position of the vehicle is at (0, 0).
    xPosition = 0;
    yPosition = 0;
  } // selfDrivingVehicle method

  // This method is used to move the self-driving vehicle in a diagonal
  // direction.
  public void move(String givenDirection)
  {
    // Use a switch statement to determine which direction to move the vehicle.
    switch(givenDirection)
    {
      // If the vehicle is moving to the southeast, then add 1 to both the
      // x position and y position variables.
      case "Southeast":
        xPosition++;
        yPosition++;
        break;
      // If the vehicle is moving to the northeast, then add 1 to the x
      // position variable and subtract 1 from the y position variable.
      case "Northeast":
        xPosition++;
        yPosition--;
        break;
      // If the vehicle is moving to the southwest, then subtract 1 from the x
      // position variable and add 1 to the y position variable.
      case "Southwest":
        xPosition--;
        yPosition++;
        break;
      // If the vehicle is moving northwest, then subtract 1 from both the x
      // and y position variables.
      case "Northwest":
        xPosition--;
        yPosition--;
        break;
      // If the vehicle moves east, then add 1 to the x position variable.
      case "East":
        xPosition++;
        break;
      // If the vehicle moves south, then add 1 to the y position variable.
      case "South":
        yPosition++;
        break;
      // If the vehicle moves west, then subtract 1 from the x position
      // variable.
      case "West":
        xPosition--;
        break;
      // If the vehicle moves north, then subtract 1 from the y position
      // variable.
      case "North":
        yPosition--;
        break;
      // If the instruction was unclear, then do nothing.
      default:
        break;
    } // switch
  } // move method

  // This method reports the location of the vehicle object when invoked.
  public String toString()
  {
    return "(" + Integer.toString(xPosition) + ", "
           + Integer.toString(yPosition) + ")";
  } // toString method
} // SelfDrivingVehicle class
