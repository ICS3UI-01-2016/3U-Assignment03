
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
 * @author macdt8987
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make City
        City kw = new City();
        // Make Robot
        RobotSE karl = new RobotSE(kw, 3, 3, Direction.SOUTH);
        // Make the walls

        //Box 1
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);
        // Box 2
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.WEST);
        new Wall(kw, 1, 5, Direction.EAST);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 2, 4, Direction.SOUTH);
        new Wall(kw, 2, 5, Direction.SOUTH);
        // Box 3
        new Wall(kw, 4, 1, Direction.NORTH);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 4, 2, Direction.EAST);
        new Wall(kw, 5, 1, Direction.WEST);
        new Wall(kw, 5, 2, Direction.EAST);
        new Wall(kw, 5, 1, Direction.SOUTH);
        new Wall(kw, 5, 2, Direction.SOUTH);
        // Box 4
        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 5, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.WEST);
        new Wall(kw, 4, 5, Direction.EAST);
        new Wall(kw, 5, 4, Direction.WEST);
        new Wall(kw, 5, 5, Direction.EAST);
        new Wall(kw, 5, 4, Direction.SOUTH);
        new Wall(kw, 5, 5, Direction.SOUTH);

        // Make the robot Go around the boxes
        if (karl.frontIsClear()) {
            for (int i = 0; i < 4; i = i + 1){
                karl.move();
                karl.move();
                karl.move();
                karl.turnLeft();
            }
        
            karl.turnRight();
            for (int i = 0; i < 4; i = i + 1){
                karl.move();
                karl.move();
                karl.move();
                karl.turnLeft();
            }
            
            karl.turnRight();
            
            for (int i = 0; i < 4; i = i + 1){
                karl.move();
                karl.move();
                karl.move();
                karl.turnLeft();


            }
            karl.turnRight();
            for (int i = 0; i < 4; i = i + 1){
                karl.move();
                karl.move();
                karl.move();
                karl.turnLeft();


            }
            karl.turnRight();
    }
        }
        
}
