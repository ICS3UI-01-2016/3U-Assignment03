
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
 * @author khans4349
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kw = new City();

        // new robot
        RobotSE karel = new RobotSE(kw, 2, 2, Direction.EAST);

        // create things
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 2);

        // get robot to move

        int moves = 0;

        while (moves < 3) {
            karel.pickThing();
            karel.move();
            karel.putThing();
            karel.turnAround();
            karel.move();
            karel.turnAround();

            moves = moves + 1;
        }
        karel.move();

    }
}
