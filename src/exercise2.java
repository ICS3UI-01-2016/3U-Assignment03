
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vandl4973
 */
public class exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //new city
        City kw = new City();
        //new robot
        Robot bob = new Robot(kw, 1, 1, Direction.EAST);
        //room that he is stuck in
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 5, Direction.SOUTH);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.EAST);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 3, 5, Direction.EAST);
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 2, 4);
        new Thing(kw, 2, 1);
        new Thing(kw, 2, 2);
        new Thing(kw, 3, 2);
        while (bob.frontIsClear()) {
            bob.move();
            if (bob.canPickThing()) {
                bob.pickThing();
            }
            if (!bob.frontIsClear() && bob.getDirection() == Direction.EAST) {
                bob.turnLeft();
                bob.turnLeft();
                bob.turnLeft();
                if (bob.frontIsClear()) {
                    bob.move();
                }else{
                    bob.turnLeft();
                    bob.turnLeft();
                    break;
                }
                bob.turnLeft();
                bob.turnLeft();
                bob.turnLeft();
            }
            if (!bob.frontIsClear() && bob.getDirection() == Direction.WEST) {

                bob.turnLeft();
                bob.move();
                bob.turnLeft();

            }

        }
        
        while (bob.frontIsClear()){
            bob.move();
       if (!bob.frontIsClear()){
           bob.turnLeft();
        if(bob.getAvenue()==1)
            break;
    }
}
    }
}
