
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**04/10/2016
 * A3Q1
 * 
 * @author micla1676
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Can use Scenario1.txt, Scenario.txt
        City Stop = new City("Scenario2.txt");
        
        //create robot
        Robot karel = new Robot (Stop,1,1,Direction.EAST);
        
       
        //loop while front is clear
        while(karel.frontIsClear()){
            //check if karel is standing on thing.
            if(!karel.canPickThing()){
               //karel moves forward
                karel.move();
            }
        }
        
        
        
        
    }
}
