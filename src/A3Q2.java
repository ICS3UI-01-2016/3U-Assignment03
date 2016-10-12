
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bulka4927
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new city
        City mc = new City();
        //place robot
        Robot bul = new Robot(mc, 0, 0, Direction.EAST);

        // TODO code application logic here

        //create wall
        new Wall(mc, 0, 0, Direction.NORTH);
        new Wall(mc, 0, 1, Direction.NORTH);
        new Wall(mc, 0, 2, Direction.NORTH);
        new Wall(mc, 0, 3, Direction.NORTH);

        new Wall(mc, 0, 3, Direction.EAST);
        new Wall(mc, 1, 3, Direction.EAST);
        new Wall(mc, 2, 3, Direction.EAST);

        new Wall(mc, 2, 3, Direction.SOUTH);
        new Wall(mc, 2, 2, Direction.SOUTH);
        new Wall(mc, 2, 1, Direction.SOUTH);
        new Wall(mc, 2, 0, Direction.SOUTH);

        new Wall(mc, 0, 0, Direction.WEST);
        new Wall(mc, 1, 0, Direction.WEST);
        new Wall(mc, 2, 0, Direction.WEST);

        //create things
        new Thing(mc, 0, 1);
        new Thing(mc, 1, 1);
        new Thing(mc, 1, 2);
        new Thing(mc, 1, 3);
        new Thing(mc, 2, 3);
        new Thing(mc, 2, 0);

        //street sweeper
        while (bul.frontIsClear()) {
            bul.move();
            bul.pickThing();
            bul.turnLeft();
            bul.turnLeft();
            bul.turnLeft();
            bul.move();
            bul.pickThing();
            bul.turnLeft();
            bul.move();
            bul.pickThing();
            bul.move();
            bul.pickThing();
            if (!bul.frontIsClear()) {
                bul.turnLeft();
                bul.turnLeft();
                bul.turnLeft();
                bul.move();
                bul.pickThing();

                if (!bul.frontIsClear()) {
                    bul.turnLeft();
                    bul.turnLeft();
                    bul.turnLeft();
                    bul.move();
                    bul.move();
                    bul.move();
                    bul.pickThing();
                    bul.turnLeft();
                    bul.turnLeft();
                    bul.turnLeft();

                    if (bul.getDirection() == Direction.NORTH) {
                        bul.move();
                        bul.move();

                        if (bul.getStreet() == 0 && bul.getAvenue() == 0) {
                            bul.turnLeft();
                            bul.turnLeft();
                            bul.turnLeft();
                            break;
                        }


                    }
                }



            }


        }
    }
}
