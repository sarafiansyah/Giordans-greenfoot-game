import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class btnTryAgain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class btnTryAgain extends Actor
{
    /**
     * Act - do whatever the btnTryAgain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        //Change Button.class to the name of your button class.
        if (mouse != null) {
            //change the file to what you want for when the mouse is not over the button.
            setImage("try_again_1.png");
            List objects = getWorld().getObjectsAt(mouse.getX(), mouse.getY(), btnStart.class);
            for (Object object : objects)
            {
                if (object == this)
                {
                    //change the file to what you want for when the mouse is over the button.
                    setImage("try_again_2.png");
                }
            }
        }

        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new menuCharacter());
    

        }
    }
}
