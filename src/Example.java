
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manok5757
 */
public class Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kw = new City();
        // create a robot
        Robot karel = new Robot (kw,1,1,Direction.EAST);
        
       
        
        // counting using a while loop
        // create a counter variable
        int count = 0;
        // loop 5 times
        while(count<5){
            // move the robot
            karel.move();
            // count 1 step
            count = count + 1;
        }
       
        karel.turnLeft();
        karel.turnLeft();
        
        
        // counting using a for loop
        for(int i = 0; i < 5; i = i + 1){
            // move the robot
            karel.move();
        }
        }
    }

