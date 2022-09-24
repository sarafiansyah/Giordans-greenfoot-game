import greenfoot.*; 
 // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CoinCount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CoinCount extends Actor
{
    /**
     * Act - do whatever the CoinCount wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
GreenfootImage img = new GreenfootImage("The text (String) you want to print.", 35, Color.BLACK, new Color(0, 0, 0, 0));
//That will make a GreenfootImage with your string with black letters on a transparent ground with a font size of 35;
setImage(img); //you need to set the image of your actor to the image you created to see it;

    }
}
