
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author shieg0688
 */
public class A3Q2 {

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
        
        new Wall(home, 1, 4, Direction.EAST);
        new Wall(home, 2, 4, Direction.EAST);
        
        new Wall(home, 2, 1, Direction.SOUTH);
        new Wall(home, 2, 2, Direction.SOUTH);
        new Wall(home, 2, 3, Direction.SOUTH);
        new Wall(home, 2, 4, Direction.SOUTH);
        //litter :(
        new Thing(home, 1, 2);
        new Thing(home, 1, 3);
        new Thing(home, 2, 2);
        new Thing(home, 2, 4);
        
        //Create gugu
        RobotSE gugu = new RobotSE(home, 1, 1, Direction.EAST);
        //pick up litter
        
        while(gugu.frontIsClear()){
            gugu.move();
            while(gugu.canPickThing()){
                gugu.pickThing();
            }
            while(!gugu.frontIsClear()){
                    gugu.turnRight();
                    
                    }
            if(gugu.getAvenue() ==1){
                gugu.move();
                gugu.turnRight();
                break;
                }
        
        }
            
      
            
            















        }


    }



