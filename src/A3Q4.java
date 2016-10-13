
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.RobotSE;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author macdt8987
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city
        City kw = new City();
        //Make a robot
        RobotSE karl = new RobotSE(kw, 0, 3, Direction.WEST);
        // Make the walls
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.EAST);
        // Make the robot go around the box 8 times
        if (karl.frontIsClear()) {


            for (int x = 0; x < 3; x = x + 1) {
                karl.move();

            }
        if(!karl.isBesideThing(IPredicate.aWall)){
            karl.turnLeft();
        }
        }
        if (karl.frontIsClear()) {


            for (int x = 0; x < 3; x = x + 1) {
                karl.move();

            }
        if(!karl.isBesideThing(IPredicate.aWall)){
            karl.turnLeft();
        }
        }
        if (karl.frontIsClear()) {


            for (int x = 0; x < 3; x = x + 1) {
                karl.move();

            }
        if(!karl.isBesideThing(IPredicate.aWall)){
            karl.turnLeft();
        }
        }
        if (karl.frontIsClear()) {


            for (int x = 0; x < 3; x = x + 1) {
                karl.move();

            }
        if(!karl.isBesideThing(IPredicate.aWall)){
            karl.turnLeft();
        }
        }
        if (karl.frontIsClear()) {


            for (int x = 0; x < 3; x = x + 1) {
                karl.move();

            }
        if(!karl.isBesideThing(IPredicate.aWall)){
            karl.turnLeft();
        }
        }
        if (karl.frontIsClear()) {


            for (int x = 0; x < 3; x = x + 1) {
                karl.move();

            }
        if(!karl.isBesideThing(IPredicate.aWall)){
            karl.turnLeft();
        }
        }
        if (karl.frontIsClear()) {


            for (int x = 0; x < 3; x = x + 1) {
                karl.move();

            }
        if(!karl.isBesideThing(IPredicate.aWall)){
            karl.turnLeft();
        }
        }
        if (karl.frontIsClear()) {


            for (int x = 0; x < 3; x = x + 1) {
                karl.move();

            }
        if(!karl.isBesideThing(IPredicate.aWall)){
            karl.turnLeft();
        }
        }

    }
}
