import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class btnStage1Female here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class btnStage1Female extends Actor
{
    /**
     * Act - do whatever the btnStage1Female wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            ((PrologDialogFemale)getWorld()).music.stop();
            Greenfoot.setWorld(new stage1());

        }
    }
}
