
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANNT0773
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City kw=new City();
        //create a robot
        Robot taylor=new Robot(kw,1,2,Direction.SOUTH);
        
        //create walls
        new Wall(kw,0,0,Direction.NORTH);
        new Wall(kw,0,0,Direction.WEST);
        new Wall(kw,1,0,Direction.WEST);
        new Wall(kw,2,0,Direction.WEST);
        new Wall(kw,2,0,Direction.SOUTH);
        new Wall(kw,2,1,Direction.SOUTH);
        new Wall(kw,2,2,Direction.SOUTH);
        new Wall(kw,2,3,Direction.SOUTH);
        new Wall(kw,2,3,Direction.EAST);
        new Wall(kw,1,3,Direction.EAST);
        new Wall(kw,0,3,Direction.EAST);
        new Wall(kw,0,3,Direction.NORTH);
        new Wall(kw,0,2,Direction.NORTH);

        
        while(taylor.getDirection() !=Direction.EAST){
            taylor.turnLeft();    
        }
        
        //move the robot to escape the room
        while(taylor.frontIsClear()){
            taylor.move();
        if(!taylor.frontIsClear()){
            taylor.turnLeft();
        }else{
            if(!taylor.isBesideThing(IPredicate.aLight) && taylor.getDirection()==Direction.WEST){
                taylor.move();
                taylor.turnLeft();
                taylor.turnLeft();
                taylor.turnLeft();
                taylor.move();
            }
        }
        
        
        // TODO code application logic here
        }
    }
}
