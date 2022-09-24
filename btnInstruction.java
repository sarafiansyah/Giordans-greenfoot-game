import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class btnInstruction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class btnInstruction extends Actor
{
    /**
     * Act - do whatever the btnInstruction wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null) {
        //change the file to what you want for when the mouse is not over the button.
        setImage("btn_instruction.png");
        List objects = getWorld().getObjectsAt(mouse.getX(), mouse.getY(), btnInstruction.class);
        for (Object object : objects)
        {
            if (object == this)
            {
                //change the file to what you want for when the mouse is over the button.
                setImage("btn_instruction hover.png");
            }
            }
        }

        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new menuOptionInstruction());
        }
    }
}
