
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomlj9878
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City JT = new City();
        Robot mover = new Robot(JT,1,1,Direction.EAST);
        //create Things
        new Thing(JT,1,1,Direction.EAST);
        new Thing(JT,1,1,Direction.EAST);
        new Thing(JT,1,1,Direction.EAST);
        new Thing(JT,1,1,Direction.EAST);
        new Thing(JT,1,1,Direction.EAST);
        new Thing(JT,1,1,Direction.EAST);
        new Thing(JT,1,1,Direction.EAST);
        new Thing(JT,1,1,Direction.EAST);
        new Thing(JT,1,1,Direction.EAST);
        new Thing(JT,1,1,Direction.EAST);
        //pick and move things
        int count = 0;
        while(count<10){
            mover.pickThing();
            mover.move();
            mover.putThing();
            mover.turnLeft();
            mover.turnLeft();
            mover.move();
            mover.turnLeft();
            mover.turnLeft();
            //count it
            count = count + 1;
            mover.move();
        }
    }
}
