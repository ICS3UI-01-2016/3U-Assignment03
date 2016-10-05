
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author baayl
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a City
        City af = new City();
        // create a Robot
        Robot rem = new Robot(af, 0, 2, Direction.WEST);

        new Wall(af, 1, 1, Direction.NORTH);
        new Wall(af, 1, 1, Direction.WEST);
        new Wall(af, 2, 1, Direction.SOUTH);
        new Wall(af, 2, 1, Direction.WEST);
        new Wall(af, 2, 2, Direction.SOUTH);
        new Wall(af, 2, 2, Direction.EAST);
        new Wall(af, 1, 2, Direction.EAST);
        new Wall(af, 1, 2, Direction.NORTH);

        // make rem go around the square 2 times 
        int count = 0;
        while (count < 8) {
            rem.move();
            rem.move();
            rem.turnLeft();
            rem.move();
            count = count + 1;
        }

    }
}
