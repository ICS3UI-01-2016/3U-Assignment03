
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
 * @author katop7929
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city 
        City kpl = new City();
        
        //create a robot 
        RobotSE obama = new RobotSE(kpl,1,1,Direction.SOUTH); 
        
        //create walls 
        new Wall(kpl,1,1,Direction.WEST);
        new Wall(kpl,2,1,Direction.WEST);
        new Wall(kpl,3,1,Direction.WEST);
        
        new Wall(kpl,3,1,Direction.SOUTH);
        new Wall(kpl,3,2,Direction.SOUTH);
        new Wall(kpl,3,3,Direction.SOUTH);
        new Wall(kpl,3,4,Direction.SOUTH);
        
        
        new Wall(kpl,3,4,Direction.EAST);
        new Wall(kpl,2,4,Direction.EAST);
        new Wall(kpl,1,4,Direction.EAST);
        
        new Wall(kpl,1,4,Direction.NORTH);
        new Wall(kpl,1,3,Direction.NORTH);
        new Wall(kpl,1,1,Direction.NORTH); 
        
        
        
        
        
        
        
    }
}
