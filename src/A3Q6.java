
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bulka4927
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new city
        City mc = new City();
        //place robot
        Robot bul = new Robot(mc, 3, 3, Direction.SOUTH);

        //placing walls
        new Wall(mc, 1, 1, Direction.NORTH);
        new Wall(mc, 1, 2, Direction.NORTH);
        new Wall(mc, 1, 2, Direction.EAST);
        new Wall(mc, 2, 2, Direction.EAST);
        new Wall(mc, 2, 2, Direction.SOUTH);
        new Wall(mc, 2, 1, Direction.SOUTH);
        new Wall(mc, 2, 1, Direction.WEST);
        new Wall(mc, 1, 1, Direction.WEST);

        new Wall(mc, 1, 4, Direction.NORTH);
        new Wall(mc, 1, 5, Direction.NORTH);
        new Wall(mc, 1, 5, Direction.EAST);
        new Wall(mc, 2, 5, Direction.EAST);
        new Wall(mc, 2, 4, Direction.SOUTH);
        new Wall(mc, 2, 5, Direction.SOUTH);
        new Wall(mc, 2, 4, Direction.WEST);
        new Wall(mc, 1, 4, Direction.WEST);

        new Wall(mc, 4, 1, Direction.NORTH);
        new Wall(mc, 4, 2, Direction.NORTH);
        new Wall(mc, 4, 2, Direction.EAST);
        new Wall(mc, 5, 2, Direction.EAST);
        new Wall(mc, 5, 2, Direction.SOUTH);
        new Wall(mc, 5, 1, Direction.SOUTH);
        new Wall(mc, 4, 1, Direction.WEST);
        new Wall(mc, 5, 1, Direction.WEST);

        new Wall(mc, 4, 4, Direction.NORTH);
        new Wall(mc, 4, 5, Direction.NORTH);
        new Wall(mc, 4, 5, Direction.EAST);
        new Wall(mc, 5, 5, Direction.EAST);
        new Wall(mc, 5, 4, Direction.SOUTH);
        new Wall(mc, 5, 5, Direction.SOUTH);
        new Wall(mc, 4, 4, Direction.WEST);
        new Wall(mc, 5, 4, Direction.WEST);

        int count = 0;
        //turn 12 times then stop
        for (int timesTurned = 0; timesTurned < 12; timesTurned = timesTurned + 1) {

            //go around squares
            while (bul.frontIsClear()) {
//go around a singkle square
                bul.move();
                bul.move();
                bul.move();
                if (count < 3) {
                    bul.turnLeft();
                    count++;
                } else if (count == 3) {
                    count = 0;

                }


            }


        }
    }
}
