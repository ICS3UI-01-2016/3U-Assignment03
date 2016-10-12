
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author schum0689
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city
        City q2 = new City();

        // Create room
        new Wall(q2, 1, 1, Direction.NORTH);
        new Wall(q2, 1, 1, Direction.WEST);
        new Wall(q2, 1, 2, Direction.NORTH);
        new Wall(q2, 1, 3, Direction.NORTH);
        new Wall(q2, 1, 4, Direction.NORTH);
        new Wall(q2, 1, 4, Direction.EAST);
        new Wall(q2, 2, 1, Direction.WEST);
        new Wall(q2, 2, 4, Direction.EAST);
        new Wall(q2, 3, 1, Direction.SOUTH);
        new Wall(q2, 3, 1, Direction.WEST);
        new Wall(q2, 3, 2, Direction.SOUTH);
        new Wall(q2, 3, 3, Direction.SOUTH);
        new Wall(q2, 3, 4, Direction.SOUTH);
        new Wall(q2, 3, 4, Direction.EAST);

        // create robot
        RobotSE rick = new RobotSE(q2, 1, 1, Direction.EAST);

        // create litter
        new Thing(q2, 1, 2);
        new Thing(q2, 2, 2);
        new Thing(q2, 2, 3);
        new Thing(q2, 2, 4);
        new Thing(q2, 3, 1);
        new Thing(q2, 3, 4);

        // Find furthest street
        rick.turnRight();
        do {
            rick.move();
        } while (rick.frontIsClear());
        // Furthest street found, turn to face it
        rick.turnAround();

        // MAIN WHILE LOOP
        while (rick.frontIsClear()) {
            rick.turnRight();
            // Move along street
            while (rick.frontIsClear()) {
                rick.move();
                // Pick up any litter
                if (rick.canPickThing()) {
                    rick.pickThing();
                }
                // At end of street, face other way
                if (!rick.frontIsClear()) {
                    rick.turnAround();
                    // Move to first avenue
                    do {
                        rick.move();
                    } while (rick.getAvenue() != 1);
                    // If litter on street intersects avenue 1, pick it up
                    if (rick.canPickThing()) {
                        rick.pickThing();
                    }
                }
            }
        }
    }
}
