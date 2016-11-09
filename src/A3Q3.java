
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
 * @author shieg0688
 */
public class A3Q3 {
    private static Direction Direction;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //Create city
        City home = new City();
        new Wall(home, 1, 1, Direction.NORTH);
        new Wall(home, 1, 2, Direction.NORTH);
        new Wall(home, 1, 3, Direction.NORTH);
        new Wall(home, 1, 4, Direction.NORTH);
        new Wall(home, 1, 1, Direction.WEST);
        new Wall(home, 2, 1, Direction.WEST);
        new Wall(home, 3, 1, Direction.WEST);
        new Wall(home, 1, 4, Direction.EAST);
        new Wall(home, 2, 4, Direction.EAST);
        new Wall(home, 3, 4, Direction.EAST);
        new Wall(home, 3, 1, Direction.SOUTH);
        new Wall(home, 3, 2, Direction.SOUTH);
        
        new Wall(home, 3, 4, Direction.SOUTH);
        //create karel
        RobotSE karel = new RobotSE(home,1,2, Direction.EAST);
        //escape box!
        while(karel.frontIsClear()){
            karel.turnLeft();
            if(karel.frontIsClear()){
                karel.move();
                
            }
            if (!karel.frontIsClear()){
                karel.turnRight();
                karel.move();
                
                
            }
               
         while(!karel.frontIsClear()){
             karel.turnLeft();
         }
         if(karel.getStreet() ==4){
             break;
         }
         
         }
         
             
        }
    }

