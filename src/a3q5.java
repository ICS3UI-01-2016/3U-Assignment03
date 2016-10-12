
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
 * @author woodc9217
 */
public class a3q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new city
        City mtl = new City();
        //create a robot
        Robot candice = new Robot(mtl, 1, 1, Direction.EAST);
        //create things
        new Thing(mtl,1,1);
        new Thing(mtl,1,1);
        new Thing(mtl,1,1);
        new Thing(mtl,1,1);
        new Thing(mtl,1,1);
        new Thing(mtl,1,1);
        new Thing(mtl,1,1);
        new Thing(mtl,1,1);
        new Thing(mtl,1,1);
        new Thing(mtl,1,1);
        //move thing with condition
        if(candice.canPickThing())
        {
            candice.pickThing();
            candice.move();
        }
    }
}
