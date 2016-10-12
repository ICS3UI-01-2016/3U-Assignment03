
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
 * @author ANNT0773
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City kw = new City();
        //create a robot
        Robot taylor = new Robot(kw, 1, 1, Direction.EAST);

        //create walls
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.EAST);

        //put things
        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 4);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 4);

        //move taylor to pick things up
        int count = 0;
        while (taylor.frontIsClear()) {
            taylor.move();
            if (taylor.canPickThing()) {
                taylor.pickThing();
            }
            if (!taylor.frontIsClear() && taylor.getDirection() == Direction.EAST) {
                taylor.turnLeft();
                taylor.turnLeft();
                taylor.move();
            }
            if (!taylor.frontIsClear() && taylor.getDirection() == Direction.WEST) {
                taylor.turnLeft();
                if (taylor.frontIsClear()) {
                    taylor.move();
                    taylor.turnLeft();
                } else {
                    taylor.turnLeft();
                    taylor.turnLeft();
                    while (taylor.frontIsClear()) {
                        taylor.move();
                        if (!taylor.frontIsClear()) {
                            taylor.turnLeft();
                            taylor.turnLeft();
                            taylor.turnLeft();
                            break;
                        }
                    }
                    break;
                }
            }
            count = count + 1;

        }

        // TODO code application logic here
    }
}
