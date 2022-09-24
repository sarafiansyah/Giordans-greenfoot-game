import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bgGameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bgGameOver extends Actor
{
    private int pause=10;
    private int idleNum=0;
    private GreenfootImage[] idleImages = new GreenfootImage[24];
    public void act()
    {
        // Add your action code here
        animation();        
    }
    private void animation(){
        for(int i=0; i<idleImages.length; i++){
            idleImages[i] = new GreenfootImage("bg_gameOver_ ("+i+").png");
        }
        if(pause==0){
            pause=10;
        }
        if(pause==1){
            setImage(idleImages[idleNum]);
            idleNum++;
            if(idleNum >= idleImages.length){
                idleNum = 0;
            }
        }
        if(pause>0){
            pause--;
        }
    }
}