
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author slatz8075
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for the robot
        City A3Q6 = new City();
        //Create a Robot
        Robot karel = new Robot(A3Q6, 3, 3, Direction.SOUTH);
        //Create square 1
        new Wall(A3Q6, 1, 2, Direction.NORTH);
        new Wall(A3Q6, 1, 1, Direction.NORTH);
        new Wall(A3Q6, 1, 1, Direction.WEST);
        new Wall(A3Q6, 2, 1, Direction.WEST);
        new Wall(A3Q6, 2, 2, Direction.EAST);
        new Wall(A3Q6, 1, 2, Direction.EAST);
        new Wall(A3Q6, 2, 1, Direction.SOUTH);
        new Wall(A3Q6, 2, 2, Direction.SOUTH);
        //Create square 2
        new Wall(A3Q6, 1, 5, Direction.NORTH);
        new Wall(A3Q6, 1, 4, Direction.NORTH);
        new Wall(A3Q6, 1, 4, Direction.WEST);
        new Wall(A3Q6, 2, 4, Direction.WEST);
        new Wall(A3Q6, 2, 5, Direction.EAST);
        new Wall(A3Q6, 1, 5, Direction.EAST);
        new Wall(A3Q6, 2, 4, Direction.SOUTH);
        new Wall(A3Q6, 2, 5, Direction.SOUTH);
        //Create square 3
        new Wall(A3Q6, 4, 5, Direction.NORTH);
        new Wall(A3Q6, 4, 4, Direction.NORTH);
        new Wall(A3Q6, 4, 4, Direction.WEST);
        new Wall(A3Q6, 5, 4, Direction.WEST);
        new Wall(A3Q6, 5, 5, Direction.EAST);
        new Wall(A3Q6, 4, 5, Direction.EAST);
        new Wall(A3Q6, 5, 4, Direction.SOUTH);
        new Wall(A3Q6, 5, 5, Direction.SOUTH);
        //create square 4
        new Wall(A3Q6, 4, 2, Direction.NORTH);
        new Wall(A3Q6, 4, 1, Direction.NORTH);
        new Wall(A3Q6, 4, 1, Direction.WEST);
        new Wall(A3Q6, 5, 1, Direction.WEST);
        new Wall(A3Q6, 5, 2, Direction.EAST);
        new Wall(A3Q6, 4, 2, Direction.EAST);
        new Wall(A3Q6, 5, 1, Direction.SOUTH);
        new Wall(A3Q6, 5, 2, Direction.SOUTH);
        int count = 0;
        while (count < 12) {
            karel.move();
            if (karel.getAvenue() == 3 && karel.getStreet() == 3) {
                karel.move();
                karel.move();
            }
            karel.turnLeft();
            if (karel.frontIsClear()) {
                karel.move();
                count = count + 1;
            } else {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
            }
        }
        karel.move();
        karel.move();        
    }
}
