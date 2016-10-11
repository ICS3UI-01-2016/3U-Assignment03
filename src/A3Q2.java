
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
 * @author awadb3223
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City kw = new City();

        //create Robot
        RobotSE bob = new RobotSE(kw, 1, 1, Direction.EAST);

        //make the room
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);

        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);

        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);

        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);

        //make things
        new Thing(kw, 1, 4);
        new Thing(kw, 2, 3);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 4);
        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);

        //make algorithm

        //If the front is clear, move
        while (bob.frontIsClear()) {
            bob.move();

            //if theres a thing, pick it up
            if (bob.canPickThing()) {
                bob.pickThing();
            }
            //if the front is not clear, turn around
            if (!bob.frontIsClear()) {
                bob.turnAround();
            }
            //if bob is on avenue 1, turn right
            if (bob.getAvenue() == 1) {
                bob.turnRight();
                //if the front is not clear then, turn turn around
                if (!bob.frontIsClear()) {
                    bob.turnLeft();
                    bob.turnLeft();
                }
                //move and turn left
                bob.move();
                bob.turnLeft();

                //if bob is facing West, turn right and move
                if (bob.getDirection() == Direction.WEST) {
                    bob.turnRight();
                    bob.move();
                }
                //if the front is not clear again, turn right. End loop
                if (!bob.frontIsClear()) {
                    bob.turnRight();
                    break;
                }
            }
        }
    }
}
