
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
 * @author tomlj9878
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City JT = new City();
        Robot dizzy = new Robot(JT,1,2,Direction.EAST);
        //create walls
        new Wall(JT,2,3,Direction.NORTH);
        new Wall(JT,2,3,Direction.WEST);
        new Wall(JT,2,4,Direction.NORTH);
        new Wall(JT,2,4,Direction.EAST);
        new Wall(JT,3,4,Direction.EAST);
        new Wall(JT,3,4,Direction.SOUTH);
        new Wall(JT,3,3,Direction.SOUTH);
        new Wall(JT,3,3,Direction.WEST);
        //move robot
        int count = 0;
        //loop 8 times
        while(count<8){
            dizzy.move();
            dizzy.move();
            dizzy.move();
            dizzy.turnLeft();
            dizzy.turnLeft();
            dizzy.turnLeft();
            //count it
            count = count + 1;
    }
}   
}
