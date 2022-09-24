import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemyBulletLeft here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemyBulletLeft extends Actor
{
    /**
     * Act - do whatever the enemyBulletLeft wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        // Add your action code here.
        setLocation(getX()-2, getY());
        hapus();
        
        
        
    }
    public void hapus(){
    if(getX()<=3){
        getWorld().removeObject(this);
    }
    }
}