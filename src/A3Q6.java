
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
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // create city
        City kw = new City();
        // create a robot
        Robot dino = new Robot(kw, 3, 3, Direction.SOUTH);
        // create walls
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.EAST);

        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.WEST);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 2, 4, Direction.SOUTH);
        new Wall(kw, 1, 5, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.EAST);
        new Wall(kw, 2, 5, Direction.SOUTH);
        new Wall(kw, 2, 5, Direction.EAST);

        new Wall(kw, 4, 1, Direction.NORTH);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 5, 1, Direction.WEST);
        new Wall(kw, 5, 1, Direction.SOUTH);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 4, 2, Direction.EAST);
        new Wall(kw, 5, 2, Direction.SOUTH);
        new Wall(kw, 5, 2, Direction.EAST);

        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.WEST);
        new Wall(kw, 5, 4, Direction.WEST);
        new Wall(kw, 5, 4, Direction.SOUTH);
        new Wall(kw, 4, 5, Direction.NORTH);
        new Wall(kw, 4, 5, Direction.EAST);
        new Wall(kw, 5, 5, Direction.SOUTH);
        new Wall(kw, 5, 5, Direction.EAST);
        // create algorithem which will allow it go around the walls placed
        int outside = 0;
        // make robot repeat loop 4 times bc that the number of walls on each side 
        while (outside < 4) {
            int count = 0;
            while (count < 4) {
                dino.move();
                dino.move();
                dino.move();
                // make robot do actions if there are less than 3 walls
                if (count < 3) {
                    dino.turnLeft();
                }
                count = count + 1;
            }
            outside = outside + 1;
        }
// end program
    }
}
