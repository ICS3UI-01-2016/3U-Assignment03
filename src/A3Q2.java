
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author petet9087
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
        RobotSE lang = new RobotSE(kw, 1, 1, Direction.EAST);
        // create box to trap in lang
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.EAST);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 3, 5, Direction.EAST);
        new Wall(kw, 3, 5, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        // create things for lang to pick up
        new Thing(kw, 2, 4);
        new Thing(kw, 1, 2);
        new Thing(kw, 3, 5);
        new Thing(kw, 3, 2);
        new Thing(kw, 2, 3);
        // get lang to move
        while (lang.frontIsClear()) {
            while (lang.frontIsClear()) {
                lang.move();
                // if lang can pick up thing
                if (lang.canPickThing()) {
                    lang.pickAllThings();
                }
            }
            // if wall is infront of lang
            if (!lang.frontIsClear()) {
                lang.turnAround();
            }
            // if trash is cleared
            while (lang.frontIsClear()) {
                lang.move();
            }
            lang.turnLeft();
            // if lang is faced into a wall at the end
            if (!lang.frontIsClear()) {
                lang.turnAround();
                lang.move();
            }
            // lang move to start next driveway
            lang.move();
            lang.turnLeft();

        }
        // once lang is at the end of his duty
        lang.turnAround();
    }
}
