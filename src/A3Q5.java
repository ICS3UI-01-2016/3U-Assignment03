
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fitaa8228
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create necessities
        City kw = new City();
        RobotSE jim = new RobotSE(kw, 0, 0, Direction.EAST);
        //Label Robot
        jim.setColor(Color.blue);
        jim.setLabel("Jim");
        //Make Things
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        //Loop
        for (int carryThing = 0; carryThing < 10; carryThing++) {
            jim.pickThing();
            jim.move();
            jim.putThing();
            jim.turnAround();
            jim.move();
            jim.turnAround();
        }
        //final movement
        jim.move();
    }
}
