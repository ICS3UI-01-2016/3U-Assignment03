
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author awadb3223
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create city
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

        //create a robot... not bob this time... SIKE!!!
        RobotSE bob = new RobotSE(kw, 1, 1, Direction.EAST);

        //make bob pick up and drop things from here to there
        int count = 0;

        while (count < 10) {
            bob.pickThing();
            bob.move();
            bob.putThing();
            bob.turnAround();
            bob.move();
            bob.turnAround();
            count = count + 1;
        }
        bob.move();
    }
}