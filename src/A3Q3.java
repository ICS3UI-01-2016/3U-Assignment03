
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
 * @author keyew7019
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create city for robot
        City kw = new City();
        //create a robot
        Robot rick = new Robot(kw, 3, 0, Direction.EAST);

        //create walls
        new Wall(kw, 0, 0, Direction.NORTH);
        new Wall(kw, 0, 1, Direction.NORTH);
        new Wall(kw, 0, 2, Direction.NORTH);
        new Wall(kw, 0, 3, Direction.NORTH);
        new Wall(kw, 0, 0, Direction.WEST);
        new Wall(kw, 1, 0, Direction.WEST);
        new Wall(kw, 2, 0, Direction.WEST);
        new Wall(kw, 3, 0, Direction.WEST);
        new Wall(kw, 3, 0, Direction.SOUTH);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.EAST);
        new Wall(kw, 1, 3, Direction.EAST);
        new Wall(kw, 0, 3, Direction.EAST);

        //create loop
        while (rick.frontIsClear()) {
            rick.move();

            if (rick.frontIsClear()) {
            } else {
                rick.turnLeft();
            }

            //check if rick is beside an opening
            if (rick.isBesideThing(IPredicate.aWall)) {
            } else {
                rick.turnLeft();
                rick.turnLeft();
                rick.turnLeft();
                rick.move();
                break;
            }
        }
    }
}
