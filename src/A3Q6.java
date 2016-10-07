
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 * A3Q6 07/10/2016
 *
 * @author micla1676
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create City
        City Squares = new City();

        Robot karel = new Robot(Squares, 3, 3, Direction.SOUTH);

        //create the 4 Squares

        //create the Northwest Square
        new Wall(Squares, 1, 1, Direction.NORTH);
        new Wall(Squares, 1, 2, Direction.NORTH);
        new Wall(Squares, 1, 1, Direction.WEST);
        new Wall(Squares, 2, 1, Direction.WEST);
        new Wall(Squares, 2, 1, Direction.SOUTH);
        new Wall(Squares, 2, 2, Direction.SOUTH);
        new Wall(Squares, 2, 2, Direction.EAST);
        new Wall(Squares, 1, 2, Direction.EAST);

        //create the Northeast Square
        new Wall(Squares, 1, 4, Direction.NORTH);
        new Wall(Squares, 1, 5, Direction.NORTH);
        new Wall(Squares, 1, 4, Direction.WEST);
        new Wall(Squares, 2, 4, Direction.WEST);
        new Wall(Squares, 2, 5, Direction.SOUTH);
        new Wall(Squares, 2, 4, Direction.SOUTH);
        new Wall(Squares, 2, 5, Direction.EAST);
        new Wall(Squares, 1, 5, Direction.EAST);

        //create the Southeast Square
        new Wall(Squares, 4, 4, Direction.NORTH);
        new Wall(Squares, 4, 5, Direction.NORTH);
        new Wall(Squares, 4, 4, Direction.WEST);
        new Wall(Squares, 5, 4, Direction.WEST);
        new Wall(Squares, 5, 5, Direction.SOUTH);
        new Wall(Squares, 5, 4, Direction.SOUTH);
        new Wall(Squares, 5, 5, Direction.EAST);
        new Wall(Squares, 4, 5, Direction.EAST);

        //create the Southwest Square
        new Wall(Squares, 4, 1, Direction.NORTH);
        new Wall(Squares, 4, 2, Direction.NORTH);
        new Wall(Squares, 4, 1, Direction.WEST);
        new Wall(Squares, 5, 1, Direction.WEST);
        new Wall(Squares, 5, 1, Direction.SOUTH);
        new Wall(Squares, 5, 2, Direction.SOUTH);
        new Wall(Squares, 5, 2, Direction.EAST);
        new Wall(Squares, 4, 2, Direction.EAST);

        //x equals how many times he will execute the ENTIRE LOOP
        //y Equals the turn around each square
        //z equals the transition between each square

        for (int x = 0; x < 4; x = x + 1) {
            for (int y = 0; y < 4; y = y + 1) {
                //move forward 3 times
                karel.move();
                karel.move();
                karel.move();
                //if y < 3, turn left
                if (y < 3) {
                    karel.turnLeft();
                }
            }


            /*         for(int z = 0; z < 3; z = z+1){
                       karel.move();              
                       }
             */
        }

    }
}
