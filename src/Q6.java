
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author schum0689
 */
public class Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create city
        City q6 = new City();

        // Create walls
        new Wall(q6, 1, 1, Direction.NORTH);
        new Wall(q6, 1, 2, Direction.NORTH);
        new Wall(q6, 1, 2, Direction.EAST);
        new Wall(q6, 2, 2, Direction.EAST);
        new Wall(q6, 2, 1, Direction.SOUTH);
        new Wall(q6, 2, 2, Direction.SOUTH);
        new Wall(q6, 1, 1, Direction.WEST);
        new Wall(q6, 2, 1, Direction.WEST);

        new Wall(q6, 1, 4, Direction.NORTH);
        new Wall(q6, 1, 5, Direction.NORTH);
        new Wall(q6, 1, 5, Direction.EAST);
        new Wall(q6, 2, 5, Direction.EAST);
        new Wall(q6, 2, 4, Direction.SOUTH);
        new Wall(q6, 2, 5, Direction.SOUTH);
        new Wall(q6, 1, 4, Direction.WEST);
        new Wall(q6, 2, 4, Direction.WEST);

        new Wall(q6, 4, 1, Direction.NORTH);
        new Wall(q6, 4, 2, Direction.NORTH);
        new Wall(q6, 4, 2, Direction.EAST);
        new Wall(q6, 5, 2, Direction.EAST);
        new Wall(q6, 5, 1, Direction.SOUTH);
        new Wall(q6, 5, 2, Direction.SOUTH);
        new Wall(q6, 4, 1, Direction.WEST);
        new Wall(q6, 5, 1, Direction.WEST);

        new Wall(q6, 4, 4, Direction.NORTH);
        new Wall(q6, 4, 5, Direction.NORTH);
        new Wall(q6, 4, 5, Direction.EAST);
        new Wall(q6, 5, 5, Direction.EAST);
        new Wall(q6, 5, 4, Direction.SOUTH);
        new Wall(q6, 5, 5, Direction.SOUTH);
        new Wall(q6, 4, 4, Direction.WEST);
        new Wall(q6, 5, 4, Direction.WEST);

        // Create robot
        RobotSE rick = new RobotSE(q6, 3, 3, Direction.SOUTH);

        // RED PATH
        // movesRed = move 1 side around the bottom right square
        for (int movesRed = 0; movesRed < 3; movesRed = movesRed + 1) {
            rick.move();
            rick.move();
            rick.move();
            rick.turnLeft();
        }

        // ORANGE, PINK, & YELLOW PATHS
        // Loop 3 times, once for each coloured path
        for (int paths = 0; paths < 3; paths = paths + 1) {
            // Move to intersection 3,3
            if (rick.getStreet() != 3 && rick.getAvenue() != 3) {
                do {
                    rick.move();
                } while (rick.getStreet() != 3 && rick.getAvenue() != 3);
            break;
            } 
            if (rick.getStreet()==3 && rick.getAvenue()==3){
                // Move around sqaure 3 times
                for (int moves = 0; moves < 3; moves = moves + 1) {
                    rick.move();
                    rick.move();
                    rick.move();
                    rick.turnLeft();
                }
            }
        }
    }
}
