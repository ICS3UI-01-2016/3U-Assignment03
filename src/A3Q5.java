
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 * A3Q5 07/10/2016
 *
 * @author micla1676
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city
        City Factory = new City();

        //Create Robot
        Robot LoaderBot = new Robot(Factory, 1, 1, Direction.EAST);

        //create things
        new Thing(Factory, 1, 1);
        new Thing(Factory, 1, 1);
        new Thing(Factory, 1, 1);
        new Thing(Factory, 1, 1);
        new Thing(Factory, 1, 1);
        new Thing(Factory, 1, 1);
        new Thing(Factory, 1, 1);
        new Thing(Factory, 1, 1);
        new Thing(Factory, 1, 1);
        new Thing(Factory, 1, 1);
        
        
        //create a loop that loops 10 times
        for(int x = 0; x < 10; x = x + 1){
            //pick thing and move forward, then put it down
            LoaderBot.pickThing();
            LoaderBot.move();
            LoaderBot.putThing();
            //turna round, move, then turn around again.
            LoaderBot.turnLeft();
            LoaderBot.turnLeft();
            LoaderBot.move();
            LoaderBot.turnLeft();
            LoaderBot.turnLeft();
            
        }
       //LoaderBot moves forward
        LoaderBot.move();
    }
}
