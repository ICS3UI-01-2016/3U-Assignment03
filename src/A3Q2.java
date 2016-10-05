
import becker.robots.City;
import becker.robots.Direction;
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
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Make necessities
        City kw = new City();
        RobotSE jim = new RobotSE(kw, 1, 1, Direction.EAST);
        //Label Jim
        jim.setColor(Color.gray);
        jim.setLabel("Jim");
        //Make walls
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 4, 1, Direction.SOUTH);
        new Wall(kw, 4, 2, Direction.SOUTH);
        new Wall(kw, 4, 3, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.EAST);
        //Make random Things
        new Thing(kw, 3, 4);
        new Thing(kw, 3, 4);
        new Thing(kw, 3, 3);
        new Thing(kw, 2, 1);
        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 4, 3);
        new Thing(kw, 3, 4);
        new Thing(kw, 1, 3);
        new Thing(kw, 2, 2);
        //Make Loop
        while (true) {
            //Clean out each row
            if (jim.frontIsClear()) {
                if (jim.canPickThing()) {
                    jim.pickAllThings();
                }
                jim.move();
            } //Once a row is cleaned he will turn around and walk to avenue 1
            else if (!jim.frontIsClear() && jim.getAvenue() != 1) {
                jim.turnAround();
            } //Once he reaches avenue 1 he moves down one street to start the process again
            else if (!jim.frontIsClear() && jim.getAvenue() == 1) {
                jim.turnLeft();
                //loop if theres another street
                if (jim.frontIsClear()) {
                    jim.move();
                    jim.turnLeft();
                } //loop for final street
                else if (!jim.frontIsClear()) {
                    jim.turnAround();
                    while (jim.frontIsClear()) {
                        jim.move();
                    }
                    jim.turnRight();
                    break;
                }
            }
        }
    }
}
