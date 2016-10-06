
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
 * @author woodc9217
 */
public class a3q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new city
        City mtl = new City();
        //create a robot
        Robot candice = new Robot(mtl, 1, 1, Direction.EAST);
        //create walls
        new Wall(mtl,1,5,Direction.WEST);
        //create new things
        new Thing(mtl,1,3);
        new Thing(mtl,1,4);
        //get robot to move and stop when it lands on a thing
        while(candice.frontIsClear())
        {
            candice.move();
        
        while(!candice.frontIsClear())
        {
            break;
        }
        while(candice.canPickThing())
        {
            break;
        }
        }
                
    }
}//FIX
