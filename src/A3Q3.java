
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;

/**
 * A3Q3 05/10'/2016
 *
 * @author micla1676
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Can use Scenario1.txt, Scenario.txt
        City room = new City("A3Q32.txt");


        //create robot
        Robot karel = new Robot(room, 3, 3, Direction.WEST);


        while (!karel.isBesideThing(IPredicate.aWall)) {
            if (!karel.isBesideThing(IPredicate.aWall)) {
                karel.move();
            }

            if (karel.isBesideThing(IPredicate.aWall)) {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                break;
            }
        }


        while (karel.isBesideThing(IPredicate.aWall)) {
            karel.turnLeft();

            //move if front is clear, turn left twice if not
            if (karel.frontIsClear()) {
                karel.move();

            } else {
                karel.turnLeft();
                karel.turnLeft();
            }

        }
        karel.turnLeft();
        karel.move();
    }
}
