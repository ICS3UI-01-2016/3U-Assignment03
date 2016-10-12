
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
 * @author ANNt0773
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create new robot and city
        City kw = new City();
        Robot taylor = new Robot(kw, 0, 0, Direction.EAST);

        //create new things
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);

        //move robot to pick up things and put things down
        for (int move = 0; move < 10; move = move + 1) {
            
            taylor.pickThing();
            if (taylor.getDirection() != Direction.EAST) {
                taylor.turnLeft();
                taylor.turnLeft();

            }

            if (taylor.frontIsClear()) {
                taylor.move();
                taylor.putThing();
                if (move < 9) {
                    taylor.turnLeft();
                    taylor.turnLeft();
                    taylor.move();
                }


            }

        }
    }
    // TODO code application logic here
}
