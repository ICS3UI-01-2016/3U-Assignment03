
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
 * @author manok5757
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City km = new City();
        // randomly generate situations to check if this works(make things and walls)

        new Wall(km, 1, 6, Direction.EAST);
        new Thing(km, 1, 5);



        // create a robot
        Robot cliff = new Robot(km, 1, 1, Direction.EAST);
        // use a while loop




        // dfjh
        while (cliff.frontIsClear()) {
            cliff.move();

            // check if there is thing in way to stop
            if (cliff.canPickThing()) {
                break;
            }
        }







    }
}
