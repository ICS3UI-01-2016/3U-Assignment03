
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
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a City for the Robot
        City A3Q3 = new City();
        //Create robot
        Robot karel = new Robot(A3Q3, 3, 2, Direction.EAST);

        //create the room
        new Wall(A3Q3, 1, 1, Direction.WEST);
        new Wall(A3Q3, 2, 1, Direction.WEST);
        new Wall(A3Q3, 3, 1, Direction.WEST);
        new Wall(A3Q3, 4, 1, Direction.WEST);
        new Wall(A3Q3, 5, 1, Direction.WEST);
        new Wall(A3Q3, 1, 1, Direction.NORTH);
        new Wall(A3Q3, 1, 2, Direction.NORTH);
        new Wall(A3Q3, 1, 3, Direction.NORTH);
        new Wall(A3Q3, 1, 4, Direction.NORTH);
        new Wall(A3Q3, 1, 5, Direction.NORTH);
        new Wall(A3Q3, 1, 5, Direction.EAST);
        new Wall(A3Q3, 2, 5, Direction.EAST);
        new Wall(A3Q3, 3, 5, Direction.EAST);
        //this is the missing wall
        new Wall(A3Q3, 5, 5, Direction.EAST);
        new Wall(A3Q3, 5, 5, Direction.SOUTH);
        new Wall(A3Q3, 5, 4, Direction.SOUTH);
        new Wall(A3Q3, 5, 3, Direction.SOUTH);
        new Wall(A3Q3, 5, 2, Direction.SOUTH);
        new Wall(A3Q3, 5, 1, Direction.SOUTH);

        while (karel.frontIsClear()) {
            karel.move();
        }
        //found wall
        while (karel.frontIsClear() != true) {
            karel.turnLeft();
            if (karel.frontIsClear() != true) {
                karel.turnLeft();
            }
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
        }
        //found exit
        karel.move();
    }
}
