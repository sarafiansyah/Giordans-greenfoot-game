import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Forest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menuCharacter extends World
{
    /**
     * Constructor for objects of class Forest.
     * 
     */
    btnFemale btnFemale = new btnFemale();
    btnMale btnMale = new btnMale();
    public static boolean playBGM;
    public static boolean gender;
    public menuCharacter()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 512, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    private void prepare()
    {
        Male0 male0 = new Male0();
        addObject(male0,300,250);
        Female0 female0 = new Female0();
        addObject(female0,650,255);
        female0.setLocation(660,250);
        btnBack btnBack = new btnBack();
        addObject(btnBack,135,44);
        addObject(btnFemale,670,439);
        btnMale btnMale = new btnMale();
        addObject(btnMale,320,439);
        btnMute btnMute = new btnMute();
        addObject(btnMute,919,472);
        btnMute.setLocation(917,465);
        removeObject(btnMute);

        playBGM = true;
        gender = true;
    }
    public void act(){
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
        bg_music.music2.setVolume(80);
        bg_music.music2.play();
    }

public static void stopBGM()
{
    bg_music.music2.setVolume(0);
}
  }
