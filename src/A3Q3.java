
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
 * @author khans4349
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kw = new City();

        RobotSE karel = new RobotSE(kw, 2, 2, Direction.WEST);

        // make the walls
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);

        new Wall(kw, 4, 1, Direction.SOUTH);
        new Wall(kw, 4, 2, Direction.SOUTH);
        new Wall(kw, 4, 3, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.SOUTH);

        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 4, 1, Direction.WEST);

        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 4, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);

        // get robot to move
        while(karel.frontIsClear()){
            karel.move();
        }
        while(!karel.frontIsClear()){
            karel.turnLeft();
            while(karel.frontIsClear()){
                karel.move();
                karel.turnRight();
                if(karel.frontIsClear()){
                    karel.move();
                    break;
                }
                karel.turnLeft();
            }
            
        }
    }
}
