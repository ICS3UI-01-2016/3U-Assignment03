
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author keyew7019
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create city for robot
        City kw = new City();
        //create a robot
        Robot rick = new Robot(kw, 0, 0, Direction.EAST);

        //create wall
        new Wall(kw, 0, 4, Direction.EAST);
        //create thing on opposite side of wall
        new Thing(kw, 0, 5);

        //create loop
        while (rick.frontIsClear()) {
            rick.move();
        }
    }
}
