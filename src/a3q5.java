
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
        new Thing(mtl, 1, 1);
        new Thing(mtl, 1, 1);
        new Thing(mtl, 1, 1);
        new Thing(mtl, 1, 1);
        new Thing(mtl, 1, 1);
        new Thing(mtl, 1, 1);
        new Thing(mtl, 1, 1);
        new Thing(mtl, 1, 1);
        new Thing(mtl, 1, 1);
        new Thing(mtl, 1, 1);
        //create a for loop so that the robot picks thing and restores position 10 times
        for (int i = 0; i < 10; i++) {
            if (candice.canPickThing()) {
                candice.pickThing();
                candice.move();
                candice.putThing();
                candice.turnLeft();
                candice.turnLeft();
                candice.move();
                //restore position
                candice.turnLeft();
                candice.turnLeft();
            }
        }
        //final position
        candice.move();
    }
}
