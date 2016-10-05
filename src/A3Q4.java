
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.RobotSE;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fitaa8228
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //make necessities
        City kw = new City();
        RobotSE jim = new RobotSE(kw, 0, 2, Direction.WEST);
        //Label Robot
        jim.setColor(Color.yellow);
        jim.setLabel("Jim");
        //Make walls
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.SOUTH);
        //initial movement
        jim.move(2);
        jim.turnLeft();
        //loop for each side of the wall
        for (int side = 0; side < 7; side++) {
            jim.move(3);
            jim.turnLeft();
        }
        //Last movement needed
        jim.move();
    }
}
