
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
 * @author lawd8918
 */
public class A3q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City kw = new City();
        //create robot
        Robot dave = new Robot(kw, 1, 1, Direction.EAST);
        //create walls
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 1, Direction.SOUTH);
        //create things
        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 4);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 4);

        //make robot move to pick things
        int count = 0;
        while (count < 1) {
            while (dave.getStreet() == 1 && count < 1) {
                dave.turnLeft();
                dave.turnLeft();
                dave.turnLeft();
                if (dave.canPickThing()) {
                    dave.pickThing();
                }
                if (dave.frontIsClear()) {
                    while (dave.frontIsClear()) {
                        dave.move();
                        if (dave.canPickThing()) {
                            dave.pickThing();

                        }
                    }
                }
                dave.turnLeft();
                dave.turnLeft();
                //boolean stop = false;
                while (dave.getStreet() > 1 && count < 1) {
                    dave.move();
                    if (dave.getStreet() == 1) {
                        dave.turnLeft();
                        dave.turnLeft();
                        dave.turnLeft();
                        //return to start
                        if (!dave.frontIsClear()) {
                            dave.turnLeft();
                            dave.turnLeft();
                            while (dave.frontIsClear() && count < 1) {
                                dave.move();
                                if (dave.getAvenue() == 1) {
                                    dave.turnLeft();
                                    dave.turnLeft();
                                    count = count + 1;
                                }
                            }
                        } else {
                            dave.move();
                        }
                    }

                }


            }
        }
    }
}