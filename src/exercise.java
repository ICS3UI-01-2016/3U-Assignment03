
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vandl4973
 */
public class exercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //city
        City kw = new City();
        //the cage to escape from
        new Wall(kw, 0, 0, Direction.NORTH);
        new Wall(kw, 0, 2, Direction.NORTH);
        new Wall(kw, 0, 3, Direction.NORTH);
        new Wall(kw, 0, 0, Direction.WEST);
        new Wall(kw, 1, 0, Direction.WEST);
        new Wall(kw, 2, 0, Direction.WEST);
        new Wall(kw, 3, 0, Direction.WEST);
        new Wall(kw, 3, 0, Direction.SOUTH);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 0, 3, Direction.EAST);
        new Wall(kw, 1, 3, Direction.EAST);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 3, 3, Direction.EAST);
        //escape artist
        Robot bob = new Robot(kw, 2, 1, Direction.SOUTH);
        while (bob.frontIsClear()) {
            bob.move();
        }

        while (!bob.frontIsClear()) {
            bob.turnLeft();
            bob.move();
            if (bob.frontIsClear()) {
              bob.turnLeft();
              bob.turnLeft();
              bob.turnLeft();

            }
        }
        
        bob.move();
    }
}
