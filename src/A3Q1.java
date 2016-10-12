
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ANNT0773
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new city
        City kw = new City();
        //create a new robot
        Robot taylor = new Robot(kw, 0, 0, Direction.EAST);

        //create new wall
        new Wall(kw, 0, 4, Direction.WEST);

        //create new things
        new Thing(kw, 0, 2);
        new Thing(kw, 0, 3);

        //move the robot
        int count = 0;
        while (taylor.frontIsClear()) {
            taylor.move();

            if (taylor.canPickThing()) {
                break;
            }
        }
    }
    // TODO code application logic here
}
