
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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // make a city
        City kw = new City();
        // make a robot
        Robot dino = new Robot(kw, 0, 0, Direction.SOUTH);
        // make walls
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.EAST);

        // make algorithem
        int moves = 0;
        // make for loop for a specific number of times that the program will run
        while (moves < 8) {
            dino.move();
            dino.move();
            dino.move();
            dino.turnLeft();
            moves = moves + 1;
        }
        // end program
    }
}
