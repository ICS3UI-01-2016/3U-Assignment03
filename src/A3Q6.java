
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
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create City
        City af = new City();
        // create Robot
        Robot rem = new Robot(af, 3, 3, Direction.SOUTH);

        // create square 1 
        new Wall(af, 1, 1, Direction.WEST);
        new Wall(af, 1, 1, Direction.NORTH);
        new Wall(af, 1, 2, Direction.NORTH);
        new Wall(af, 1, 2, Direction.EAST);
        new Wall(af, 2, 1, Direction.WEST);
        new Wall(af, 2, 1, Direction.SOUTH);
        new Wall(af, 2, 2, Direction.EAST);
        new Wall(af, 2, 2, Direction.SOUTH);

        // create square 2 
        new Wall(af, 1, 4, Direction.WEST);
        new Wall(af, 1, 4, Direction.NORTH);
        new Wall(af, 1, 5, Direction.NORTH);
        new Wall(af, 1, 5, Direction.EAST);
        new Wall(af, 2, 4, Direction.WEST);
        new Wall(af, 2, 4, Direction.SOUTH);
        new Wall(af, 2, 5, Direction.EAST);
        new Wall(af, 2, 5, Direction.SOUTH);

        // create square 3
        new Wall(af, 4, 1, Direction.WEST);
        new Wall(af, 4, 1, Direction.NORTH);
        new Wall(af, 4, 2, Direction.NORTH);
        new Wall(af, 4, 2, Direction.EAST);
        new Wall(af, 5, 1, Direction.WEST);
        new Wall(af, 5, 1, Direction.SOUTH);
        new Wall(af, 5, 2, Direction.EAST);
        new Wall(af, 5, 2, Direction.SOUTH);

        // create square 4
        new Wall(af, 4, 4, Direction.WEST);
        new Wall(af, 4, 4, Direction.NORTH);
        new Wall(af, 4, 5, Direction.NORTH);
        new Wall(af, 4, 5, Direction.EAST);
        new Wall(af, 5, 4, Direction.WEST);
        new Wall(af, 5, 4, Direction.SOUTH);
        new Wall(af, 5, 5, Direction.EAST);
        new Wall(af, 5, 5, Direction.SOUTH);

        // make rem go around the squares
        int outside = 0;
        while (outside < 4) {

            int count = 0;
            while (count < 4) {
                rem.move();
                rem.move();
                rem.move();
                if (count < 3) {
                    rem.turnLeft();
                }
                // make rem stop between 4 of the squares(3,3) and move to every other square
                count = count + 1;
            }
            // make rem to turn left on every other side of the square 
            outside = outside + 1;
        }

    }
}
