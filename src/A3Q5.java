
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
 * @author bulka4927
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new city
        City mc = new City();
        //place robot
        Robot bul = new Robot(mc, 1, 1, Direction.EAST);

        //place the ten things
        new Thing(mc, 1, 1);
        new Thing(mc, 1, 1);
        new Thing(mc, 1, 1);
        new Thing(mc, 1, 1);
        new Thing(mc, 1, 1);
        new Thing(mc, 1, 1);
        new Thing(mc, 1, 1);
        new Thing(mc, 1, 1);
        new Thing(mc, 1, 1);
        new Thing(mc, 1, 1);

        //pick up things and place them 
        int count = 0;
        //go until there are 0 things left
        while (count > 10) 
            break;

            bul.pickThing();
            
            while (bul.frontIsClear()) {

                bul.move();


                //find where to put the things
                if (bul.getStreet() == 1 && bul.getAvenue() == 2) {
                    bul.putThing();
                    bul.turnLeft();
                    bul.turnLeft();
                    bul.move();

                }
                if (bul.getStreet() == 1 && bul.getAvenue() == 1) {
                    bul.pickThing();
                    bul.turnLeft();
                    bul.turnLeft();


                }

            }
        }
    }
