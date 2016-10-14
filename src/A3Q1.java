
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
        // Create City hj
        City hj = new City();
        Robot dres = new Robot(hj, 1, 1, Direction.EAST);

        // Create Walls and Things
        new Wall(hj, 1, 5, Direction.WEST);
        new Thing(hj, 1, 3);
        new Thing(hj, 1, 4);
        new Wall(hj, 1, 11, Direction.WEST);
        new Thing(hj, 1, 9);
        new Thing(hj, 1, 10);

        while (dres.frontIsClear()) {
            dres.move();
            if (!dres.frontIsClear()) {
                break;

        } else {
            if (dres.canPickThing()){
                break;
                
            }    
                
            }
        }
    }
}
