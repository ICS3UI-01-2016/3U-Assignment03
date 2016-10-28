
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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // create city
         City kpl = new City();
         
         // create walls
         new Wall(kpl,1,1,Direction.NORTH);
         new Wall(kpl,1,2,Direction.NORTH);
         new Wall(kpl,1,1,Direction.WEST);
         new Wall(kpl,2,1,Direction.WEST);
         new Wall(kpl,2,1,Direction.SOUTH);
         new Wall(kpl,2,2,Direction.SOUTH);
         new Wall(kpl,1,2,Direction.EAST);
         new Wall(kpl,2,2,Direction.EAST);
         
         // make a robot
         RobotSE obama = new RobotSE (kpl,0,2,Direction.WEST);        
         
         // get robot to move around the box 8 times 
         int loop = 0;
         
         while(loop <8){
         obama.move();
         obama.move();
         obama.turnLeft();
         obama.move();
         
         loop = loop + 1;
         }    
    }
}
