
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macdt8987
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create A city
        City kw = new City();
       //Make a robot
        RobotSE karl = new RobotSE(kw,1,1,Direction.WEST);
        // Make the things
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        // Move the things
        while(karl.canPickThing()){
            karl.turnLeft();
            karl.turnLeft();
            karl.pickThing();
            karl.move();
            karl.putThing();
            karl.turnLeft();
            karl.turnLeft();
            karl.move();
        }
                
    }
}
