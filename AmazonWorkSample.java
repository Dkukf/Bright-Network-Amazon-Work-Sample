import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class AmazonWorkSample
{
  // Create a global variable to store the reference to the grid.
  private static Grid grid;

  public static void main(String[] args)
  {
    // Create a grid and store it in the global variable.
    grid = new Grid();
    grid.addObstacle(8,8);
    // Use the recursive method to find a valid path for the vehicle.
    ArrayList<String> validPath = findPath("SOUTHEAST", 0, 0);

    // If there is no path, then report that in the command line.
    if(validPath.size() == 0)
      System.out.println("Unable to reach delivery point");
    // Otherwise, there is a valid path. Report the valid path in the command
    // line along with the number of steps required.
    else
    {
      // Create an iterator from the ArrayList.
      Iterator nextCoordinates = validPath.iterator();

      // Create a string variable to store the coordinates.
      String results = "[";

      // Create a variable to check the number os steps required.
      int noOfSteps = 0;

      // Convert the coordinates into a string for printing.
      while(nextCoordinates.hasNext())
      {
        results += nextCoordinates.next();
        if(nextCoordinates.hasNext())
          results += ", ";
        else
          results += "]";

        // Increment the noOfSteps.
        noOfSteps++;
      } // while
      System.out.println(results);
      System.out.println("Number of steps: " + (noOfSteps - 1));
    } // else
  } // main method

  // This method is a recursive method for finding a valid path to the delivery
  // point.
  public static ArrayList<String> findPath(String originalDirection,
                                           int givenX, int givenY)
  {
    // Base case - If the current grid space is occupied or is out of bounds,
    // then the path is a dead end. Return an empty array.
    if(givenX <= -1 || givenX >= 10 || givenY <= -1 || givenY >= 10
       || grid.isOccupied(givenX, givenY))
      return new ArrayList<String>();

    // Base case - Otherwise, if the current coordinates are (9, 9), then a
    // valid path has been found. Return the current coordinates in a list.
    else if(givenX == 9 && givenY == 9)
    {
      String currentCoordinates = "(" + givenX + ", " + givenY + ")";
      return new ArrayList<String>(Arrays.asList(currentCoordinates));
    } // else if

    // Otherwise, the step case is used.
    else
    {
      // Create an ArrayList of all the directions to parse through.
      ArrayList<String> possibleDirections
        = new ArrayList<String>(Arrays.asList("SOUTHEAST", "EAST", "SOUTH",
                                              "SOUTHWEST", "NORTHEAST", "WEST",
                                              "NORTH", "NORTHWEST"));

      // Remove the direction that is the opposite to the original direction.
      switch(originalDirection)
      {
        case "SOUTHEAST":
          possibleDirections.remove("NORTHWEST");
          break;
        case "EAST":
          possibleDirections.remove("WEST");
          break;
        case "SOUTH":
          possibleDirections.remove("NORTH");
          break;
        case "SOUTHWEST":
          possibleDirections.remove("NORTHEAST");
          break;
        case "NORTHEAST":
          possibleDirections.remove("SOUTHWEST");
          break;
        case "WEST":
          possibleDirections.remove("EAST");
          break;
        case "NORTH":
          possibleDirections.remove("SOUTH");
          break;
        case "NORTHWEST":
          possibleDirections.remove("SOUTHEAST");
          break;
        default:
          break;
      } // switch

      // Convert the ArrayList into an array.
      String[] remainingDirections
      = possibleDirections.toArray(new String[possibleDirections.size()]);

      // Parse through each of the remaining directions.
      for(String currentDirection : remainingDirections)
      {
        // Store a copy of the x-coordinates and y-coordnates.
        int currentX = givenX;
        int currentY = givenY;

        // Use the currentDirection to figure out which coordinates to pass
        // onto the next iteration of the recursive method.
        switch(currentDirection)
        {
          case "SOUTHEAST":
            currentX++;
            currentY++;
            break;
          case "EAST":
            currentX++;
            break;
          case "SOUTH":
            currentY++;
            break;
          case "SOUTHWEST":
            currentX--;
            currentY++;
            break;
          case "NORTHEAST":
            currentX++;
            currentY--;
            break;
          case "WEST":
            currentX--;
            break;
          case "NORTH":
            currentY--;
            break;
          case "NORTHWEST":
            currentX--;
            currentY--;
            break;
          default:
            break;
        } // switch
        // Step case - If the recursive method yields a non-empty array, then
        // return the current coordinates to the previous iteration of the
        // recursive method along with all the coordinates that have been
        // supplied.
        ArrayList<String> currentPath = findPath(currentDirection, currentX,
                                                 currentY);
        if(currentPath.size() != 0)
        {
          String currentCoordinates = "(" + givenX + ", " + givenY + ")";
          currentPath.add(0, currentCoordinates);
          return currentPath;
        } // if
      } // for
    } // else

    // If there are no valid paths, then return an empty string.
    return new ArrayList<String>();
  } // findPath method
} // AmazonWorkSample class
