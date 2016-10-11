
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
 * @author slatz8075
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a City for the Robot
        City A3Q1 = new City();
        //Create robot
        Robot karel = new Robot(A3Q1, 1, 3, Direction.EAST);

        //create the randomly placed wall(s) and thing(s)
        new Wall(A3Q1, 1, 7, Direction.WEST);
        new Thing(A3Q1, 1, 6);
        new Thing(A3Q1, 1, 5);

        while (karel.canPickThing() != true && karel.frontIsClear() != false) {
            karel.move();
        }
    }
}