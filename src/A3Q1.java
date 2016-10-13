
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
 * @author macdt8987
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make a city
        City kw = new City();
        // Make robot
        RobotSE karl = new RobotSE(kw,1,1,Direction.EAST);
        // Make wall
        new Wall(kw,1,5,Direction.WEST);
        // Make thing
        new Thing(kw,1,3);
        new Thing(kw,1,4);
        //Make Loop
        while(karl.frontIsClear()){
            karl.move();
            if(karl.canPickThing()){
                break;
            }
        }
    }
}
