
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
 * @author shieg0688
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create city for robot
        City NYC = new City();
        new Wall(NYC, 1, 1, Direction.NORTH);
        new Wall(NYC, 1, 2, Direction.NORTH);
        new Wall(NYC, 1, 1, Direction.WEST);
        new Wall(NYC, 2, 1, Direction.WEST);
        new Wall(NYC, 2, 1, Direction.SOUTH);
        new Wall(NYC, 2, 2, Direction.SOUTH);
        new Wall(NYC, 1, 2, Direction.EAST);
        new Wall(NYC, 2, 2, Direction.EAST);
        //create robot
        Robot walle = new Robot(NYC,0,0, Direction.SOUTH);
        //circle the walls
        int moves = 0;
        
        while(moves < 8){
            walle.move();
            walle.move();
            walle.move();
            walle.turnLeft();
            moves = moves + 1;
            }
            
        
    }
    }

