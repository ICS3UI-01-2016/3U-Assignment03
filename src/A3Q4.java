
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
 * @author gavra1870
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a City for robot
        City jk = new City();
        Robot jef = new Robot(jk, 4, 2, Direction.EAST);
        // Create Walls
            new Wall(jk, 5, 3, Direction.NORTH);
            new Wall(jk, 5, 3, Direction.WEST);
            new Wall(jk, 6, 3, Direction.WEST);
            new Wall(jk, 6, 3, Direction.SOUTH);
            new Wall(jk, 6, 4, Direction.SOUTH);
            new Wall(jk, 6, 4, Direction.EAST);
            new Wall(jk, 5, 4, Direction.EAST);
            new Wall(jk, 5, 4, Direction.NORTH);
        
         


            

            for(int count = 0; count < 8; count = count + 1){
                jef.move();
                jef.move();
                jef.move();
                jef.turnLeft();
                jef.turnLeft();
                jef.turnLeft();
                






            }
        }
    }

