
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
 * @author schum0689
 */
public class Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        City q5 = new City();

        // Create robot
        RobotSE rick = new RobotSE(q5, 1, 0, Direction.EAST);

        // Create Things
        new Thing(q5, 1, 1);
        new Thing(q5, 1, 1);
        new Thing(q5, 1, 1);
        new Thing(q5, 1, 1);
        new Thing(q5, 1, 1);
        new Thing(q5, 1, 1);
        new Thing(q5, 1, 1);
        new Thing(q5, 1, 1);
        new Thing(q5, 1, 1);
        new Thing(q5, 1, 1);

        // Move onto pile of Things
        rick.move();

        // MOVE THINGS LOOP:
        // shift = move one Thing one avenue over, 10 times
        for (int shift = 0; shift < 10; shift = shift + 1) {
            // Pick one Thing
            rick.pickThing();
            // Move once
            rick.move();
            // Drop Thing
            rick.putThing();

            // RETURN TO PILE:
            // Turn around
            rick.turnAround();
            // Move once
            rick.move();
            // Turn around
            rick.turnAround();
        }
        // Move onto newly moved pile
        if (!rick.canPickThing()) {
            rick.move();
        }
    }
}
