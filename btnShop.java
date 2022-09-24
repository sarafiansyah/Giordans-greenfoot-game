import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class btnShop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class btnShop extends Actor
{
    /**
     * Act - do whatever the btnShop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            //GreenfootSound sound = new GreenfootSound("sounds/click.wav");
            //sound.play();
            
            Greenfoot.setWorld(new stageShop1());
            
    

        }
          
          
    }
    //set animation
    
    

}
