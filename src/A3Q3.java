
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
 * @author messr2578
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //basic startup for a single robot
        City kw = new City();
        Robot karel = new Robot(kw, 1, 1, Direction.WEST);
        //create walls
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.EAST);

        new Wall(kw, 3, 4, Direction.EAST);



        while (true) {
            while (karel.frontIsClear()) {
                karel.move();
            }
            while (!karel.frontIsClear()) {
                karel.turnLeft();
                
                while (karel.frontIsClear()) {
                    karel.move();
                    {
                        karel.turnLeft();
                        karel.turnLeft();
                        karel.turnLeft();

                    }
                }
            }
        }
    }
}
