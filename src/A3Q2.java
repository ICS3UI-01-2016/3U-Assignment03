
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 * 04/10/2016 A3Q1
 *
 * @author micla1676
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city
        City room = new City();

        //create robot
        Robot karel = new Robot(room, 1, 1, Direction.EAST);

        //create "room"
        new Wall(room, 1, 1, Direction.WEST);
        new Wall(room, 1, 1, Direction.NORTH);
        new Wall(room, 1, 2, Direction.NORTH);
        new Wall(room, 1, 3, Direction.NORTH);
        new Wall(room, 1, 4, Direction.EAST);
        new Wall(room, 1, 4, Direction.NORTH);
        new Wall(room, 2, 4, Direction.EAST);
        new Wall(room, 3, 4, Direction.EAST);
        new Wall(room, 3, 4, Direction.SOUTH);
        new Wall(room, 2, 1, Direction.WEST);
        new Wall(room, 3, 1, Direction.WEST);
        new Wall(room, 3, 1, Direction.SOUTH);
        new Wall(room, 3, 2, Direction.SOUTH);
        new Wall(room, 3, 3, Direction.SOUTH);


        //create things
        new Thing(room, 1, 2);
        new Thing(room, 1, 2);
        new Thing(room, 1, 2);
        new Thing(room, 2, 2);
        new Thing(room, 2, 3);
        new Thing(room, 2, 3);
        new Thing(room, 2, 4);
        new Thing(room, 3, 1);
        new Thing(room, 3, 4);
        new Thing(room, 3, 2);
        new Thing(room, 3, 3);

        //create variable to track ammount of turns
        int turn = 0;
        //move karel
        karel.move();
        
        //while karel  is not on (1,1) loop.
        while (karel.getAvenue() != 1 || karel.getStreet() != 1) {
            //if karel can pick thing, pick thing
            if (karel.canPickThing()) {
                karel.pickThing();
            }
            /*if karel's front is not clear, and turn count is less then 1
             *then make a u-turn*/     
            else if (!karel.frontIsClear() && turn < 1) {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                turn = turn + 1;
            } 
            /*if karel's front is not clear, and turn count is less then 2
             *then make a u-turn*/ 
            else if (!karel.frontIsClear() && turn < 2) {
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                turn = turn + 1;
            } 
            /*if karel's front is not clear, and turn count is less then 4
             *then make a u-turn*/ 
            else if (!karel.frontIsClear() && turn < 4) {
                karel.turnLeft();
                karel.move();
                turn = turn + 1;
            } 
            // if all of the above terms are false, then move forward
            else {
                karel.move();
            }


        }


    }
}
