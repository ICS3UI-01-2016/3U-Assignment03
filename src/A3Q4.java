
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 * A3Q4 07/10/2016
 *
 * @author micla1676
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city for the robot
        City Square = new City();

        //create new robot
        Robot karel = new Robot(Square, 0, 2, Direction.WEST);

        //create walls for square
        new Wall(Square, 1, 1, Direction.NORTH);
        new Wall(Square, 1, 1, Direction.WEST);
        new Wall(Square, 1, 2, Direction.NORTH);
        new Wall(Square, 2, 1, Direction.WEST);
        new Wall(Square, 2, 1, Direction.SOUTH);
        new Wall(Square, 2, 2, Direction.SOUTH);
        new Wall(Square, 2, 2, Direction.EAST);
        new Wall(Square, 1, 2, Direction.EAST);

        //loop 8 times
        for (int x = 0; x < 8; x = x + 1) {
            //move forward twice
            karel.move();
            karel.move();
            //turn left, then move forward
            karel.turnLeft();
            karel.move();
        }


    }
}
