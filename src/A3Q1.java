
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
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create city
        City kw = new City();
        //Create robot
        Robot karel = new Robot(kw, 1, 1, Direction.EAST);
        new Wall(kw, 1, 5, Direction.WEST);
        new Thing(kw, 1, 6);
        //start loop
        while (karel.frontIsClear() && !karel.canPickThing()) {
            karel.move();
        }
    }
}
