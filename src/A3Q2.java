
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macdt8987
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make a city
        City kw = new City();
        //make robot
        RobotSE karl = new RobotSE(kw,1,1,Direction.EAST);
        // Make the walls
        new Wall(kw,1,1,Direction.WEST);
        new Wall(kw,1,1,Direction.NORTH);
        new Wall(kw,1,2,Direction.NORTH);
        new Wall(kw,1,3,Direction.NORTH);
        new Wall(kw,1,4,Direction.NORTH);
        new Wall(kw,1,4,Direction.EAST);
        new Wall(kw,2,4,Direction.EAST);
        new Wall(kw,3,4,Direction.EAST);
        new Wall(kw,2,1,Direction.WEST);
        new Wall(kw,3,1,Direction.WEST);
        new Wall(kw,3,2,Direction.SOUTH);
        new Wall(kw,3,1,Direction.SOUTH);
        new Wall(kw,3,3,Direction.SOUTH);
        new Wall(kw,3,4,Direction.SOUTH);
        // Make the things
        new Thing(kw,1,2);
        new Thing(kw,2,2);
        new Thing(kw,2,3);
        new Thing(kw,2,4);
        new Thing(kw,3,4);
        new Thing(kw,3,1);
        //Make the robot move
        karl.turnRight();
        karl.move();
        karl.turnLeft();
        if(karl.frontIsClear()){
            for(int i = 0; i < 19; i = i + 1){
           karl.move();
             
            
        
            
            if(karl.canPickThing()){
                karl.pickThing();
            }
          if(!karl.frontIsClear()){
              karl.turnRight();
       }
          }
        }
        
    }
}
