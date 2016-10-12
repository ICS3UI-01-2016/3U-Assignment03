
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomlj9878
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city & robot
        City JT = new City();
        Robot stop = new Robot(JT,1,1,Direction.EAST);
        //create wall/things
        new Thing(JT,1,6,Direction.EAST);
        //move robot
        while(stop.frontIsClear()){
            stop.move();
            if(stop.canPickThing()){
                break;
            }

       }
                
   }
} 
   
