
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shieg0688
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create city
        City yeet = new City ();
        //create castle
        //room 1
        new Wall(yeet,1,1, Direction.NORTH);
        new Wall(yeet,1,2, Direction.NORTH);
        new Wall(yeet,1,2, Direction.EAST);
        new Wall(yeet,2,2, Direction.EAST);
        new Wall(yeet,2,2, Direction.SOUTH);
        new Wall(yeet,2,1,Direction. SOUTH);
        new Wall(yeet,1,1, Direction.WEST);
        new Wall(yeet,2,1, Direction.WEST);
        //room 2
        new Wall(yeet,1,4, Direction.NORTH);
        new Wall(yeet,1,5, Direction.NORTH);
        new Wall(yeet,1,5, Direction.EAST);
        new Wall(yeet,2,5, Direction.EAST);
        new Wall(yeet,2,5, Direction.SOUTH);
        new Wall(yeet,2,4,Direction. SOUTH);
        new Wall(yeet,1,4, Direction.WEST);
        new Wall(yeet,2,4, Direction.WEST);
        //room 3
        new Wall(yeet,4,4, Direction.NORTH);
        new Wall(yeet,4,5, Direction.NORTH);
        new Wall(yeet,4,5, Direction.EAST);
        new Wall(yeet,5,5, Direction.EAST);
        new Wall(yeet,5,5, Direction.SOUTH);
        new Wall(yeet,5,4,Direction. SOUTH);
        new Wall(yeet,4,4, Direction.WEST);
        new Wall(yeet,5,4, Direction.WEST);
        //room 4
        new Wall(yeet,4,2, Direction.NORTH);
        new Wall(yeet,4,1, Direction.NORTH);
        new Wall(yeet,4,2, Direction.EAST);
        new Wall(yeet,5,2, Direction.EAST);
        new Wall(yeet,5,2, Direction.SOUTH);
        new Wall(yeet,5,1,Direction. SOUTH);
        new Wall(yeet,4,1, Direction.WEST);
        new Wall(yeet,5,1, Direction.WEST);
        //create robot
        Robot googz = new Robot(yeet, 3,3, Direction.SOUTH);
        //create for loops to move bot
        for (int o = 0; o < 4; o = 1 + 1) {
            for (int n = 0; n < 3; n = n + 1){
                googz.move();
                googz.move();
                googz.move();
                googz.turnLeft();
            }
         //proceed to other rooms
         googz.move();
         googz.move();
         googz.move();
            
        }
        
        
    }
}
