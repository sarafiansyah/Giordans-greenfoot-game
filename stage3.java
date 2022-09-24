import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class stage3 extends World
{

    public static Counter counter = new Counter("Coins: ");
    public static Random rand =  new Random();
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
    public GreenfootSound music = new GreenfootSound("Stage-3_Hell.mp3");

    public stage3()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 512, 1);         
        act();
music.playLoop();
        prepare();
    }

    public void act()
    {
        
        if (getObjects(Enemy3_1.class).size()<maxEnemy3)
        {
            addObject(new Enemy3_1(mainPlayer),xEnemy2,yEnemy2); 
            maxEnemy3--;
        }
        if (getObjects(Enemy3_1.class).size()<maxEnemy3-1){
            maxEnemy3++;
        }
        
        
         if (getObjects(Enemy3_2.class).size()<maxEnemy3)
        {
            addObject(new Enemy3_2(mainPlayer),xEnemy2_1,yEnemy2_1); 
            maxEnemy3--;
        }
        if (getObjects(Enemy3_2.class).size()<maxEnemy3-1){
            maxEnemy3++;
        }
        
         if (getObjects(Enemy3_3.class).size()<maxEnemy4)
        {
            addObject(new Enemy3_3(mainPlayer),xEnemy3,yEnemy3); 
            maxEnemy4--;
        }
        if (getObjects(Enemy3_3.class).size()<maxEnemy4-1){
            maxEnemy4++;
        }
        
        if (getObjects(Enemy3_4.class).size()<maxEnemy5)
        {
            addObject(new Enemy3_4(mainPlayer),xEnemy5,yEnemy5); 
            maxEnemy5--;
        }
        if (getObjects(Enemy3_4.class).size()<maxEnemy5-1){
            maxEnemy5++;
        }
        
        
        if (getObjects(Enemy3_5.class).size()<boss)
        {
            addObject(new Enemy3_5(mainPlayer),xEnemy4,yEnemy4); 
            boss--;
        }
        if (getObjects(Enemy3_5.class).size()<boss-1){
            boss++;
        }

        btnPause btnPause = new btnPause();
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
    }
}
