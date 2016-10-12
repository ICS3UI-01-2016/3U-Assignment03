
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
 * @author khans4349
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kw = new City();
        
        // create a robot
        RobotSE karel = new RobotSE(kw,0,0,Direction.WEST);
        
        // make walls
        new Wall(kw,1,1,Direction.NORTH);
        new Wall(kw,1,2,Direction.NORTH);
        
        new Wall(kw,2,1,Direction.SOUTH);
        new Wall(kw,2,2,Direction.SOUTH);
        
        new Wall(kw,1,1,Direction.WEST);
        new Wall(kw,2,1,Direction.WEST);
        
        new Wall(kw,1,2,Direction.EAST);
        new Wall(kw,2,2,Direction.EAST);
        
        
        // set counter
        int moves = 0;
        
        // get robot to move
        while(moves < 8){
            karel.turnLeft();
            karel.move();
            karel.move();
            karel.move();
            
            
            // set int count
            moves = moves +1;
        }
        
        
        
        
    }
}
