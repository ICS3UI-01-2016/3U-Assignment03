
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city and a robot
        City ok = new City();
        Robot ben = new Robot (ok, 3,3, Direction. SOUTH);
        
        //create the blocks
        //block 1
        new Wall (ok, 4,4, Direction. NORTH);
        new Wall (ok, 4,5, Direction. NORTH);
        new Wall (ok, 4,4, Direction. WEST);
        new Wall (ok, 5,4, Direction. WEST);
        new Wall (ok, 4,5, Direction. EAST);
        new Wall (ok, 5,5, Direction.EAST);
        new Wall (ok, 5,5, Direction. SOUTH);
        new Wall (ok, 5,4, Direction. SOUTH);
        //block 2
        new Wall (ok, 4,1, Direction. NORTH);
        new Wall (ok, 4,2, Direction. NORTH);
        new Wall (ok, 4,1, Direction. WEST);
        new Wall (ok, 5,1, Direction. WEST);
        new Wall (ok, 4,2, Direction. EAST);
        new Wall (ok, 5,2, Direction.EAST);
        new Wall (ok, 5,1, Direction. SOUTH);
        new Wall (ok, 5,2, Direction. SOUTH);
        //block 3
         new Wall (ok, 1,1, Direction. NORTH);
        new Wall (ok, 1,2, Direction. NORTH);
        new Wall (ok, 1,1, Direction. WEST);
        new Wall (ok, 2,1, Direction. WEST);
        new Wall (ok, 1,2, Direction. EAST);
        new Wall (ok, 2,2, Direction.EAST);
        new Wall (ok, 2,1, Direction. SOUTH);
        new Wall (ok, 2,2, Direction. SOUTH);
        //block 4
        new Wall (ok, 1,4, Direction. NORTH);
        new Wall (ok, 1,5, Direction. NORTH);
        new Wall (ok, 1,4, Direction. WEST);
        new Wall (ok, 2,4, Direction. WEST);
        new Wall (ok, 1,5, Direction. EAST);
        new Wall (ok, 2,5, Direction.EAST);
        new Wall (ok, 2,5, Direction. SOUTH);
        new Wall (ok, 2,4, Direction. SOUTH);
        
        //move the robot around the blocks
        for (int a = 0; a < 4; a = a + 1) {
        
            for(int i = 0; i < 3; i = i + 1){
            ben.move();
            ben.move();
            ben.move();
            ben.turnLeft();
            
            }
            ben.move();
            ben.move();
            ben.move();
            
            

            


            }
    }
}

    

                
            
           
            
            
        
        
        
      
            

            
            
        

 
                
                
                
            
        
        
                   
               
 


                
            


                
            
    



            
            
        
        
        
        
        
        
        
        
        
        
    
   

