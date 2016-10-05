
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
 * @author baayl3669
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a City
        City af = new City();
        // create a Robot
        Robot rem = new Robot(af,1,1,Direction.EAST);
        
        new Thing(af,1,5);
        new Thing(af,1,6);
        new Wall(af,1,6,Direction.EAST);
        
        // make rem move if front is clear
        while(true){
            if(rem.frontIsClear()){
                rem.move();
                
            } 
            // make rem stop on Thing
            if(rem.canPickThing() || !rem.frontIsClear()){
                break;
            }
        }
        
    }
}
