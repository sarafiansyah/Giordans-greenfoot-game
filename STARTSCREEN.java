import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Opener here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class STARTSCREEN extends World
{

    /**
     * Constructor for objects of class Opener.
     * 
     */
    public STARTSCREEN()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 512, 1); 
        prepare();
    }

    public void act(){

        Greenfoot.setWorld(new Menu());

    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
