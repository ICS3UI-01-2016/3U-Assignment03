
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
 * @author gavra1870
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //create city for the robots
        City hj = new City();
        Robot dres = new Robot(hj, 1, 1,Direction.EAST);
        
        

        // Create Walls and Things
        new Wall(hj, 1, 5, Direction.WEST);
        new Thing(hj, 1, 3);
        new Thing(hj, 1, 4);
        new Wall(hj, 1, 11, Direction.WEST);
        new Thing(hj, 1, 9);
        new Thing(hj, 1, 10);

        //when the front is clear the robot will move
        while (dres.frontIsClear()) {
            dres.move();
       // when the front is not clear then the robot will stop moving      
            if (!dres.frontIsClear()) {
                break;
       // or if the robot can pick something up than it will stop moving.
        } else {
            if (dres.canPickThing()){
                break;
                
            }    
                
            }
        }
    }
}
