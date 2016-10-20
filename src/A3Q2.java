
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
 * @author katop7929
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City kpl = new City();
 
         //create Robot
         RobotSE obama = new RobotSE(kpl,1,1,Direction.EAST);
 
         //make the room
         new Wall(kpl,1,1,Direction.NORTH);
         new Wall(kpl,1,2,Direction.NORTH);
         new Wall(kpl,1,3,Direction.NORTH);
         new Wall(kpl,1,4,Direction.NORTH);
         new Wall(kpl,1,4,Direction.EAST);
         new Wall(kpl,2,4,Direction.EAST);
         new Wall(kpl,3,4,Direction.EAST);
         new Wall(kpl,3,1,Direction.SOUTH);
         new Wall(kpl,3,2,Direction.SOUTH);
         new Wall(kpl,3,3,Direction.SOUTH);
         new Wall(kpl,3,4,Direction.SOUTH);
         new Wall(kpl,1,1, Direction.WEST);
         new Wall(kpl,2,1,Direction.WEST);
         new Wall(kpl,3,1,Direction.WEST);
 
         //make things
         new Thing(kpl,1,4);
         new Thing(kpl,2,3);
         new Thing(kpl,3,1);
         new Thing(kpl,3,4);
         new Thing(kpl,1,2);
         new Thing(kpl,2,2);
         
         // make obama pick up all th litter in the room
         while(obama.frontIsClear()){
             obama.move();
             
             //get robot to pick up things
             if(obama.canPickThing()){
                 obama.pickThing();
             }
             //when front is not clear, make obama turn around
             if(!obama.frontIsClear()){
                 obama.turnAround();
                 
                 //get him to turn right and move when he reaches avenue 1
                 if(obama.getAvenue()== 1){
                     obama.turnRight();
                     obama.move(); 
                     obama.turnLeft();
                     if(obama.canPickThing()){
                         obama.pickThing();
                     }
                 }
                 
                 //get obama to his starting position
                 if(!obama.frontIsClear()){
                   while(obama.getStreet()== 1){
                    if(obama.getDirection()== Direction.SOUTH)
                     obama.turnAround();   
                   }
                   while(obama.getAvenue()== 1){
                    if(obama.getDirection()== Direction.EAST)
                     obama.turnLeft();
                      break; 
                 }
               }  
         }
             
            
        
        
        
        
        
        
        
         }        
    }
}
