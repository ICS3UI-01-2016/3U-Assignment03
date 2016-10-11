
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author slatz8075
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for the robot
        City A3Q4 = new City();
        //Create a Robot
        Robot karel = new Robot(A3Q4, 0, 2, Direction.WEST);
        //Create walls
        new Wall(A3Q4, 1, 2, Direction.NORTH);
        new Wall(A3Q4, 1, 1, Direction.NORTH);
        new Wall(A3Q4, 1, 1, Direction.WEST);
        new Wall(A3Q4, 2, 1, Direction.WEST);
        new Wall(A3Q4, 2, 2, Direction.EAST);
        new Wall(A3Q4, 1, 2, Direction.EAST);
        new Wall(A3Q4, 2, 1, Direction.SOUTH);
        new Wall(A3Q4, 2, 2, Direction.SOUTH);

        int count = 0;
        //loop 5 times
        while (count < 8) {
            karel.move();
            karel.move();           
            karel.turnLeft();
            karel.move();
            //count 1 step
            count = count + 1;
        }
    }
}
