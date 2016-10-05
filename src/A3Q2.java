
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
 * @author smith3577
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot karel = new Robot(kw, 1, 1, Direction.EAST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
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
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 2, 3);
        new Thing(kw, 3, 2);
        new Thing(kw, 3, 1);
        //get karel to move
        while (karel.frontIsClear()) {
            if (karel.canPickThing()) {
                karel.pickThing();
            } else {
                karel.move();
            }
        }
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();

        while (karel.frontIsClear()) {
            if (karel.canPickThing()) {
                karel.pickThing();
            } else {
                karel.move();
            }
        }
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        while (karel.frontIsClear()) {
            if (karel.canPickThing()) {
                karel.pickThing();
            } else {
                karel.move();
            }
        }
    }
}
