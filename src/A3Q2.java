
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gavra1870
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city
        City ty = new City();
        Robot tom = new Robot(ty, 4, 4, Direction.EAST);
        // Create Walls and Things
        new Wall(ty, 4, 4, Direction.WEST);
        new Wall(ty, 5, 4, Direction.WEST);
        new Wall(ty, 6, 4, Direction.WEST);
        new Wall(ty, 6, 4, Direction.SOUTH);
        new Wall(ty, 6, 5, Direction.SOUTH);
        new Wall(ty, 6, 6, Direction.SOUTH);
        new Wall(ty, 6, 7, Direction.SOUTH);
        new Wall(ty, 6, 7, Direction.EAST);
        new Wall(ty, 5, 7, Direction.EAST);
        new Wall(ty, 4, 7, Direction.EAST);
        new Wall(ty, 4, 6, Direction.NORTH);
        new Wall(ty, 4, 5, Direction.NORTH);
        new Wall(ty, 4, 4, Direction.NORTH);
        new Wall(ty, 4, 7, Direction.NORTH);
        new Thing(ty, 4, 5);
        new Thing(ty, 5, 5);
        new Thing(ty, 5, 6);
        new Thing(ty, 5, 7);
        new Thing(ty, 6, 4);
        new Thing(ty, 4, 7);

        // loop while front is clear
        // when the front is clear the robot will move and if it can pick something up it will do so.
        while (tom.frontIsClear()) {
            tom.move();
            if (tom.canPickThing()) {
                tom.pickThing();
       // if the front is not clear and facing east it will make a right and move back
            }
            if (!tom.frontIsClear() && tom.getDirection() == Direction.EAST) {
                tom.turnLeft();
                tom.turnLeft();
            }
       // when the robot returns back and the front is not clear once again it will turn facing south      
            if (!tom.frontIsClear() && tom.getDirection() == Direction.WEST) {
                tom.turnLeft();
       // when the front is clear then the robot will move once and turn left to return io its origanal postion
                if (tom.frontIsClear()) {
                    tom.move();
                    tom.turnLeft();
                } 

            }
        }
      // After the robot picks up the last thing and realizes it has a wall infront of it; the robot will turn facing north and move back into the starting postion.  
            while(!tom.frontIsClear()){
                   tom.turnLeft();
                   tom.turnLeft();
                   tom.move();
                   tom.move();
                   tom.turnLeft();
                   tom.turnLeft();
                   tom.turnLeft();
                   break;
                   
            }
        
        
    }
}
