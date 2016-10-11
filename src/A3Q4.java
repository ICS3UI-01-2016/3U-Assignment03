
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
 * @author awadb3223
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create city
        City kw = new City();
        
        //create walls
        new Wall(kw,1,1,Direction.NORTH);
        new Wall(kw,1,2,Direction.NORTH);
        new Wall(kw,1,1,Direction.WEST);
        new Wall(kw,2,1,Direction.WEST);
        new Wall(kw,2,1,Direction.SOUTH);
        new Wall(kw,2,2,Direction.SOUTH);
        new Wall(kw,1,2,Direction.EAST);
        new Wall(kw,2,2,Direction.EAST);
        
        //make a robot and call him a generic name (i.e. bob)
        RobotSE bob = new RobotSE (kw,0,2,Direction.WEST);
        
        //loop bob to run around the box 8 times
        
        int loop = 0;
        
        while (loop < 32){
          bob.move();
          bob.move();
          bob.turnLeft();
          bob.move();
          
          loop = loop + 1;
          
        }
    }
}
