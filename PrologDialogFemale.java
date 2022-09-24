import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PrologDialog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrologDialogFemale extends World
{

    /**
     * Constructor for objects of class PrologDialog.
     * 
     */
    public GreenfootSound music = new GreenfootSound("Sound In Game.mp3");
    public PrologDialogFemale()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 512, 1); 
        music.playLoop();
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        npc0 npc0 = new npc0();
        addObject(npc0,801,280);
        Female0 female0 = new Female0();
        addObject(female0,300,265);
        TextNpc textNpc = new TextNpc();
        addObject(textNpc,477,257);
        Text1 text1 = new Text1("Halo! main Yuk :)", 24);
        addObject(text1,154,380);
        
        Text1 text12 = new Text1("PENNY", 24);
        addObject(text12,706,316);
        btnStage1Female btnStage1 = new btnStage1Female();
        addObject(btnStage1,854,453);
    }
}
