
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
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
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make city
        City aaa = new City();
        // Make a robot
        RobotSE karl = new RobotSE(aaa, 2, 2, Direction.SOUTH);
        // Make the walls
        new Wall(aaa, 1, 1, Direction.NORTH);
        new Wall(aaa, 1, 1, Direction.WEST);
        new Wall(aaa, 2, 1, Direction.WEST);
        new Wall(aaa, 3, 1, Direction.WEST);
        new Wall(aaa, 3, 3, Direction.SOUTH);
        new Wall(aaa, 3, 1, Direction.SOUTH);
        new Wall(aaa, 3, 2, Direction.SOUTH);
        new Wall(aaa, 3, 4, Direction.SOUTH);
        new Wall(aaa, 3, 4, Direction.EAST);
        new Wall(aaa, 2, 4, Direction.EAST);
        new Wall(aaa, 1, 4, Direction.EAST);
        new Wall(aaa, 1, 3, Direction.NORTH);
        new Wall(aaa, 1, 4, Direction.NORTH);
        // make the robot move
        while(karl.frontIsClear()){
            karl.move();
            if(!karl.frontIsClear()){
                karl.turnRight();
                
            }
            
            if(!karl.isBesideThing(IPredicate.aWall)){
                    karl.turnLeft();
                    karl.move();
                    while(karl.isFacingNorth()){
                        
                    }
                    
                    
    
            }         
    }
    }
}
