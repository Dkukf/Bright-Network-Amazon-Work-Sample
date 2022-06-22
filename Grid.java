import java.util.ArrayList;

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
  public ArrayList<Obstacle> getObstaclesList()
  {
    return obstacleList;
  } // getObstaclesList method
} // Grid class
