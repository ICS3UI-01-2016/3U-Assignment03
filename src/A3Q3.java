
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
 * @author ayyaf3300
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // create a city 
        City kw = new City();

        // create a robot
        Robot dino = new Robot(kw, 2, 3, Direction.SOUTH);

        // create walls
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.WEST);
        new Wall(kw, 2, 2, Direction.WEST);
        new Wall(kw, 3, 2, Direction.WEST);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 5, Direction.SOUTH);
        new Wall(kw, 3, 5, Direction.EAST);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 1, 5, Direction.EAST);
        new Wall(kw, 1, 5, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);

        // make algorithem
        while (dino.frontIsClear()) {
            dino.move();
        }
        // make robot check the wall to see if there is an opening
        dino.turnLeft();
        while (dino.frontIsClear()) {
            dino.move();
            dino.turnLeft();
            dino.turnLeft();
            dino.turnLeft();
            // make the robot go through an opening if one
            if (dino.frontIsClear()) {
                dino.move();
                break;
            } else {
                // make robot turn left when in a corner
                dino.turnLeft();
                if (!dino.frontIsClear()) {
                    dino.turnLeft();
                }
            }
        }
        // end program
    }
}
