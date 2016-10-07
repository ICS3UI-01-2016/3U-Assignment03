
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
 * @author lawd8918
 */
public class A3q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        City kw = new City();
        Robot dave = new Robot(kw, 0, 0, Direction.EAST);
        new Wall(kw, 0, 5, Direction.WEST);
        new Thing(kw, 0, 6);

        while (dave.frontIsClear()) {
            dave.move();
            if (dave.canPickThing()) {
                dave.pickThing();
                break;
            }
        }
    }
}
