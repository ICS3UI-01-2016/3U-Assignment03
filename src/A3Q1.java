
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;
import becker.robots.Thing;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bulka4927
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new city
        City ab = new City();
        //create robot
        Robot bul = new Robot(ab, 0, 0, Direction.EAST);

        // TODO code application logic here

        //create wall
        new Wall(ab, 0, 4, Direction.EAST);

        //create things
        new Thing(ab, 0, 5);
        
        
        while(bul.frontIsClear()){
            bul.move();
             while(!bul.frontIsClear()){
                 break;
        }

   
}



    }
}
