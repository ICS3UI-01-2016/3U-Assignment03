
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
 * @author keyew7019
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create city for robot
        City kw = new City();
        //create a robot
        Robot rick = new Robot(kw, 1, 1, Direction.EAST);

        //create 10 Things
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        
        //create loop to move Things
        //create a counter variable
        int count = 1;
        //loop 10 times
        while (count < 11) {
            rick.pickThing();
            rick.move();
            rick.putThing();
            rick.turnLeft();
            rick.turnLeft();
            rick.move();
            rick.turnLeft();
            rick.turnLeft();
            //count 1 step
            count = count + 1;
            //counting using a for loop
            for (int i = 1; i < 11; i = i + 1) {
        if(rick.canPickThing()){
        }else{
            rick.move();
        }
        
    }
}
    }
}
