
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author awadb3223
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City kw = new City();

        //Create houdini
        RobotSE bob = new RobotSE(kw, 1, 1, Direction.EAST);

        //create cage cell
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);

        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);

        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);

        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);

        //create new algorithem for bob to escape
        while (bob.frontIsClear()){
            bob.move();
        }
        //if theres a wall
        while (!bob.frontIsClear()){
            bob.turnLeft();
            //code to check if theres an exit
            while (bob.frontIsClear()){
                bob.move();
                bob.turnRight();
                if(bob.frontIsClear()){
                    bob.move();
                    break;
                }
                bob.turnLeft();
            }
        }
    }
}