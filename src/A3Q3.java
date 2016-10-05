
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
 * @author smith3577
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create city, robot, and walls
        City kw = new City();
        Robot karel = new Robot(kw, 2, 3, Direction.WEST);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        // get karel to escape
        while (karel.frontIsClear()) {
            karel.move();
        }
        karel.turnLeft();
        int moves = 0;
        while (moves < 5) {
            while (karel.frontIsClear() && karel.isBesideThing(IPredicate.aWall)) {
                karel.move();
            }
            karel.turnLeft();
            if (!karel.isBesideThing(IPredicate.aWall)) {
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
                moves = 5;
            }
            moves = moves + 1;
        }
    }
}
