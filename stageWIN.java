import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class stageWIN extends World
{

    
    
    public mainShoot mainPlayer = new mainShoot();
       

    public stageWIN()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 512, 1);         
        act();

        prepare();
    }

    public void act()
    {
        

        btnPause btnPause = new btnPause();
        addObject(btnPause,94,35);
        mainShoot maleShoot = new mainShoot();
        addObject(mainPlayer,89,391);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {   

        //Enemy.hp = 500;
        
        titleCongratz titleCongratz = new titleCongratz();
        addObject(titleCongratz,513,220);
    }
}
