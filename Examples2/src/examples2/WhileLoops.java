package examples2;


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
 * @author baayl3669
 */
public class WhileLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        City af = new City();
        Robot Rem = new Robot(af,1,1,Direction.EAST);
        
        new Wall(af,1,5,Direction.EAST);
        new Thing(af,1,3);
        
        //while loop with no condition
        while(Rem.frontIsClear()){
            Rem.move();
            // check for something to pick up
            if(Rem.canPickThing()){
                // pick it up
                
                Rem.pickThing();
                
            }
        }
        // end of the loop
        // trn the robot around
        
        
        // go home Rem
        while (Rem.frontIsClear() == false){
              Rem.move();
              {
    
        }
        
        }
    }
    
}
