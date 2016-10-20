
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
 * @author woodc9217
 */
public class a3q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new city
        City mtl = new City();
        //create a robot
        Robot candice = new Robot(mtl, 0, 2, Direction.WEST);
        //create walls
        new Wall(mtl, 1, 1, Direction.WEST);
        new Wall(mtl, 2, 1, Direction.WEST);
        new Wall(mtl, 2, 1, Direction.SOUTH);
        new Wall(mtl, 2, 2, Direction.SOUTH);
        new Wall(mtl, 2, 2, Direction.EAST);
        new Wall(mtl, 1, 2, Direction.EAST);
        new Wall(mtl, 1, 1, Direction.NORTH);
        new Wall(mtl, 1, 2, Direction.NORTH);
        //create a loop
        //get robot to check for wal on left
        candice.turnLeft();
        while(!candice.frontIsClear())
        {
            candice.turnLeft();
            candice.turnLeft();
            candice.turnLeft();
            candice.move();
            candice.move();
            while(candice.frontIsClear())
            {
                candice.turnLeft();
                candice.move();
                if(candice.frontIsClear())
                {
                    candice.move();
                    candice.move();
                }
                
            }
            
        }
        /*while(1==1)
        {
            
        if(!candice.frontIsClear())
        {
            candice.turnLeft();
            candice.turnLeft();
            candice.turnLeft();
            if(candice.frontIsClear())
            {
                candice.move();
                candice.move();
                while(candice.frontIsClear())
                {
                    candice.turnLeft();
                }
                while(candice.frontIsClear())
                {
                candice.move();
                }
            }
        }
                /*
            
            */
        }
    }

