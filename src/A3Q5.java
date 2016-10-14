
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gavra1870
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Vreate a city for robot
        City jk = new City();
        jk.showThingCounts(true);
        Robot zach = new Robot(jk, 1, 2, Direction.WEST);
        new Thing(jk, 1, 2);
        new Thing(jk, 1, 2);
        new Thing(jk, 1, 2);
        new Thing(jk, 1, 2);
        new Thing(jk, 1, 2);
        new Thing(jk, 1, 2);
        new Thing(jk, 1, 2);
        new Thing(jk, 1, 2);
        new Thing(jk, 1, 2);
        new Thing(jk, 1, 2);
        //Get zach to pick things
        while (zach.canPickThing()) {
            zach.pickThing();
            zach.move();
            zach.putThing();
            zach.turnLeft();
            zach.turnLeft();
            zach.move();
            zach.turnLeft();
            zach.turnLeft();

            if (!zach.canPickThing()) {
                break;

            }

        }


    }
}
