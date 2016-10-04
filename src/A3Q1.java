
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
        
        City af = new City();
        Robot rem = new Robot(af,1,1,Direction.EAST);
        
        new Thing(af,1,5);
        new Thing(af,1,6);
        new Wall(af,1,6,Direction.EAST);
        
        while(true){
            if(rem.frontIsClear()){
                rem.move();
                
            } 
            // || means or/and
            if(rem.canPickThing() || !rem.frontIsClear()){
                break;
            }
        }
        
    }
}
