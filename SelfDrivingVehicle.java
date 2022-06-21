// This template is used to create a self-driving vehicle object for the
// AmazonWorkSample class.
public class SelfDrivingVehicle extends GridObject
{
  // Declare an instance variable to store the number of steps taken by the
  // vehicle.
  private int noOfSteps;

  // This is the constructor method of the self-driving vehicle object.
  public SelfDrivingVehicle()
  {
    // Initially, the position of the vehicle is at (0, 0).
    setX(0);
    setY(0);

    // The number of steps for the vehicle is also 0.
    noOfSteps = 0;
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
        setX(getX() + 1);
        setY(getY() + 1);
        break;
      // If the vehicle is moving to the northeast, then add 1 to the x
      // position variable and subtract 1 from the y position variable.
      case "Northeast":
        setX(getX() + 1);
        setY(getY() - 1);
        break;
      // If the vehicle is moving to the southwest, then subtract 1 from the x
      // position variable and add 1 to the y position variable.
      case "Southwest":
        setX(getX() - 1);
        setY(getY() + 1);
        break;
      // If the vehicle is moving northwest, then subtract 1 from both the x
      // and y position variables.
      case "Northwest":
        setX(getX() - 1);
        setY(getY() - 1);
        break;
      // If the vehicle moves east, then add 1 to the x position variable.
      case "East":
        setX(getX() + 1);
        break;
      // If the vehicle moves south, then add 1 to the y position variable.
      case "South":
        setY(getY() + 1);
        break;
      // If the vehicle moves west, then subtract 1 from the x position
      // variable.
      case "West":
        setX(getX() - 1);
        break;
      // If the vehicle moves north, then subtract 1 from the y position
      // variable.
      case "North":
        setY(getY() - 1);
        break;
      // If the instruction was unclear, then do nothing.
      default:
        break;
    } // switch
  } // move method

  // This method is used to increment the noOfSteps variable.
  public void incrementNoOfSteps()
  {
    noOfSteps++;
  } // incrementNoOfSteps method

  // This method is used to decrement the noOfSteps variable.
  public void decrementNoOfSteps()
  {
    noOfSteps--;
  } // decrementNoOfSteps method

  // This method is used to return the noOfSteps taken by the vehicle.
  public int getNoOfSteps()
  {
    return noOfSteps;
  } // getNoOfSteps method
} // SelfDrivingVehicle class
