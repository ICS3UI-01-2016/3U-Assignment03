
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author slatz8075
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a City for the Robot
        City A3Q5 = new City();
        //Create robot
        Robot karel = new Robot(A3Q5, 1, 1, Direction.EAST);
        //create the 10 things
        new Thing(A3Q5, 1, 1);
        new Thing(A3Q5, 1, 1);
        new Thing(A3Q5, 1, 1);
        new Thing(A3Q5, 1, 1);
        new Thing(A3Q5, 1, 1);
        new Thing(A3Q5, 1, 1);
        new Thing(A3Q5, 1, 1);
        new Thing(A3Q5, 1, 1);
        new Thing(A3Q5, 1, 1);
        new Thing(A3Q5, 1, 1);

        while (karel.canPickThing()) {
            karel.pickThing();
            karel.move();
            karel.putThing();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
        }
        //all things have been moved
        karel.move();        
    }
}
