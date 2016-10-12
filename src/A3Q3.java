
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
 * @author tomlj9878
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City JT = new City();
        Robot houdini = new Robot(JT,10,5,Direction.EAST);
        //create walls
        new Wall(JT,7,3,Direction.NORTH);
        new Wall(JT,7,4,Direction.NORTH);
        new Wall(JT,7,5,Direction.NORTH);
        new Wall(JT,7,6,Direction.NORTH);
        new Wall(JT,8,3,Direction.WEST);
        new Wall(JT,9,3,Direction.WEST);
        new Wall(JT,10,3,Direction.WEST);
        new Wall(JT,7,3,Direction.WEST);
        new Wall(JT,10,3,Direction.SOUTH);
        new Wall(JT,10,4,Direction.SOUTH);
        new Wall(JT,10,5,Direction.SOUTH);
        new Wall(JT,10,6,Direction.SOUTH);
        new Wall(JT,7,6,Direction.EAST);
        new Wall(JT,9,6,Direction.EAST);
        new Wall(JT,10,6,Direction.EAST);
        //move houdini
        while(houdini.getCity()==JT){
            if(houdini.frontIsClear()){
                houdini.move();
            }if(!houdini.frontIsClear()){
                houdini.turnLeft();
                houdini.move();
            }if(houdini.isBesideThing(IPredicate.aWall)){
                houdini.move();
            }if(!houdini.isBesideThing(IPredicate.anyWall)){
                houdini.turnLeft();
                houdini.turnLeft();
                houdini.turnLeft();
            }        
            
        }
    }
}
