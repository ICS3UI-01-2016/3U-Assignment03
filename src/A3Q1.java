
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.RobotSE;
import becker.robots.Thing;
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
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Make necessities
        City kw = new City();
        RobotSE jim = new RobotSE(kw, 0, 0, Direction.EAST);
        //Label Robot
        jim.setColor(Color.blue);
        jim.setLabel("Jim");
        //Make obstacles
        new Wall(kw, 0, 5, Direction.WEST);
        new Thing(kw, 0, 3);
        //Make loop
        //He only moves when he isn't in front of a wall or on top of a thing
        while (jim.frontIsClear() && !jim.isBesideThing(IPredicate.aThing)) {
            jim.move();
        }
    }
}
