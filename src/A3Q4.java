
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
 * @author manok5757
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City km = new City();

        // create a new robot
        RobotSE cliff = new RobotSE(km, 0, 2, Direction.WEST);

        // make square for cliff to go around
        new Wall(km, 1, 1, Direction.WEST);
        new Wall(km, 2, 1, Direction.WEST);
        new Wall(km, 2, 1, Direction.SOUTH);
        new Wall(km, 2, 2, Direction.SOUTH);
        new Wall(km, 2, 2, Direction.EAST);
        new Wall(km, 1, 2, Direction.EAST);
        new Wall(km, 1, 1, Direction.NORTH);
        new Wall(km, 1, 2, Direction.NORTH);


        // create loop to make bob go around square 2 times
        int moves = 0;
        // set amount of times it has to move to get around the square 2 times
        while (moves < 8) {
            moves = moves + 1;
            cliff.move();
            cliff.move();
            cliff.turnLeft();
            cliff.move();




        }
    }
}
