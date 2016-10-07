
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
 * @author lawd8918
 */
public class A3q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create a city
        City kw = new City();
        //create walls
        new Wall(kw, 0, 0, Direction.WEST);
        new Wall(kw, 0, 0, Direction.NORTH);
        //new Wall(kw,0,1,Direction.NORTH);
        new Wall(kw, 0, 2, Direction.NORTH);
        new Wall(kw, 0, 3, Direction.NORTH);
        new Wall(kw, 0, 0, Direction.WEST);
        new Wall(kw, 1, 0, Direction.WEST);
        new Wall(kw, 2, 0, Direction.WEST);
        new Wall(kw, 2, 0, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 3, Direction.SOUTH);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 1, 3, Direction.EAST);
        new Wall(kw, 0, 3, Direction.EAST);
        //create robot
        Robot dave = new Robot(kw, 0, 1, Direction.SOUTH);

        //find exit
        int out = 0;
        while (dave.frontIsClear()) {
            dave.move();
        }

        dave.turnLeft();
        while (dave.frontIsClear() && out < 1) {
            dave.turnLeft();
            dave.turnLeft();
            dave.turnLeft();
            if (dave.frontIsClear()) {
                dave.move();
                out = out + 1;
            } else {
                dave.turnLeft();
                dave.move();
            }
            if (!dave.frontIsClear()) {
                dave.turnLeft();
                dave.move();
            }
        }






    }
}
