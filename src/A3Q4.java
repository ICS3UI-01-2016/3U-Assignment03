
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
import becker.robots.Wall;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bulka4927
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new city
        City mc = new City();
        //place robot
        Robot bul = new Robot(mc, 0, 2, Direction.WEST);
        // TODO code application logic here

        //creating square (inverted due to glitch)
        new Wall(mc, 0, 2, Direction.SOUTH);
        new Wall(mc, 0, 1, Direction.SOUTH);

        new Wall(mc, 1, 0, Direction.EAST);
        new Wall(mc, 2, 0, Direction.EAST);

        new Wall(mc, 3, 2, Direction.NORTH);
        new Wall(mc, 3, 1, Direction.NORTH);

        new Wall(mc, 1, 3, Direction.WEST);
        new Wall(mc, 2, 3, Direction.WEST);


//move the robot
        while (bul.frontIsClear()) {
            bul.move();

            if (!bul.isBesideThing(IPredicate.anyWall)) {
                bul.turnLeft();

                int count = 0;
                //loop 8 times
                while (count > 8) {
                }
            }


        }
    }
}
