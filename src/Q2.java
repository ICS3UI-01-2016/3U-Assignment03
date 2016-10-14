
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

        // START AT BOTTOM OF ROOM:
        // Find furthest steet
        rick.turnRight();
        do {
            rick.move();
        } while (rick.frontIsClear());
        // Furthest street found, face north
        rick.turnAround();

        // MAIN LOOP:
        // If there is no wall in front of him on the avenue
        while (rick.frontIsClear()) {
            // Turn to face street
            rick.turnRight();
            // CLEANING ROOM LOOP
            // Move along street
            while (rick.frontIsClear()) {
                rick.move();
                // Pick any litter
                if (rick.canPickThing()) {
                    rick.pickThing();
                }
                // End of street; turn around
                if (!rick.frontIsClear()) {
                    rick.turnAround();
                    // Return to Avenue 1
                    do {
                        rick.move();
                    } while (rick.getAvenue() != 1);
                    // Pick any litter on avenue
                    if (rick.canPickThing()) {
                        rick.pickThing();
                    }
                    // Face north
                    rick.turnRight();
                    // Move up for new street
                    rick.move();
                }
                // Break cleaning room loop, move back to top of main loop
                if (rick.getAvenue() == 1) {
                    break;
                }
            }
        }

        // CLEANING STREET 1 LOOP
        for (int cleanStreet = 0; cleanStreet < 1; cleanStreet = cleanStreet + 1) {
            // Face street
            rick.turnRight();
            // Move along street
            while (rick.frontIsClear()) {
                rick.move();
                // Pick any litter
                if (rick.canPickThing()) {
                    rick.pickThing();
                }
                // End of street; turn around
                if (!rick.frontIsClear()) {
                    rick.turnAround();
                    // Return to Avenue 1
                    do {
                        rick.move();
                    } while (rick.getAvenue() != 1);
                }
            }
            rick.turnAround();
        }

    }
}
