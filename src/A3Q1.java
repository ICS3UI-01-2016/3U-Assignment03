
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khans4349
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kw = new City();

        // create a robot
        Robot karel = new Robot(kw, 1, 1, Direction.EAST);

        // create walls
        new Wall(kw, 1, 6, Direction.EAST);

        // create a thing
        new Thing(kw, 1, 5);


        // get robot to stop when there is a wall
        while (karel.frontIsClear()) {
            karel.move();
            // get robot to stop if it can pick thing
            if (karel.canPickThing()) {
                break;
            }
        }
    }
}
