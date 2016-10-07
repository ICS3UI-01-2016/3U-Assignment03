
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
 * @author keyew7019
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create city for robot
        City kw = new City();
        //create a robot
        Robot rick = new Robot(kw, 0, 2, Direction.WEST);

        //create walls
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.WEST);

        //create loop for going around square
        //create a counter variable
        int count = 1;
        //loop 8 times
        while (count < 9) {
            rick.move();
            rick.move();
            rick.turnLeft();
            rick.move();
            //count 1 step
            count = count + 1;
            //counting using a for loop
            for (int i = 1; i < 9; i = i + 1) {
            }
        }
    }
}
