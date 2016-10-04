
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
 * @author manok5757
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City km = new City();
        // create a robot
        Robot karel = new Robot (km,1,1,Direction.EAST);
        // create walls for the rectangular room
        new Wall (km,1,1,Direction.NORTH);
        new Wall (km,1,2,Direction.NORTH);
        new Wall (km,1,3,Direction.NORTH);
        new Wall (km,1,4,Direction.NORTH);
        new Wall (km,1,4,Direction.EAST);
        new Wall (km,2,4,Direction.EAST);
        new Wall (km,3,4,Direction.EAST);
        new Wall (km,3,4,Direction.SOUTH);
        new Wall (km,3,3,Direction.SOUTH);
        new Wall (km,3,2,Direction.SOUTH);
        new Wall (km,3,1,Direction.SOUTH);
        new Wall (km,3,1,Direction.WEST);
        new Wall (km,2,1,Direction.WEST);
        new Wall (km,1,1,Direction.WEST);
        
        // place litter in room
        new Thing (km,1,2);
        new Thing (km,2,2);
        new Thing (km,2,3);
        new Thing (km,2,4);
        new Thing (km,3,4);
        new Thing (km,3,1);
        
        // make while loop to solve problem
        while(karel.frontIsClear()){
            karel.move();
        if(karel.canPickThing())
            karel.pickThing();}
        if(!karel.frontIsClear()){
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            
            karel.move();
            karel.turnLeft();
            if(karel.canPickThing()){
                karel.pickThing();
                
            }
        
        }
        
    }
}
