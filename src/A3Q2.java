
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
 * @author wangk9757
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a city
       
        City kw = new City();
        // create dat walls
         new Wall(kw, 1, 1, Direction.NORTH);
         new Wall(kw,1,1,Direction.WEST);
         new Wall(kw, 1, 2, Direction.NORTH);
         new Wall(kw, 1, 4, Direction.NORTH);
         new Wall(kw, 1, 3, Direction.NORTH);
         new Wall(kw, 3, 1,Direction.WEST);
         new Wall(kw, 2, 1,Direction.WEST);
         new Wall(kw, 3, 4, Direction.SOUTH);
         new Wall(kw, 3, 3, Direction.SOUTH);
         new Wall(kw, 3, 2, Direction.SOUTH);
         new Wall(kw, 3, 1, Direction.SOUTH);
         new Wall(kw, 1, 4, Direction.EAST);
         new Wall(kw, 2, 4, Direction.EAST);
         new Wall(kw, 3, 4, Direction.EAST);
         
              //create robot
             Robot karel = new Robot(kw,1,1,Direction.EAST);
             //create things
             new Thing (kw,1,2);
             new Thing (kw,2,2);
            new Thing (kw,3,2);
            
            new Thing (kw,3,4);
            //get karel to perform the stuff
           
           while (karel.frontIsClear()) {
            karel.move();

            //if theres a thing, pick it up
            if (karel.canPickThing()) {
                karel.pickThing();
            }
            //if the front is not clear, turn around
            if (!karel.frontIsClear()) {
                karel.turnLeft();
                karel.turnLeft();
            }
            //if bob is on avenue 1, turn right
            if (karel.getAvenue() == 1) {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                //if the front is not clear then, turn turn around
                if (!karel.frontIsClear()) {
                    karel.turnLeft();
                    karel.turnLeft();
                }
                //move and turn left
                karel.move();
                karel.turnLeft();

                //if bob is facing West, turn right and move
                if (karel.getDirection() == Direction.WEST) {
                    karel.turnLeft();
                    karel.turnLeft();
                    karel.turnLeft();
                    karel.move();
                }
                //if the front is not clear again, turn right. End loop
                if (!karel.frontIsClear()) {
                    karel.turnLeft();
                    karel.turnLeft();
                    karel.turnLeft();
                    break;
                        
                    }
               
            }
           }
    }
}
            

                
               
    
                
         
    

    
    

