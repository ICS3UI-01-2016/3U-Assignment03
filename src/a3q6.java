
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
public class a3q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new city
        City mtl = new City();
        //create a robot
        Robot candice = new Robot(mtl, 3, 3, Direction.SOUTH);
        //create walls
        new Wall(mtl, 1, 1, Direction.WEST);
        new Wall(mtl, 2, 1, Direction.WEST);
        new Wall(mtl, 2, 1, Direction.SOUTH);
        new Wall(mtl, 2, 2, Direction.SOUTH);
        new Wall(mtl, 2, 2, Direction.EAST);
        new Wall(mtl, 1, 2, Direction.EAST);
        new Wall(mtl, 1, 1, Direction.NORTH);
        new Wall(mtl, 1, 2, Direction.NORTH);
        //
        new Wall(mtl, 1, 4, Direction.NORTH);
        new Wall(mtl, 1, 5, Direction.NORTH);
        new Wall(mtl, 2, 4, Direction.SOUTH);
        new Wall(mtl, 2, 5, Direction.SOUTH);
        new Wall(mtl, 1, 4, Direction.WEST);
        new Wall(mtl, 2, 4, Direction.WEST);
        new Wall(mtl, 2, 5, Direction.EAST);
        new Wall(mtl, 1, 5, Direction.EAST);
        //
        new Wall(mtl, 4, 1, Direction.WEST);
        new Wall(mtl, 5, 1, Direction.WEST);
        new Wall(mtl, 5, 1, Direction.SOUTH);
        new Wall(mtl, 5, 2, Direction.SOUTH);
        new Wall(mtl, 4, 2, Direction.EAST);
        new Wall(mtl, 5, 2, Direction.EAST);
        new Wall(mtl, 4, 1, Direction.NORTH);
        new Wall(mtl, 4, 2, Direction.NORTH);
        //
        new Wall(mtl, 4, 4, Direction.NORTH);
        new Wall(mtl, 4, 5, Direction.NORTH);
        new Wall(mtl, 5, 4, Direction.SOUTH);
        new Wall(mtl, 5, 5, Direction.SOUTH);
        new Wall(mtl, 4, 4, Direction.WEST);
        new Wall(mtl, 5, 4, Direction.WEST);
        new Wall(mtl, 4, 5, Direction.EAST);
        new Wall(mtl, 5, 5, Direction.EAST);
    }
}
