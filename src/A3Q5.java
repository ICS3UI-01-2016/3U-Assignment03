import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baayl
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City af = new City();
        // create a robot
        Robot rem = new Robot(af,1,1,Direction.EAST);
        
        new Thing(af,1,1);
        new Thing(af,1,1);
        new Thing(af,1,1);
        new Thing(af,1,1);
        new Thing(af,1,1);
        new Thing(af,1,1);
        new Thing(af,1,1);
        new Thing(af,1,1);
        new Thing(af,1,1);
        new Thing(af,1,1);
        
        // make rem pick thing and move it to (1,2) and loop 10 times
        int count = 0;
        while(count < 10){
            rem.pickThing();
            rem.move();
            rem.putThing();
            rem.turnLeft();
            rem.turnLeft();
            rem.move();
            rem.turnLeft();
            rem.turnLeft();
            count = count + 1;
        }
        // make rem move to be on top of Thing
        rem.move();
    }
    
}
