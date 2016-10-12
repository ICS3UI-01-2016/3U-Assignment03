
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author manok5757
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City km = new City();

        // create a robot to perform the required task
        RobotSE cliff = new RobotSE(km, 1, 2, Direction.EAST);

        // create a pile of 10 things
        new Thing(km, 1, 2);
        new Thing(km, 1, 2);
        new Thing(km, 1, 2);
        new Thing(km, 1, 2);
        new Thing(km, 1, 2);
        new Thing(km, 1, 2);
        new Thing(km, 1, 2);
        new Thing(km, 1, 2);
        new Thing(km, 1, 2);
        new Thing(km, 1, 2);

        // create a for loop to make cliff pick the things one at a time and place it one avenue to the right
        int moves = 0;


        while (moves < 10) {
            moves = moves + 1;
            cliff.pickThing();
            cliff.move();
            cliff.putThing();
            cliff.turnAround();
            cliff.move();
            cliff.turnAround();
        }
        // make cliff get back in the staring position
        cliff.move();


    }
}
