
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
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City km = new City();

        // create a robot
        RobotSE cliff = new RobotSE(km, 3, 3, Direction.SOUTH);

        // create 4 blocks of walls for cliff to navigate around
        new Wall(km, 1, 1, Direction.WEST);
        new Wall(km, 2, 1, Direction.WEST);
        new Wall(km, 1, 1, Direction.NORTH);
        new Wall(km, 1, 2, Direction.NORTH);
        new Wall(km, 1, 2, Direction.EAST);
        new Wall(km, 2, 2, Direction.EAST);
        new Wall(km, 2, 1, Direction.SOUTH);
        new Wall(km, 2, 2, Direction.SOUTH);

        new Wall(km, 1, 4, Direction.WEST);
        new Wall(km, 2, 4, Direction.WEST);
        new Wall(km, 1, 4, Direction.NORTH);
        new Wall(km, 1, 5, Direction.NORTH);
        new Wall(km, 1, 5, Direction.EAST);
        new Wall(km, 2, 5, Direction.EAST);
        new Wall(km, 2, 4, Direction.SOUTH);
        new Wall(km, 2, 5, Direction.SOUTH);

        new Wall(km, 4, 1, Direction.WEST);
        new Wall(km, 5, 1, Direction.WEST);
        new Wall(km, 4, 1, Direction.NORTH);
        new Wall(km, 4, 2, Direction.NORTH);
        new Wall(km, 4, 2, Direction.EAST);
        new Wall(km, 5, 2, Direction.EAST);
        new Wall(km, 5, 1, Direction.SOUTH);
        new Wall(km, 5, 2, Direction.SOUTH);

        new Wall(km, 4, 4, Direction.WEST);
        new Wall(km, 5, 4, Direction.WEST);
        new Wall(km, 4, 4, Direction.NORTH);
        new Wall(km, 4, 5, Direction.NORTH);
        new Wall(km, 4, 5, Direction.EAST);
        new Wall(km, 5, 5, Direction.EAST);
        new Wall(km, 5, 4, Direction.SOUTH);
        new Wall(km, 5, 5, Direction.SOUTH);

        // create an algortithim which allows cliff to navigate the 4 blocks in the desired way
        // create a for loop to only allow bob to move around the 4 blocks
        for (int i = 0; i < 4; i = i + 1) {
            // create a for loop to make cliff do these actions below three times and that will get him across one block, and do it a total of 4 times
            for (int g = 0; g < 3; g = g + 1) {

                cliff.move();
                cliff.move();
                cliff.move();
                cliff.turnLeft();
            }
            //after cliff completes one block he has to move an extra 3 times to reach the next block
            cliff.move();
            cliff.move();
            cliff.move();
        }
    }
}