import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class coin_END here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class coin_s1 extends Actor
{
    /**
     * Act - do whatever the coin_END wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int pause=3, num=1;    
    private int idleNum=0;
    private GreenfootImage[] idleImages = new GreenfootImage[5];
    public void addedToWorld(World Stage1)
    {
        for(int i=1; i<idleImages.length; i++){
            idleImages[i] = new GreenfootImage("coin"+i+".png");
        }
        setImage(idleImages[1]);
    }
    
    public void act()
    {
          if(isTouching(mainShoot.class)){
            
            Greenfoot.setWorld(new PrologDialogMale2());
            //getWorld().removeObject(this);
        
        }
        animation();
    }
    //set animation
    public void animation()
    {
        if(pause==0){
            pause=3;
            
}
        if(pause==1){
            setImage(idleImages[num]);
            num++;
            if(num >= idleImages.length){
                num=1;
            }
        }
        if(pause>0){
            pause--;
        }
    }

}
