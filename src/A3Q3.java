
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
 * @author baayl3669
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city 
        City af = new City();
        // create a city
        Robot rem = new Robot(af,1,2,Direction.EAST);
        
        // make the rectangular room
        new Wall(af, 0, 0, Direction.NORTH);
        new Wall(af, 0, 0, Direction.WEST);
        new Wall(af, 1, 0, Direction.WEST);
        new Wall(af, 2, 0, Direction.WEST);
        new Wall(af, 2, 0, Direction.SOUTH);
        new Wall(af, 2, 1, Direction.SOUTH);
        new Wall(af, 2, 2, Direction.SOUTH);
        new Wall(af, 2, 4, Direction.SOUTH);
        new Wall(af, 2, 4, Direction.EAST);
        new Wall(af, 1, 4, Direction.EAST);
        new Wall(af, 0, 4, Direction.EAST);
        new Wall(af, 0, 1, Direction.NORTH);
        new Wall(af, 0, 2, Direction.NORTH);
        new Wall(af, 0, 3, Direction.NORTH);
        new Wall(af, 0, 4, Direction.NORTH);
        
        // make rem move to the side of the room
        while(rem.frontIsClear()){
            rem.move();
        }
        if(!rem.frontIsClear()){
            rem.turnLeft();
            rem.move();
            rem.turnLeft();
            rem.turnLeft();
            rem.turnLeft();
        }
        
        // make rem find his way out of the rectangular room
        while(!rem.frontIsClear()){
            rem.turnLeft();
            if(rem.frontIsClear()){
                rem.move();
                rem.turnLeft();
                rem.turnLeft();
                rem.turnLeft();
            }
            // get rem out of the room
            if(rem.frontIsClear()){
                rem.move();
            }
        }
        
        
    }
}
