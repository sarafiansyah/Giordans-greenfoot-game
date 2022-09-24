import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Unmuted here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Unmuted extends Actor
{
    /**
     * Act - do whatever the Unmuted wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         if (Greenfoot.mouseClicked(this)){
               Menu.playBGM = true;
               
               getWorld().removeObject(this);
            }
    }
}
