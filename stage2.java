import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class stage2 extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public static Random rand =  new Random();
    public static Counter counter = new Counter("Coins: ");
    public mainShoot mainPlayer = new mainShoot();
    public static int maxEnemy3 = 2;   
    public static int maxEnemy4 = 2;
    
    public static int xEnemy2 = 720;//rand.nextInt(960)+480;
    public static int yEnemy2 = 200;//rand.nextInt(412)+100;
    public static int xEnemy3 = 920;//rand.nextInt(960)+480;
    public static int yEnemy3 = 200;//rand.nextInt(412)+100;
    public static int xEnemy4 = 823;//rand.nextInt(960)+480;
    public static int yEnemy4 = 327;//rand.nextInt(412)+100;
    public GreenfootSound music = new GreenfootSound("Stage-2_DrippingWater.mp3");

    public stage2()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 512, 1);         
        act();
        music.playLoop();
        prepare();
    }

    public void act()
    {

        
        if (getObjects(Enemy2_2.class).size()<maxEnemy3)
        {
            addObject(new Enemy2_2(mainPlayer),xEnemy2,yEnemy2); 
            maxEnemy3--;
        }
        if (getObjects(Enemy2_2.class).size()<maxEnemy3-1){
            maxEnemy3++;
        }
        if (getObjects(Enemy2_3.class).size()<maxEnemy3)
        {
            addObject(new Enemy2_3(mainPlayer),xEnemy3,yEnemy3); 
            maxEnemy3--;
        }
        if (getObjects(Enemy2_3.class).size()<maxEnemy3-1){
            maxEnemy3++;
        }
         if (getObjects(Enemy2_4.class).size()<maxEnemy4)
         {
             addObject(new Enemy2_4(mainPlayer),xEnemy4,yEnemy4); 
             maxEnemy4--;
         }
         if (getObjects(Enemy2_4.class).size()<maxEnemy4-1){
             maxEnemy4++;
         }
        btnPause btnPause = new btnPause();
        addObject(btnPause,94,35);
        mainShoot mainShoot = new mainShoot();
        addObject(mainPlayer,61,261);

    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {   
        Counter counter = new Counter("Coins ");
        addObject(counter,863,30);
        // coin coin = new coin();
        // addObject(coin,778,29);
        // coin.setLocation(745,104);
        // removeObject(coin);

        CoinStatic coinStatic = new CoinStatic();
        addObject(coinStatic,786,30);
    }
}
