import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class C here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class C.
     * 
     */

        public static int SoundStopper = 1;
        public static boolean playBGM;
    //public GreenfootSound music = new GreenfootSound("Sound menu 1.mp3");
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 512, 1); 
        prepare();

        //if (SoundStopper == 1){
        //.playLoop();
    //}
    //else if (SoundStopper == 0){
        //music.stop();
   // }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Menu.SoundStopper = 1;
        btnStart btnStart = new btnStart();
        addObject(btnStart,150,399);
        btnOption btnOption = new btnOption();
        addObject(btnOption,480,399);
        btnExit btnExit = new btnExit();
        addObject(btnExit,810,399);
        title title = new title();
        addObject(title,482,186);
        btnMute btnMute = new btnMute();
        addObject(btnMute,910,474);

        playBGM = true;
        textVersion version = new textVersion("v.17.0 ALPHA", 20);
        addObject(version,52,498);

    }
    
 
public void act()
{
 
 if (playBGM  == true)
 {
    startBGM(); 
 }
 else {
    stopBGM ();
 }
}

public static void startBGM()
    {
        bg_music.music.setVolume(80);
        bg_music.music.play();
    }

public static void stopBGM()
{
    bg_music.music.setVolume(0);
}
}