
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parry Katodia
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city 
         City kpl = new City();
 
         // make walls
         new Wall(kpl, 1, 1,Direction.NORTH);
         new Wall(kpl, 1, 2,Direction.NORTH);
         new Wall(kpl, 1, 2,Direction.EAST);
         new Wall(kpl, 2, 2,Direction.EAST);
         new Wall(kpl, 2, 2,Direction.SOUTH);
         new Wall(kpl, 2, 1,Direction.SOUTH);
         new Wall(kpl, 2, 1,Direction.WEST);
         new Wall(kpl, 1, 1,Direction.WEST);
         new Wall(kpl, 1, 4,Direction.NORTH);
         new Wall(kpl, 1, 5,Direction.NORTH);
         new Wall(kpl, 1, 5,Direction.EAST);
         new Wall(kpl, 2, 5,Direction.EAST);
         new Wall(kpl, 2, 5,Direction.SOUTH);
         new Wall(kpl, 2, 4,Direction.SOUTH);
         new Wall(kpl, 2, 4,Direction.WEST);
         new Wall(kpl, 1, 4,Direction.WEST);
         new Wall(kpl, 4, 4,Direction.NORTH);
         new Wall(kpl, 4, 5,Direction.NORTH);
         new Wall(kpl, 4, 5,Direction.EAST);
         new Wall(kpl, 5, 5,Direction.EAST);
         new Wall(kpl, 5, 5,Direction.SOUTH);
         new Wall(kpl, 5, 4,Direction.SOUTH);
         new Wall(kpl, 5, 4,Direction.WEST);
         new Wall(kpl, 4, 4,Direction.WEST);
         new Wall(kpl, 4, 1,Direction.NORTH);
         new Wall(kpl, 4, 2,Direction.NORTH);
         new Wall(kpl, 4, 2,Direction.EAST);
         new Wall(kpl, 5, 2,Direction.EAST);
         new Wall(kpl, 5, 2,Direction.SOUTH);
         new Wall(kpl, 5, 1,Direction.SOUTH);
         new Wall(kpl, 5, 1,Direction.WEST);
         new Wall(kpl, 4, 1,Direction.WEST);
 
         //create robot
         RobotSE obama = new RobotSE(kpl,3,3,Direction.SOUTH);
         
         // create an algorithm to move obama around 4 blocks 
          int count = 0;
          while (count < 4) {
             count = count + 1;
 
             int moves = 0;
             while (moves < 4) {
                 obama.move();
                 obama.move();
                 obama.move();
                 if (moves < 3) {
                     obama.turnLeft();
                 }
                 moves = moves + 1;
             }
         }
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
    }  
}
