import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Female0 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Female0 extends Actor
{
    /**
     * Act - do whatever the Female0 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-5, getY());
        }
        else if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+5, getY());
        }
        else if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-5);
        }
        else if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+5);
        }
    }
}
