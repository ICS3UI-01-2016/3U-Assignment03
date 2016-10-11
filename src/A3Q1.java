
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
 * @author petet9087
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    // create a city
        City kw = new City();
        // create a new robot
        RobotSE lang = new RobotSE (kw,3,1,Direction.EAST);
        // create a wall
        new Wall (kw,3,4,Direction.EAST);
    // create a new thing
        new Thing (kw,5,4);
        new Thing (kw,5,5);
        new Wall (kw,5,7,Direction.WEST);
    // get lang to move
        while(lang.frontIsClear()){
    lang.move();
    if(lang.canPickThing()){
        break;
    }
    }
}
}
