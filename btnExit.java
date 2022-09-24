import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class btnExit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class btnExit extends Actor
{
    /**
     * Act - do whatever the btnExit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
        public GreenfootSound backgroundMusic = new GreenfootSound("Sound menu 1.mp3");
        
    public void act()
    {
        // Add your action code here.
         MouseInfo mouse = Greenfoot.getMouseInfo();
        //Change Button.class to the name of your button class.
        if (mouse != null) {
            //change the file to what you want for when the mouse is not over the button.
            setImage("exit.png");
            List objects = getWorld().getObjectsAt(mouse.getX(), mouse.getY(), btnExit.class);
            for (Object object : objects)
            {
                if (object == this)
                {
                    //change the file to what you want for when the mouse is over the button.
                    setImage("exit hover.png");
                }
            }
        }

        if (Greenfoot.mouseClicked(this)){
            Menu.SoundStopper = 0;
            Menu.stopBGM();
            Greenfoot.stop();
            
        }
    }
}
