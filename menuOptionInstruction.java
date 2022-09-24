import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menuOptionInstruction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menuOptionInstruction extends menuOption
{

    /**
     * Constructor for objects of class menuOptionInstruction.
     * 
     */
    public menuOptionInstruction()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        prepare();
    }
    
    private void prepare()
    {
        btnBack btnBack = new btnBack();
        addObject(btnBack,135,44);
        instruction Instruction = new instruction();
        addObject(Instruction,480,260);
    }
}
