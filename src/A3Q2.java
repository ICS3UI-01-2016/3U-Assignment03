
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomlj9878
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City JT = new City();
        Robot litter = new Robot(JT,1,1,Direction.EAST);
        //create walls
        new Wall(JT,1,1,Direction.NORTH);
        new Wall(JT,1,1,Direction.WEST);
        new Wall(JT,1,2,Direction.NORTH);
        new Wall(JT,1,3,Direction.NORTH);
        new Wall(JT,1,4,Direction.EAST);
        new Wall(JT,1,4,Direction.NORTH);
        new Wall(JT,2,4,Direction.EAST);
        new Wall(JT,3,4,Direction.EAST);
        new Wall(JT,3,4,Direction.SOUTH);
        new Wall(JT,3,3,Direction.SOUTH);
        new Wall(JT,3,2,Direction.SOUTH);
        new Wall(JT,3,1,Direction.SOUTH);
        new Wall(JT,3,1,Direction.WEST);
        new Wall(JT,2,1,Direction.WEST);
        //place things to pick up
        new Thing(JT,1,2,Direction.EAST);
        new Thing(JT,2,2,Direction.EAST);
        new Thing(JT,2,3,Direction.EAST);
        new Thing(JT,2,4,Direction.EAST);
        new Thing(JT,3,1,Direction.EAST);
        new Thing(JT,3,4,Direction.EAST);
        //move robot to pick things
        int count = 0;
        //loop 8 times
        while(count<17){
            if(litter.frontIsClear()){
                litter.move();
            }if(!litter.frontIsClear()&&litter.getDirection()==Direction.EAST){
                litter.turnLeft();
                litter.turnLeft();
            }if(!litter.frontIsClear()&&litter.getDirection()==Direction.WEST){
                litter.turnLeft();
                if(litter.frontIsClear()){
                litter.move();
                litter.turnLeft();
                }if(!litter.frontIsClear()){
                    litter.turnLeft();
                    litter.turnLeft();
                }
            }if(litter.canPickThing()){
                litter.pickThing();
            }
        }count = count + 1;
  }
 }        

