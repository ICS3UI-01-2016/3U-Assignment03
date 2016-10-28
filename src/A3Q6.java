
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
 * @author gavra1870
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a city for the robot
        City aw = new City();
        Robot bob = new Robot(aw, 7, 8, Direction.SOUTH);
        //Create walls 
        new Wall(aw, 6, 7, Direction.EAST);
        new Wall(aw, 5, 7, Direction.EAST);
        new Wall(aw, 8, 7, Direction.EAST);
        new Wall(aw, 9, 7, Direction.EAST);
        new Wall(aw, 6, 7, Direction.SOUTH);
        new Wall(aw, 6, 6, Direction.SOUTH);
        new Wall(aw, 6, 6, Direction.WEST);
        new Wall(aw, 5, 6, Direction.WEST);
        new Wall(aw, 5, 6, Direction.NORTH);
        new Wall(aw, 5, 7, Direction.NORTH);
        new Wall(aw, 8, 7, Direction.NORTH);
        new Wall(aw, 8, 6, Direction.NORTH);
        new Wall(aw, 8, 6, Direction.WEST);
        new Wall(aw, 9, 6, Direction.WEST);
        new Wall(aw, 9, 6, Direction.SOUTH);
        new Wall(aw, 9, 7, Direction.SOUTH);
        new Wall(aw, 9, 9, Direction.SOUTH);
        new Wall(aw, 9, 10, Direction.SOUTH);
        new Wall(aw, 9, 10, Direction.EAST);
        new Wall(aw, 8, 10, Direction.NORTH);
        new Wall(aw, 8, 9, Direction.NORTH);
        new Wall(aw, 8, 10, Direction.EAST);
        new Wall(aw, 9, 9, Direction.WEST);
        new Wall(aw, 8, 9, Direction.WEST);
        new Wall(aw, 6, 9, Direction.WEST);
        new Wall(aw, 5, 9, Direction.WEST);
        new Wall(aw, 5, 9, Direction.NORTH);
        new Wall(aw, 5, 10, Direction.EAST);
        new Wall(aw, 5, 10, Direction.EAST);
        new Wall(aw, 5, 10, Direction.NORTH);
        new Wall(aw, 6, 10, Direction.EAST);
        new Wall(aw, 6, 10, Direction.SOUTH);
        new Wall(aw, 6, 9, Direction.SOUTH);



        //get the robot to move around the perimeter and repeat for the next three blocks
        for (int l = 0; l < 4; l = l + 1) {
        
            for (int i = 0; i < 3; i = i + 1) {
                bob.move();
                bob.move();
                bob.move();
                bob.turnLeft();

            }
            bob.move();
            bob.move();
            bob.move();

        }



    }
}
