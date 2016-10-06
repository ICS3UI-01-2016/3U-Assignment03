
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
 * @author messr2578
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //basic startup for a single robot
        City kw = new City();
        Robot karel = new Robot(kw, 1, 0, Direction.EAST);
        //create walls and a thing
        new Wall(kw, 1, 2, Direction.EAST);
        new Thing(kw, 1, 2);
        while(true){
        if(karel.canPickThing() || !karel.frontIsClear()){
            break;
        }
        karel.move();
        }
    }
}
