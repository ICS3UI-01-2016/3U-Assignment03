
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
 * @author wangk9757
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a city
        City kw= new City();
        //create a robot
                   Robot karel = new Robot(kw,1,1,Direction.EAST);
                   //create some walls and things
                   new Wall(kw,1,4,Direction.EAST);
        new Thing (kw,1,6);
        
        // get robot to move
        while(karel.frontIsClear()){
            karel.move();
            if(karel.canPickThing()){
                break;
            }
        }
        
        
        }
}
                   
    

