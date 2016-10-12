
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
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city and a robot
        City ok = new City ();
        Robot ben = new Robot (ok, 3,4, Direction.SOUTH);
        
        //create walls
        new Wall (ok, 3,3, Direction.WEST);
        new Wall (ok, 2,3, Direction. WEST);
        new Wall (ok, 4,3, Direction. WEST);
        new Wall (ok, 2,3, Direction. NORTH);
        new Wall (ok, 2,5, Direction. NORTH);
        new Wall (ok, 2,6, Direction. NORTH);
        new Wall (ok, 4,3, Direction. SOUTH);
        new Wall (ok, 4,4, Direction. SOUTH);
        new Wall (ok, 4,5, Direction. SOUTH);
        new Wall (ok, 4,6, Direction. SOUTH);
        new Wall (ok, 2,6, Direction. EAST);
        new Wall (ok, 3,6, Direction. EAST);
        new Wall (ok, 4,6, Direction. EAST);
        
        //get the robot out of the rectangular room
        while (ben.frontIsClear()){
            ben.move();
        }
        while (!ben.frontIsClear()){
            ben.turnLeft();
            ben.move();
            if (ben.frontIsClear()){
                ben.move();
            }
            if (ben.frontIsClear()){
                ben.turnLeft();
                ben.turnLeft();
                ben.turnLeft();
                ben.move();
            }
  

                

            }
           


                
            }
        }
        
        
        
        
        
        
    

