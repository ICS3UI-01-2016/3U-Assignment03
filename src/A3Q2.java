
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
 * @author ayyaf3300
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // create a city
        City kw = new City();

        // create a robot
        Robot dino = new Robot(kw, 1, 1, Direction.EAST);

        // create walls
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);

        // create things
        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 3, 1);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 4);
        new Thing(kw, 3, 4);

        // create loop to tell the robot to pick things
        while (dino.frontIsClear()) {
            dino.move();

            if (dino.canPickThing()) {
                dino.pickThing();
            }

            // make robot go back to start after it has checked each row
            if (dino.getDirection() == Direction.WEST && dino.getAvenue() == 1 && dino.getStreet() == 3) {
                dino.turnLeft();
                dino.turnLeft();
                dino.turnLeft();
            }

            // make robot to check each row for things
            if (!dino.frontIsClear() && dino.getDirection() == Direction.EAST) {
                dino.turnLeft();
                dino.turnLeft();

            } else {
                if (dino.getDirection() == Direction.WEST && dino.getAvenue() == 1) {
                    dino.turnLeft();
                    dino.move();
                    dino.turnLeft();
                }
            }
        }
        // end loop
    }
// end program

    {
    }
}
