
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
 * @author woodc9217
 */
public class a3q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new city
        City mtl = new City();
        //create a robot
        Robot candice = new Robot(mtl, 1, 1, Direction.EAST);
        //create walls
        new Wall(mtl, 1, 1, Direction.WEST);
        new Wall(mtl, 2, 1, Direction.WEST);
        new Wall(mtl, 3, 1, Direction.WEST);
        new Wall(mtl, 3, 1, Direction.SOUTH);
        new Wall(mtl, 3, 2, Direction.SOUTH);
        new Wall(mtl, 3, 3, Direction.SOUTH);
        new Wall(mtl, 3, 4, Direction.SOUTH);
        new Wall(mtl, 3, 4, Direction.EAST);
        new Wall(mtl, 2, 4, Direction.EAST);
        new Wall(mtl, 1, 4, Direction.EAST);
        new Wall(mtl, 1, 1, Direction.NORTH);
        new Wall(mtl, 1, 2, Direction.NORTH);
        new Wall(mtl, 1, 3, Direction.NORTH);
        new Wall(mtl, 1, 4, Direction.NORTH);
        //create litter(things)
        new Thing(mtl, 1, 2);
        new Thing(mtl, 2, 3);
        new Thing(mtl, 2, 2);
        new Thing(mtl, 2, 4);
        new Thing(mtl, 3, 1);
        new Thing(mtl, 3, 4);
        //make loop never ending
        while (1 == 1) {
            //move forward picking up things
            while (candice.frontIsClear()) {
                if (candice.canPickThing()) {
                    candice.pickThing();
                }
                candice.move();
                //make sure candice keeps picking up things
                if (candice.canPickThing()) {
                    candice.pickThing();

                }

            }
            //turn around
            candice.turnLeft();
            candice.turnLeft();
            //move forward until hits wall
            while (candice.frontIsClear()) {
                candice.move();
            }

            candice.turnLeft();

            //when reaches wall
            if (!candice.frontIsClear()) {
                candice.turnLeft();
                candice.turnLeft();
                while (candice.frontIsClear()) {
                    candice.move();
                }
                break;
            }
            candice.move();
            candice.turnLeft();

        }

    }
}
