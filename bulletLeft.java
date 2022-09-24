import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bulletRight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bulletLeft extends Actor
{
    /**
     * Act - do whatever the bulletRight wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
   
    public void act()
    {
        // Add your action code here
        setLocation(getX()-5, getY());
        if(getX()<=3){
            getWorld().removeObject(this);
        }
        
        
  
    }
}