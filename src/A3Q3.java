
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
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create da city
        City kw = new City();
        //create dat robot baby
        RobotSE karel = new RobotSE(kw, 4, 3, Direction.WEST);
        //create some walls cause society is a whore
        new Wall(kw, 2, 2, Direction.NORTH);
        new Wall(kw, 2, 3, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.EAST);

        new Wall(kw, 4, 5, Direction.EAST);

        new Wall(kw, 5, 5, Direction.EAST);
        new Wall(kw, 2, 2, Direction.WEST);
        new Wall(kw, 3, 2, Direction.WEST);
        new Wall(kw, 4, 2, Direction.WEST);
        new Wall(kw, 5, 2, Direction.WEST);
        new Wall(kw, 5, 2, Direction.SOUTH);
        new Wall(kw, 5, 3, Direction.SOUTH);
        new Wall(kw, 5, 4, Direction.SOUTH);
        new Wall(kw, 5, 5, Direction.SOUTH);
        //get the robot to move straight until hit wall
       
        while (karel.frontIsClear()) {
            karel.move();
        }
              
            
            while (!karel.frontIsClear()) {
                karel.turnLeft();
                karel.move();
                
                
                
            if (karel.frontIsClear()){
                karel.turnRight();
            }
            }
            karel.move();

        }
}

    

        
    
