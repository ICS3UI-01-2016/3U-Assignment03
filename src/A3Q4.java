
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wangk9757
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City kw = new City();

        //create a robot
        RobotSE karel = new RobotSE(kw, 1, 2, Direction.WEST);
        //create some walls
        new Wall(kw, 2, 3, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 3, 3, Direction.WEST);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 2, 3, Direction.WEST);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.NORTH);
        //get robot to run around one wall
        
        for (int i = 0; i < 8; i = i + 1) {
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        }
    }
    }

    


        
