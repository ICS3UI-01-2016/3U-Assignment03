
import becker.robots.City;
import becker.robots.Direction;
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
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Make necessities
        City kw = new City();
        RobotSE jim = new RobotSE(kw, 1, 1, Direction.SOUTH);
        //Label Robot
        jim.setColor(Color.GREEN);
        jim.setLabel("Jim");
        //Make walls
        new Wall(kw, 0, 0, Direction.NORTH);
        new Wall(kw, 0, 2, Direction.NORTH);
        new Wall(kw, 0, 3, Direction.NORTH);
        new Wall(kw, 0, 3, Direction.EAST);
        new Wall(kw, 1, 3, Direction.EAST);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 2, 3, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 0, Direction.SOUTH);
        new Wall(kw, 2, 0, Direction.WEST);
        new Wall(kw, 1, 0, Direction.WEST);
        new Wall(kw, 0, 0, Direction.WEST);
        //Make jim find a wall
        while (jim.frontIsClear()) {
            jim.move();
        }
        jim.turnLeft();
        //Wall hugger
        while (true) {
            jim.move();
            if (jim.frontIsClear()) {
                jim.turnRight();
                //When he faces the exit, he leaves and stops
                if (jim.frontIsClear()) {
                    jim.move();
                    break;
                } else if (!jim.frontIsClear()) {
                    jim.turnLeft();
                }
                //When he faces a corner
            } else if (!jim.frontIsClear()) {
                jim.turnLeft();
            }
        }
    }
}
