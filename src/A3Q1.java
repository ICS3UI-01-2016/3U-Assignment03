
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
 * @author katop7929
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city 
        City kpl = new City(); 
        
        //create a robot 
        Robot obama = new Robot(kpl,1,1,Direction.EAST); 
        
        //create a wall 
        new Wall(kpl,1,5,Direction.EAST);
        
         //place a thing
        new Thing(kpl,1,6); 
        
        while(obama.frontIsClear()){ 
            obama.move();
            if(obama.canPickThing()){
                break;
            }
            }    
    }
}
