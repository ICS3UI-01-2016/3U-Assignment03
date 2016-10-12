
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author petet9087
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    // create a city
        City kw = new City ();
        // create a robot
        RobotSE lang = new RobotSE (kw,1,2,Direction.EAST);
        // make things for lang to pick up
        new Thing (kw,1,2);
        new Thing (kw,1,2);
        new Thing (kw,1,2);
        new Thing (kw,1,2);
        new Thing (kw,1,2);
        new Thing (kw,1,2);
        new Thing (kw,1,2);
        new Thing (kw,1,2);
        new Thing (kw,1,2);
        new Thing (kw,1,2);
        // get lang to pick up things
        
        for(int i = 0; i < 10; i = i + 1){
        lang.pickThing();
        lang.move();
        lang.putThing();
        lang.turnAround();
        lang.move();
        lang.turnAround();
        }
        lang.move();
        
    
    }
}
