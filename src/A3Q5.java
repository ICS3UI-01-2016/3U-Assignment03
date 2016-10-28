
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parry Katodia
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create city
         City kpl = new City();
 
         //create things
         new Thing(kpl, 1, 1);
         new Thing(kpl, 1, 1);
         new Thing(kpl, 1, 1);
         new Thing(kpl, 1, 1);
         new Thing(kpl, 1, 1);
         new Thing(kpl, 1, 1);
         new Thing(kpl, 1, 1);
         new Thing(kpl, 1, 1);
         new Thing(kpl, 1, 1);
         new Thing(kpl, 1, 1);
 
         //create a robot
         RobotSE obama = new RobotSE(kpl,1,1, Direction.EAST);
 
         //make obama pick up things and drop things from one place to another
         int count = 0;
 
         while (count < 10) {
             obama.pickThing();
             obama.move();
             obama.putThing();
             obama.turnAround();
             obama.move();
             obama.turnAround();
             count = count + 1;
         }
         obama.move();
    }  
}
