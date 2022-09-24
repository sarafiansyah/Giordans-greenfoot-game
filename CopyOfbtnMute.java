import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class CopyOfbtnMute here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CopyOfbtnMute extends Actor
{
    /**
     * Act - do whatever the CopyOfbtnMute wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound bgMusic = new GreenfootSound("Sound menu 1.mp3");
    
    boolean firstTurn= true;
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        //Change Button.class to the name of your button class.
        
            if (firstTurn){
                 bgMusic.stop();
                 firstTurn = false;
            }

            if (Greenfoot.mouseClicked(this)){
                if (bgMusic.isPlaying())
                {
                bgMusic.pause();
                setImage("muted1.png");
                
            }
            else {
            bgMusic.playLoop();
            setImage("unmuted 1.png");
            }
        }
    }
}
