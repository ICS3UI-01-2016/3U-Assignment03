
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
 * @author ayyaf3300
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // create a city
        City kw = new City();

        // create a robot
        Robot dino = new Robot(kw, 2, 2, Direction.EAST);
        // create walls 
        new Wall(kw, 2, 6, Direction.WEST);
        // creat thing
        new Thing(kw, 2, 4);
        new Thing(kw, 2, 5);

        // use a while loop
        while (dino.frontIsClear()) {
            dino.move();
            if (dino.canPickThing()) {
                break;
            }
        }
    }
    // end program
    {
    }
}
