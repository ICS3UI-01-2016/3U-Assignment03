
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
 * @author baayl3669
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City af = new City();
        // create robot
        Robot rem = new Robot(af,1,1,Direction.EAST);
        
        // create enclosed 'rectangular' room
        new Wall(af,1,1,Direction.NORTH);
        new Wall(af,1,1,Direction.WEST);
        new Wall(af,1,2,Direction.NORTH);
        new Wall(af,1,3,Direction.NORTH);
        new Wall(af,1,4,Direction.NORTH);
        new Wall(af,1,4,Direction.EAST);
        new Wall(af,2,1,Direction.WEST);
        new Wall(af,3,1,Direction.WEST);
        new Wall(af,2,4,Direction.EAST);
        new Wall(af,3,4,Direction.EAST);
        new Wall(af,3,1,Direction.SOUTH);
        new Wall(af,3,2,Direction.SOUTH);
        new Wall(af,3,3,Direction.SOUTH);
        new Wall(af,3,4,Direction.SOUTH);
        
        // create litter
        new Thing(af, 1, 2);
        new Thing(af, 3, 1);
        new Thing(af, 2, 2);
        new Thing(af, 2, 3);
        new Thing(af, 2, 4);
        new Thing(af, 3, 4);
        
        // make rem pick thing if frontIsClear
        while(rem.frontIsClear()){
            rem.move();
            if(rem.canPickThing()){
                rem.pickThing();
            }
            
            // make rem to move (2,4)
            if(!rem.frontIsClear()){
                if(rem.getDirection() == Direction.EAST){
                   rem.turnLeft();
                   rem.turnLeft();
                   rem.turnLeft();
                   if(rem.frontIsClear()){
                       rem.move();
                       rem.turnLeft();
                       rem.turnLeft();
                       rem.turnLeft();
                   }
                   
                   // make rem face WEST to pick Thing and move           
                   } else if (rem.getDirection() == Direction.WEST){
                       rem.turnLeft();
                       rem.move();
                       rem.turnLeft();
                   }
                   
                if(rem.canPickThing()){
                    rem.pickThing();
                }
             }
           }
        // make rem to move (3,1) and make rem move to (1,1)
        while(rem.getDirection() != Direction.WEST) {
            rem.turnLeft();
        }     
        while(rem.getAvenue() != 1){
            rem.move();
        }
        while(rem.getDirection() != Direction.NORTH){
            rem.turnLeft();
        }
        while(rem.getStreet() != 1){
            rem.move();
        }
        // make rem turn left to return to the same postion at the beginning 
        rem.turnLeft();
        rem.turnLeft();
        rem.turnLeft();
        }
}
    

