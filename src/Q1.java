
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
 * @author schum0689
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create city
        City q1 = new City();

        // create robots
        Robot rick = new Robot(q1, 2, 1, Direction.EAST);
        Robot carl = new Robot(q1, 4, 1, Direction.EAST);

        // create obstacles
        new Wall(q1, 2, 5, Direction.WEST);
        new Wall(q1, 4, 5, Direction.EAST);
        new Thing(q1, 2, 3);
        new Thing(q1, 2, 4);
        new Thing(q1, 4, 6);

        // program rick (stopping at Thing)
        do {
            rick.move();
        } while (rick.frontIsClear() && !rick.canPickThing());

        // program carl (exact same loop, different robot for stopping at Wall)
        do {
            carl.move();
        } while (carl.frontIsClear() && !carl.canPickThing());
    }
}
