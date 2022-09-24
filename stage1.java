import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class stage1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class stage1 extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public GreenfootSound music = new GreenfootSound("Sound In Game.mp3");
    public static Counter counter = new Counter("Coins: ");
    public static Random rand =  new Random();
    public mainShoot mainPlayer = new mainShoot();
    public static int max = 1;     
    public static int max1 = 1;    
    public static int xslime1 = 940; //rand.nextInt(960)+480;
    public static int yslime1 = 322; //rand.nextInt(412)+100;
    public static int xslime2 = 700;
    public static int yslime2 = 322;
    public static int xslime3 = 940;
    public static int yslime3 = 100; 

    

    public stage1()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 512, 1);         
        act();
music.playLoop();
        prepare();
    }

    public void act()
    {
        if (getObjects(Enemy1_1.class).size()<max)
        {
            addObject(new Enemy1_1(mainPlayer),xslime1,yslime1); 
            max--;
        }
        if (getObjects(Enemy1_1.class).size()<max-1){
            max++;
        }
        if (getObjects(Enemy1_2.class).size()<max1)
        {
            addObject(new Enemy1_2(mainPlayer),xslime3,yslime3); 
            max1--;
        }
        if (getObjects(Enemy1_2.class).size()<max1-1){
            max1++;
        }

        btnPause btnPause = new btnPause();
        addObject(btnPause,94,35);
        mainShoot maleShoot = new mainShoot();
        addObject(mainPlayer,61,261);
        //stage1Male.counter.setValue(0);

    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {   
        
        addObject(counter,863,30);
        //max = 1;
        //Enemy.hp = 500;
        

        CoinStatic coinStatic = new CoinStatic();
        addObject(coinStatic,786,30);
        btnShop shop = new btnShop();
        addObject(shop,219,35);
    }
}
