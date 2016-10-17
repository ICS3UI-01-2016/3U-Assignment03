
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city and a robot
        City ok = new City ();
        Robot ben = new Robot (ok, 0,2, Direction. WEST);
        
        //create walls
        new Wall (ok, 1,1, Direction. NORTH);
        new Wall (ok, 1,2, Direction. NORTH);
        new Wall (ok, 1,1, Direction. WEST);
        new Wall (ok, 2,1, Direction. WEST);
        new Wall (ok, 2,1, Direction. SOUTH );
        new Wall (ok, 2,2, Direction. SOUTH);
        new Wall (ok, 1,2, Direction. EAST);
        new Wall (ok, 2,2, Direction. EAST);
        
        // get the robot to to go around the square two times
        for (int i = 0; i < 8; i = i + 1 ){
            ben.move ();
            ben.move();
            ben.turnLeft();
            ben.move();
            
            

        
        
        
        
        
        
        
        
        
        
        
        
    }
}
}

