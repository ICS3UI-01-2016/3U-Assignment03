
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
 * @author messr2578
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //basic startup for a single robot
        City kw = new City();
        Robot karel = new Robot(kw, 1, 1, Direction.EAST);
        //create walls and a thing
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.EAST);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 3, 3, Direction.EAST);

        new Thing(kw, 1, 1);
        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 3, 2);

// clean up the box
        while (karel.frontIsClear()) {
            if (karel.canPickThing()) {
                karel.pickThing();
            }
            karel.move();
            while (!karel.frontIsClear() && karel.getDirection() == Direction.EAST) {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                if (karel.frontIsClear()) {
                    karel.move();
                }
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
            }


            if (!karel.frontIsClear() && karel.getDirection() == Direction.SOUTH) {
                karel.turnLeft();
                while (karel.frontIsClear()) {
                    karel.move();
                }
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
            }
            if (karel.getDirection() == Direction.NORTH && karel.getAvenue() == 1) {
                if (karel.frontIsClear()) {
                    karel.move();
                }
            }
            if (karel.getAvenue() == 1 && karel.getStreet() == 1) {
                break;
            }
            if (!karel.frontIsClear() && karel.getDirection() == Direction.WEST) {
                karel.turnLeft();
                if (karel.frontIsClear()) {
                    karel.move();
                }
                karel.turnLeft();
                karel.move();
            }



        }

    }
}
