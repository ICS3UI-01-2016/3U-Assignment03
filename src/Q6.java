
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author schum0689
 */
public class Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create city
        City q6 = new City();

        // Create walls
        new Wall(q6, 1, 1, Direction.NORTH);
        new Wall(q6, 1, 2, Direction.NORTH);
        new Wall(q6, 1, 2, Direction.EAST);
        new Wall(q6, 2, 2, Direction.EAST);
        new Wall(q6, 2, 1, Direction.SOUTH);
        new Wall(q6, 2, 2, Direction.SOUTH);
        new Wall(q6, 1, 1, Direction.WEST);
        new Wall(q6, 2, 1, Direction.WEST);

        new Wall(q6, 1, 4, Direction.NORTH);
        new Wall(q6, 1, 5, Direction.NORTH);
        new Wall(q6, 1, 5, Direction.EAST);
        new Wall(q6, 2, 5, Direction.EAST);
        new Wall(q6, 2, 4, Direction.SOUTH);
        new Wall(q6, 2, 5, Direction.SOUTH);
        new Wall(q6, 1, 4, Direction.WEST);
        new Wall(q6, 2, 4, Direction.WEST);

        new Wall(q6, 4, 1, Direction.NORTH);
        new Wall(q6, 4, 2, Direction.NORTH);
        new Wall(q6, 4, 2, Direction.EAST);
        new Wall(q6, 5, 2, Direction.EAST);
        new Wall(q6, 5, 1, Direction.SOUTH);
        new Wall(q6, 5, 2, Direction.SOUTH);
        new Wall(q6, 4, 1, Direction.WEST);
        new Wall(q6, 5, 1, Direction.WEST);

        new Wall(q6, 4, 4, Direction.NORTH);
        new Wall(q6, 4, 5, Direction.NORTH);
        new Wall(q6, 4, 5, Direction.EAST);
        new Wall(q6, 5, 5, Direction.EAST);
        new Wall(q6, 5, 4, Direction.SOUTH);
        new Wall(q6, 5, 5, Direction.SOUTH);
        new Wall(q6, 4, 4, Direction.WEST);
        new Wall(q6, 5, 4, Direction.WEST);

        // Create robot
        RobotSE rick = new RobotSE(q6, 3, 3, Direction.SOUTH);

        // Loop once for each square
        for(int squares = 0; squares < 4; squares = squares + 1){
            // Move for 4 blocks (around square)
            for(int blocks = 0; blocks < 4; blocks = blocks + 1){
                // Move three times
                rick.move();
                rick.move();
                rick.move();
                // Turn left
                rick.turnLeft();
                // if at checkpoint (intersection 3,3), go back to top of loop
                if (rick.getStreet()==3 && rick.getAvenue()==3){
                    
                }
            }
        }
            
    }
}
