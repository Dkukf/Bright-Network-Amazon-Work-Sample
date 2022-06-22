import java.util.ArrayList;
import java.util.Random;

// This class is used to create Grid objects, which oversees all the Obstacle
// objects for the AmazonWorkSample program.
public class Grid
{
  // Declare the variables of the Grid object.
  private Obstacle[][] gridArray;
  private ArrayList<Obstacle> obstacleList;

  // Constructor method for Grid objects. It creates a 10 x 10 grid and "adds"
  // Obstacle objects at (9, 7), (8, 7), (6, 7) and (6, 8).
  public Grid()
  {
    // Initialise the 2D array to simulate the grid.
    gridArray = new Obstacle[10][10];

    // Initialise the ArrayList.
    obstacleList = new ArrayList<Obstacle>();

    // Create the obstacles and store the references to the obstacleList.
    obstacleList.add(new Obstacle(9, 7));
    obstacleList.add(new Obstacle(8, 7));
    obstacleList.add(new Obstacle(6, 7));
    obstacleList.add(new Obstacle(6, 8));

    // Store the references in the grid.
    for(int index = 0; index < obstacleList.size(); index++)
    {
      // Retrieve the coordinates of each of the obstacles and use it to find
      // the location to store the references.
      int currentObstacleX = obstacleList.get(index).getX();
      int currentObstacleY = obstacleList.get(index).getY();
      gridArray[currentObstacleX][currentObstacleY] = obstacleList.get(index);
    } // for

    // Store the references of two newly created Obstacle objects into
    // the grid at (0, 0) and (9, 9), which acts as the self-driving vehicle
    // and delivery point respectively.
    gridArray[0][0] = new Obstacle(0, 0);
    gridArray[9][9] = new Obstacle(9, 9);
  } // Grid method

  // This method is used to return the reference of the list of obstacles.
  public ArrayList<Obstacle> getObstacleList()
  {
    return obstacleList;
  } // getObstaclesList method

  // This method is used to check if the selected grid is currently occupied.
  public boolean isOccupied(int givenX, int givenY)
  {
    // If the given coordinates are (0, 0), (9, 9) or null, return false.
    // Otherwise, return true.
    if((givenX == 9 && givenY == 9) || (givenX == 0 && givenY == 0)
       || gridArray[givenX][givenY] == null)
      return false;
    else
      return true;
  } // isOccupied method

  // This method adds an obstacle to the grid.
  public void addObstacle(int givenX, int givenY, int mode)
  {
    // Create a new Obstacle object.
    Obstacle newObstacle = new Obstacle(givenX, givenY);

    // Add the obstacle to the grid.
    gridArray[givenX][givenY] = newObstacle;

    // If mode 0, add the obstacle reference to the obstacleList.
    // Otherwise, ignore.
    if (mode == 0)
      obstacleList.add(newObstacle);
  } // addObstacle method

  // This method is invoked if it is phase 2.
  public void phaseTwo()
  {
    // Keep track of the number of obstacles that have been genereated.
    int noOfRandomObstacles = 0;

    // Create a Random object.
    Random numberGenerator = new Random();

    // Use a while loop to generate 20 obstacles at random locations.
    while(noOfRandomObstacles < 20)
    {
      // Generate two new random numbers for the x and y coordinates, bounded
      // between 0 and 9.
      int randomX = numberGenerator.nextInt(10);
      int randomY = numberGenerator.nextInt(10);

      // Check that the location is not (0, 0) or (9, 9) or is occupied by
      // an obstacle.
      if(!(this.isOccupied(randomX, randomY) || (randomX == 0 && randomY == 0)
         || (randomX == 9 && randomY == 9)))
      {
        // If the location is free, then add the obstacle to the grid.
        this.addObstacle(randomX, randomY, 0);

        // Afterwards, increment the noOfRandomObstacles
        noOfRandomObstacles++;
      } // if
    } // for
  } // phaseTwo method
} // Grid class
