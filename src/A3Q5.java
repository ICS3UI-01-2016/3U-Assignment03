
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ayyaf3300
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // create city
        City kw = new City();
        // create a robot 
        Robot dino = new Robot(kw, 3, 4, Direction.EAST);
        // create things
        new Thing(kw, 3, 4);
        new Thing(kw, 3, 4);
        new Thing(kw, 3, 4);
        new Thing(kw, 3, 4);
        new Thing(kw, 3, 4);
        new Thing(kw, 3, 4);
        new Thing(kw, 3, 4);
        new Thing(kw, 3, 4);
        new Thing(kw, 3, 4);
        new Thing(kw, 3, 4);
        // create algorithem 
        while (dino.canPickThing()) {
            // make robot transport ten things to next avenue
            dino.pickThing();
            dino.move();
            dino.putThing();
            dino.turnLeft();
            dino.turnLeft();
            dino.move();
            dino.turnLeft();
            dino.turnLeft();
        }
        dino.move();
        // end program
    }
}
