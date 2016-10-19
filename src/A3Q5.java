
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
 * @author vandl4973
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //new city
        City kw = new City();
        // hauler
        Robot hauler=new Robot(kw,3,3,Direction.EAST);
        //things to haul
        new Thing(kw,3,3);
        new Thing(kw,3,3);
        new Thing(kw,3,3);
        new Thing(kw,3,3);
        new Thing(kw,3,3);
        new Thing(kw,3,3);
        new Thing(kw,3,3);
        new Thing(kw,3,3);
        new Thing(kw,3,3);
        new Thing(kw,3,3);
        //
        int count = 0;
        while (count<10){
            hauler.pickThing();
            hauler.move();
            hauler.putThing();
            hauler.turnLeft();
            hauler.turnLeft();
            
            hauler.move();
            hauler.turnLeft();
            hauler.turnLeft();
           
            count=count+1;
           
        }
        hauler.move();
    }
    }

