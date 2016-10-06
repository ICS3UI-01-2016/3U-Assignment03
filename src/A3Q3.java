
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manok5757
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City km = new City();
        
        // create Houdini, which is a new robot
        RobotSE cliff = new RobotSE (km,3,2,Direction.EAST);
        
        // create a rectangular room for Houdini to escape
         new Wall(km, 1, 1, Direction.NORTH);
        //left an opening
        new Wall(km, 1, 3, Direction.NORTH);
        new Wall(km, 1, 4, Direction.NORTH);
        new Wall(km, 1, 4, Direction.EAST);
        new Wall(km, 2, 4, Direction.EAST);
        new Wall(km, 3, 4, Direction.EAST);
        new Wall(km, 3, 4, Direction.SOUTH);
        new Wall(km, 3, 3, Direction.SOUTH);
        new Wall(km, 3, 2, Direction.SOUTH);
        new Wall(km, 3, 1, Direction.SOUTH);
        new Wall(km, 3, 1, Direction.WEST);
        new Wall(km, 2, 1, Direction.WEST);
        new Wall(km, 1, 1, Direction.WEST);
                
                 
    }
}
