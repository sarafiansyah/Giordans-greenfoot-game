import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class btnMute here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class btnMute extends Actor
{
    /**
     * Act - do whatever the btnMute wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //GreenfootSound bgMusic = new GreenfootSound("Sound menu 1.mp3");
    
    //boolean firstTurn= true;
    public void act()
    {
        
            if (Greenfoot.mouseClicked(this)){
                Menu.playBGM = false;
                getWorld().addObject(new Unmuted(), 910,474);
          
        }
    }
}
