
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
 * @author lawd8918
 */
public class A3q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City kw = new City();
        //create things
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);

        //create robot
        Robot dave = new Robot(kw, 1, 1, Direction.EAST);

        int count = 0;
        while (count < 10) {
            dave.pickThing();
            dave.move();
            dave.putThing();
            dave.turnLeft();
            dave.turnLeft();
            dave.move();
            dave.turnLeft();
            dave.turnLeft();
            count = count + 1;
            if (count == 10) {
                dave.move();
            }
        }
    }
}
