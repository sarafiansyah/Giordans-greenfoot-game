import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Male1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Male1 extends Actor
{
    /**
     * Act - do whatever the Male1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        setImage(new GreenfootImage("male0.png"));
        if(Greenfoot.isKeyDown("left")){
                        setImage(new GreenfootImage("female shoot1 hover.png"));
            setLocation(getX()-5, getY());


            
        }
        else if(Greenfoot.isKeyDown("right")){
                        setImage(new GreenfootImage("female shoot1.png"));
            setLocation(getX()+5, getY());

            

        }
        else if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-5);
            if (getY() <= 100 )  {
                setLocation(getX(), getY()+5); 
            }
        }
        else if(Greenfoot.isKeyDown("down")){

            setLocation(getX(), getY()+5);
            if (getY() >= 352 )  {
                setLocation(getX(), getY()-5);         
            }
        }
    }
}
