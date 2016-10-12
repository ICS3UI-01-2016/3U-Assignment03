
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
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City JT = new City();
        Robot spinner = new Robot(JT,3,3,Direction.SOUTH);
        new Wall(JT,1,1,Direction.NORTH);
        new Wall(JT,1,1,Direction.WEST);
        new Wall(JT,1,2,Direction.NORTH);
        new Wall(JT,1,2,Direction.EAST);
        new Wall(JT,2,2,Direction.EAST);
        new Wall(JT,2,2,Direction.SOUTH);
        new Wall(JT,2,1,Direction.SOUTH);
        new Wall(JT,2,1,Direction.WEST);
        new Wall(JT,1,4,Direction.NORTH);
        new Wall(JT,1,4,Direction.WEST);
        new Wall(JT,1,5,Direction.NORTH);
        new Wall(JT,1,5,Direction.EAST);
        new Wall(JT,2,5,Direction.EAST);
        new Wall(JT,2,4,Direction.SOUTH);
        new Wall(JT,2,5,Direction.SOUTH);
        new Wall(JT,2,4,Direction.WEST);
        new Wall(JT,4,1,Direction.NORTH);
        new Wall(JT,4,1,Direction.WEST);
        new Wall(JT,4,2,Direction.NORTH);
        new Wall(JT,4,2,Direction.EAST);
        new Wall(JT,5,2,Direction.EAST);
        new Wall(JT,5,1,Direction.SOUTH);
        new Wall(JT,5,2,Direction.SOUTH);
        new Wall(JT,5,1,Direction.WEST);
        new Wall(JT,4,4,Direction.NORTH);
        new Wall(JT,4,4,Direction.WEST);
        new Wall(JT,4,5,Direction.NORTH);
        new Wall(JT,4,5,Direction.EAST);
        new Wall(JT,5,5,Direction.EAST);
        new Wall(JT,5,4,Direction.SOUTH);
        new Wall(JT,5,5,Direction.SOUTH);
        new Wall(JT,5,4,Direction.WEST);
        //move robot around the walls
        int count = 0;
        while(count<4){
            spinner.move();
            spinner.move();
            spinner.move();
            spinner.turnLeft();
            spinner.move();
            spinner.move();
            spinner.move();
            spinner.turnLeft();
            spinner.move();
            spinner.move();
            spinner.move();
            spinner.turnLeft();
            spinner.move();
            spinner.move();
            spinner.move();
            //count it
            count = count + 1;
  }          
 }
}