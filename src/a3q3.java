
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
public class a3q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new city
        City mtl = new City();
        //create a robot
        Robot candice = new Robot(mtl, 2, 2, Direction.SOUTH);
        //create walls
        new Wall(mtl, 1, 1, Direction.WEST);
        new Wall(mtl, 2, 1, Direction.WEST);
        new Wall(mtl, 3, 1, Direction.WEST);
        new Wall(mtl, 3, 1, Direction.SOUTH);
        new Wall(mtl, 3, 2, Direction.SOUTH);
        new Wall(mtl, 3, 3, Direction.SOUTH);
        new Wall(mtl, 3, 4, Direction.SOUTH);
        new Wall(mtl, 3, 4, Direction.EAST);
        new Wall(mtl, 2, 4, Direction.EAST);
        new Wall(mtl, 1, 4, Direction.EAST);
        new Wall(mtl, 1, 1, Direction.NORTH);
        new Wall(mtl, 1, 3, Direction.NORTH);
        new Wall(mtl, 1, 4, Direction.NORTH);
        //make Houdini a face wall
        candice.turnLeft();
        candice.turnLeft();
        candice.turnLeft();
        //check if wall in front
        while (candice.frontIsClear()) {
            candice.move();
        }
        //if there is a wall in front
        while (!candice.frontIsClear()) {
            candice.turnLeft();
            if (candice.frontIsClear()) {
                candice.move();
            }
            //if there's no wall in front
            if (candice.frontIsClear()) {
                candice.turnLeft();
                candice.turnLeft();
                candice.turnLeft();
                //has reached the exit
                if (candice.frontIsClear()) {
                    candice.move();
                }
            }
        }
    }
}
