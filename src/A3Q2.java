
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author manok5757
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City km = new City();

        // create a robot
        RobotSE cliff = new RobotSE(km, 1, 1, Direction.EAST);

        // create the rectangular room 

        new Wall(km, 1, 1, Direction.NORTH);
        new Wall(km, 1, 2, Direction.NORTH);
        new Wall(km, 1, 3, Direction.NORTH);
        new Wall(km, 1, 4, Direction.NORTH);
        new Wall(km, 1, 4, Direction.EAST);
        new Wall(km, 2, 4, Direction.EAST);
        new Wall(km, 3, 4, Direction.EAST);
        new Wall(km, 3, 4, Direction.SOUTH);
        new Wall(km, 3, 3, Direction.SOUTH);
        new Wall(km, 3, 2, Direction.SOUTH);
        new Wall(km, 3, 1, Direction.SOUTH);
        new Wall(km, 3, 1, Direction.WEST);
        new Wall(km, 2, 1, Direction.WEST);
        new Wall(km, 1, 1, Direction.WEST);

        // place litter on ground for cliff to pick up\
        new Thing(km, 1, 2);
        new Thing(km, 2, 2);
        new Thing(km, 2, 3);
        new Thing(km, 2, 4);
        new Thing(km, 3, 1);
        new Thing(km, 3, 4);

        // use while loop to allo cliff to pick up all litter and return to starting position
        while (cliff.frontIsClear()) {
            cliff.move();

            if (cliff.canPickThing()) {
                cliff.pickThing();
            }
            // if robot hits wall then turn around
            if (!cliff.frontIsClear()) {
                cliff.turnAround();
            }
            // when he gets to avenue 1 make him go down 1 street and begin to clear that street
            if (cliff.getAvenue() == 1) {
                cliff.turnRight();
                if (!cliff.frontIsClear()) {
                    cliff.turnLeft();
                    cliff.turnLeft();
                }
                cliff.move();
                cliff.turnLeft();
                //When he stops at avenue 1 and street 2 facing west, make him go back to original position
                if (cliff.getDirection() == Direction.WEST) {
                    cliff.turnRight();
                    cliff.move();
                }
                if (!cliff.frontIsClear()) {
                    cliff.turnRight();
                    break;
                }
            }

        }

    }
}
