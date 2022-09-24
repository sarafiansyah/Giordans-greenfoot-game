import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PrologDialog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrologDialogMale extends World
{

    /**
     * Constructor for objects of class PrologDialog.
     * 
     */
    
    public GreenfootSound music = new GreenfootSound("Sound In Game.mp3");
    
    public PrologDialogMale()
    {    
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 512, 1); 

music.playLoop();
        prepare();
    }

    private void prepare()
    {

        Male0 male0 = new Male0();
        addObject(male0,154,295);
        npc0 npc0 = new npc0();
        addObject(npc0,801,280);
        TextNpc textNpc = new TextNpc();
        addObject(textNpc,478,249);

        male0.setLocation(154,295);
        textNpc.setLocation(478,249);
        

        npc0.setLocation(801,280);
        
        
        btnStage1Male btnStage1 = new btnStage1Male();
        addObject(btnStage1,854,453);
    }

}
