
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
 * @author shieg0688
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create city
        City bompton = new City();
        new Wall (bompton, 1,4, Direction.EAST);
        new Thing (bompton, 1,4);
        new Thing (bompton, 1,3);
        //Create robot
        Robot ice = new Robot (bompton, 1,1, Direction.EAST);
        //code robot
        while(!ice.canPickThing()){
            ice.move();
        }
        
    }
}
