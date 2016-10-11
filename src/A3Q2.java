
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
 * @author slatz8075
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a City for the Robot
        City A3Q2 = new City();
        //Create robot
        Robot karel = new Robot(A3Q2, 1, 1, Direction.EAST);

        //create the room
        new Wall(A3Q2, 1, 1, Direction.WEST);
        new Wall(A3Q2, 2, 1, Direction.WEST);
        new Wall(A3Q2, 3, 1, Direction.WEST);
        new Wall(A3Q2, 1, 1, Direction.NORTH);
        new Wall(A3Q2, 1, 2, Direction.NORTH);
        new Wall(A3Q2, 1, 3, Direction.NORTH);
        new Wall(A3Q2, 1, 4, Direction.NORTH);
        new Wall(A3Q2, 1, 4, Direction.EAST);
        new Wall(A3Q2, 2, 4, Direction.EAST);
        new Wall(A3Q2, 3, 4, Direction.EAST);
        new Wall(A3Q2, 3, 1, Direction.SOUTH);
        new Wall(A3Q2, 3, 2, Direction.SOUTH);
        new Wall(A3Q2, 3, 3, Direction.SOUTH);
        new Wall(A3Q2, 3, 4, Direction.SOUTH);
        //create the litter
        new Thing(A3Q2, 1, 4);
        new Thing(A3Q2, 3, 2);
        new Thing(A3Q2, 1, 4);
        new Thing(A3Q2, 2, 1);
        new Thing(A3Q2, 3, 3);
        new Thing(A3Q2, 3, 4);
        new Thing(A3Q2, 2, 3);
        new Thing(A3Q2, 2, 3);


        int count = 0;
        while (true) {

            while (karel.canPickThing()) {
                //found a piece of litter
                karel.pickThing();
            }
            if (karel.frontIsClear() != true) {
                //found a corner
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
            } else {
                karel.move();
            }
            if (karel.getAvenue() == 1 && karel.getStreet() == 1 && count < 1) {

                karel.turnLeft();
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                count = count + 1;

            }
            if (karel.getAvenue() == 1 && karel.getStreet() == 1 && count == 1) {
                break;
            }
        }
    }
}
