
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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //new city
        City kw = new City();
        // robot
        Robot bob = new Robot(kw, 0, 2, Direction.WEST);
        //box robot circles
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);
        int count = 0;
        while (count < 8) {
            bob.turnLeft();
            if (bob.frontIsClear()) {
                bob.move();
                count++;
            } else {
                bob.turnLeft();
                bob.turnLeft();
                bob.turnLeft();
                bob.move();
            }

        }
    }
}
