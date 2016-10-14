
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City nm = new City ();
        // create a robot
        Robot ben = new Robot (nm, 1,1, Direction. EAST);
        
        //create wall and thing
        new Wall (nm, 1,5, Direction. WEST);
        new Thing (nm, 1,3);
        new Thing (nm, 1,4);
        
        while (ben.frontIsClear()){
            ben.move ();
            if (!ben.frontIsClear()){
                break; 
                
            } else {
            while (ben.canPickThing()){
                ben.pickThing();
                break;
                
                
                
            }
            
                    
        
      
        
                
            }
            
           
     
            
        }
    }
}

         
        
        
        
        
        
       
    
    




