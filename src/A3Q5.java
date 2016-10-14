
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
 * @author David
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city and a robot
        City ok = new City ();
        ok.showThingCounts(true);
        Robot ben = new Robot (ok, 1,2, Direction. WEST);
        
        //create new things
        new Thing (ok, 1,2);
        new Thing (ok, 1,2);
        new Thing (ok, 1,2);
        new Thing (ok, 1,2);
        new Thing (ok, 1,2);
        new Thing (ok, 1,2);
        new Thing (ok, 1,2);
        new Thing (ok, 1,2);
        new Thing (ok, 1,2);
        new Thing (ok, 1,2);
        
        while (ben.canPickThing()){
            ben.pickThing();
            if(ben.frontIsClear()){
            ben.move();
            ben.putThing();
            ben.turnLeft();
            ben.turnLeft();
            ben.move();
            ben.turnLeft();
            ben.turnLeft();
            }
            if (!ben.canPickThing()){
                break;
            }
            
        }
        
        
        
        
    }
    }
    


    

