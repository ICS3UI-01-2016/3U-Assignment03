
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
 * @author vandl4973
 */
public class exescise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //city
        City kw = new City();
        //robot to enhabit the city
        Robot bob = new Robot(kw, 1, 1, Direction.EAST);
        Robot shelly = new Robot(kw, 3, 1, Direction.EAST);
        //objetd in there way
        new Wall(kw, 1, 5, Direction.EAST);
        new Thing(kw, 1, 6);
        new Thing(kw, 3, 5);
        new Thing(kw, 3, 6);
        new Wall(kw, 3, 7, Direction.WEST);
        //what the robot needs to do
        while (bob.frontIsClear()) {
            bob.move();
            if (!bob.frontIsClear()) {
                break;
            }
        }
        while (!shelly.canPickThing()) {
            shelly.move();
        }
    }
}