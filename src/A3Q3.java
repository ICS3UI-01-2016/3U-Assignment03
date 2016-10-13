
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
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new city
        City mc = new City();
        //place robot
        Robot bul = new Robot(mc, 1, 1, Direction.SOUTH);

        // TODO code application logic here

        //creating rectangle
        new Wall(mc, 0, 0, Direction.NORTH);
        new Wall(mc, 0, 1, Direction.NORTH);
        new Wall(mc, 0, 2, Direction.NORTH);
        new Wall(mc, 0, 3, Direction.NORTH);

        new Wall(mc, 0, 3, Direction.EAST);
        new Wall(mc, 2, 3, Direction.EAST);

        new Wall(mc, 2, 3, Direction.SOUTH);
        new Wall(mc, 2, 2, Direction.SOUTH);
        new Wall(mc, 2, 1, Direction.SOUTH);
        new Wall(mc, 2, 0, Direction.SOUTH);

        new Wall(mc, 0, 0, Direction.WEST);
        new Wall(mc, 1, 0, Direction.WEST);
        new Wall(mc, 2, 0, Direction.WEST);

        while (bul.frontIsClear()) {
            bul.move();

            if (bul.isBesideThing(IPredicate.aWall)) {
                bul.turnLeft();
                bul.move();

             if (!bul.isBesideThing(IPredicate.aWall)) {
                bul.turnLeft();
                bul.turnLeft();
                bul.turnLeft();
                bul.move();
                
                break;
            }

        }
    }
    }
}