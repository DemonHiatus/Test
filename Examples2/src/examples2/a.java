package examples2;


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baayl3669
 */
public class a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for the robot
        City kw = new City();
        // Creat a Robot
        Robot Rem = new Robot(kw,3,4,Direction.EAST);
        Robot Ram = new Robot(kw,2,7,Direction.WEST);
       
        // get Rem to move        
        Rem.move();
        Rem.turnLeft();
        
        // get Ram to move
        Ram.move();
        Ram.turnLeft();
        
        // create a variable to 
    }
}
