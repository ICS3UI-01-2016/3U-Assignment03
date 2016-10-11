
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
 * @author awadb3223
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city
        City kw = new City();

        //new robot
        Robot bob = new Robot(kw, 1, 1, Direction.EAST);

        //make things and walls
        new Thing(kw, 1, 5);
        new Wall(kw, 1, 4, Direction.EAST);

        //make algorithm
        while (bob.frontIsClear()) {
            bob.move();
            if (bob.canPickThing()) {
                break;
            }
        }
    }
}
