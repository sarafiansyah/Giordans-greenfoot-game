import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stage2DialogFemale here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage2DialogFemale extends World
{
    public GreenfootSound music = new GreenfootSound("Stage-2_DrippingWater.mp3");
    
    /**
     * Constructor for objects of class Stage2DialogFemale.
     * 
     */
    public Stage2DialogFemale()
    {    
                // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 512, 1); 

music.playLoop();
        prepare();
    }
    private void prepare()
    {

        Female0 female0 = new Female0();
        addObject(female0,154,295);
        npc0 npc0 = new npc0();
        addObject(npc0,801,280);
        TextNpc textNpc = new TextNpc();
        addObject(textNpc,478,249);
        Text1 text1 = new Text1("Halo! main Yuk :)", 24);
        addObject(text1,154,380);

        female0.setLocation(154,295);
        textNpc.setLocation(478,249);
        text1.setLocation(186,364);

        npc0.setLocation(801,280);
        Text1 text12 = new Text1("PENNY", 24);
        addObject(text12,706,316);
        btnStage2 btnStage2 = new btnStage2();
        addObject(btnStage2,854,453);
    }
}
