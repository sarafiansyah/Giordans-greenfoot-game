import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bulletLeft here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bulletRightLV3 extends Actor
{
    /**
     * Act - do whatever the bulletRightLV3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public void act()
    {
        // Add your action code here
        setLocation(getX()+5, getY());
        if(getX()>=957){
            getWorld().removeObject(this);
        }
        
        
    }
    
}
