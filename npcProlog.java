import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class npcProlog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class npcProlog extends Actor
{
    /**
     * Act - do whatever the npcProlog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.


            setLocation(getX(), getY()-5);
            if (getY() <= 300)  {
                setLocation(getX(), getY()+5); 
            }
        
        
        
    }
    

}

