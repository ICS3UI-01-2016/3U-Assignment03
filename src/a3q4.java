
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
 * @author woodc9217
 */
public class a3q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new city
        City mtl = new City();
        //create a robot
        Robot candice = new Robot(mtl, 0, 3, Direction.WEST);
        //create walls
        new Wall(mtl, 1, 1, Direction.WEST);
        new Wall(mtl, 2, 1, Direction.WEST);
        new Wall(mtl, 2, 1, Direction.SOUTH);
        new Wall(mtl, 2, 2, Direction.SOUTH);
        new Wall(mtl, 2, 2, Direction.EAST);
        new Wall(mtl, 1, 2, Direction.EAST);
        new Wall(mtl, 1, 1, Direction.NORTH);
        new Wall(mtl, 1, 2, Direction.NORTH);
        //create a for loop so that the robot repeats the side code 4 times 
        for (int i = 0; i < 8; i++) {
            candice.move();
            candice.move();
            candice.move();
            candice.turnLeft();
        }
    }
}
