
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
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create city
        City q4 = new City();

        // Create walls
        new Wall(q4, 1, 1, Direction.NORTH);
        new Wall(q4, 1, 2, Direction.NORTH);
        new Wall(q4, 1, 2, Direction.EAST);
        new Wall(q4, 2, 2, Direction.EAST);
        new Wall(q4, 2, 1, Direction.SOUTH);
        new Wall(q4, 2, 2, Direction.SOUTH);
        new Wall(q4, 1, 1, Direction.WEST);
        new Wall(q4, 2, 1, Direction.WEST);
        
        // Create robot
        RobotSE rick = new RobotSE(q4,0,2,Direction.WEST);
        
        // FOR LOOP
        // sides = 1 side around square, for 8 sides
        for(int sides = 0; sides < 8; sides = sides + 1){
            rick.move();
            rick.move();
            rick.turnLeft();
            rick.move();
        }
    }
}
