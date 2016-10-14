
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
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City ok = new City();
        Robot ben = new Robot (ok, 1,2, Direction. EAST);
        
        new Wall (ok, 1,2, Direction.NORTH);
        new Wall (ok, 1,5, Direction.NORTH);
        new Wall (ok, 1,3, Direction.NORTH);
        new Wall (ok, 1,4, Direction.NORTH);
        new Wall (ok, 1,2, Direction. WEST);
        new Wall (ok, 2,2, Direction. WEST);
        new Wall (ok, 3,2, Direction. WEST);
        new Wall (ok, 3,4, Direction. SOUTH);
        new Wall (ok, 3,5, Direction. SOUTH);
        new Wall (ok, 3,2, Direction. SOUTH);
        new Wall (ok, 3,3, Direction. SOUTH);
        new Wall (ok, 1,5, Direction. EAST);
        new Wall (ok, 2,5, Direction.EAST);
        new Wall (ok, 3,5, Direction. EAST);
        new Thing (ok, 1,3);
        new Thing (ok, 2,3);
        new Thing (ok, 3,2);
        new Thing (ok, 2,4);
        new Thing (ok, 2,5);
        new Thing (ok, 3,5);
        
        while (ben.frontIsClear()){
            ben.move();
            if (ben.canPickThing()){
                ben.pickThing();
            }
            if (!ben.frontIsClear() && ben.getDirection() == Direction.EAST){
                ben.turnLeft();
                ben.turnLeft();
            }
            if (!ben.frontIsClear() && ben.getDirection() == Direction.WEST){
                ben.turnLeft();
                if (ben.frontIsClear()){
                    ben.move();
                    ben.turnLeft();
                }
                while (!ben.frontIsClear()){
                    ben.turnLeft();
                    ben.turnLeft();
                    ben.move();
                    break;
                }

                        
                    }
                }

  
                        
                    } 
                
                
                    
                }

                        

                        


                    



                    


                    

                    



                    
                    

            
            
               
 
            
    





            
            
                
                
                
        
       
            
                
                

        
                 

                    
                    
            
        



    





                       
                    


            
    

    
        
    

        
        
        
    


        
        
        
        
        
        
        
    

