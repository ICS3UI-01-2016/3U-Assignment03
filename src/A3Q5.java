
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
 * @author shieg0688
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create city 
        City trapistan = new City();
        //things
        new Thing (trapistan,1,1);
        new Thing (trapistan,1,1);
        new Thing (trapistan,1,1);
        new Thing (trapistan,1,1);
        new Thing (trapistan,1,1);
        new Thing (trapistan,1,1);
        new Thing (trapistan,1,1);
        new Thing (trapistan,1,1);
        new Thing (trapistan,1,1);
        new Thing (trapistan,1,1);
        //create shift bot
        Robot shifter = new Robot(trapistan,1,1,Direction.EAST);
        //shift things
        
        while(shifter.getAvenue()==1){
            shifter.pickThing();
            while(shifter.getAvenue() <4){
                shifter.move();
                if(shifter.getAvenue() ==4){
                    shifter.putThing();
                    shifter.turnLeft();
                    shifter.turnLeft();
                    while(shifter.getAvenue() >1){
                        shifter.move();
                        if(shifter.getAvenue() ==1){
                            if(!shifter.canPickThing()){
                                break;
                            }
                            shifter.pickThing();
                            shifter.turnLeft();
                            shifter.turnLeft();
                            }
         
                        }
                    }
                    
                }
            }
            
        }
        
    }
        
    
    

