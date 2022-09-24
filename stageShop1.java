import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class stageShop1 extends World
{

    
    public mainShoot mainPlayer = new mainShoot();
    public static int boss = 1;   
    public static int maxEnemy3 = 2;  
    public static int maxEnemy4 = 1;
    public static int maxEnemy5 = 1;
   public static int xEnemy2 = 720;//rand.nextInt(960)+480;
    public static int yEnemy2 = 200;//rand.nextInt(412)+100;
    public static int xEnemy2_1 = 724;//rand.nextInt(960)+480;
    public static int yEnemy2_1 = 335;//rand.nextInt(412)+100;
    public static int xEnemy3 = 920;//rand.nextInt(960)+480;
    public static int yEnemy3 = 200;//rand.nextInt(412)+100;
    public static int xEnemy4 = 823;//rand.nextInt(960)+480;
    public static int yEnemy4 = 327;//rand.nextInt(412)+100; 
    public static int xEnemy5 =174;//rand.nextInt(412)+100; 
    public static int yEnemy5 = 398;//rand.nextInt(412)+100; 

    public stageShop1()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 512, 1);         
        act();

        prepare();
    }

    public void act()
    {
        
       

        btnBack_shop1 btnPause = new btnBack_shop1();
        addObject(btnPause,94,35);
        mainShoot maleShoot = new mainShoot();
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

        //Enemy.hp = 500;

        CoinStatic coinStatic = new CoinStatic();
        addObject(coinStatic,786,30);

        ringLuck ringLuck = new ringLuck();
        addObject(ringLuck,919,367);
        ringLuck.setLocation(926,310);
        portal1 portal = new portal1();
        addObject(portal, 838, 281);
    }
}
