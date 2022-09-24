import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menuOption here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menuOption extends World
{
    boolean instruction;
    /**
     * Constructor for objects of class menuOption.
     * 
     */
    public menuOption()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 512, 1); 
        prepare();
    }
    
    private void prepare()
    {
        btnBack btnBack = new btnBack();
        addObject(btnBack,135,44);


        textAbout title = new textAbout("ABOUT", 32);
        textAbout text2 = new textAbout("Game Director", 32);
        textAbout text3 = new textAbout("Programmer", 32);
        textAbout text4 = new textAbout("Animation & Design", 32);
        textAbout text5 = new textAbout("Design Quality Control", 32);
        textAbout text6 = new textAbout("Storyline", 32);
        textAbout text7 = new textAbout("Soundeffects", 32);
        textAbout text8 = new textAbout("Soundeffects Quality Control ", 32);

        textAbout text9 = new textAbout("Mahesa Rafian Syah", 32);
        textAbout text10 = new textAbout("Jordan Yussac", 32);
        textAbout text11 = new textAbout("Ester Febiola", 32);
        textAbout text12 = new textAbout("Nathan Septian", 32);
        textAbout text13 = new textAbout("Albert Saputra", 32);
        textAbout text14 = new textAbout("Rafli Dwi Putra", 32);
        textAbout text15 = new textAbout("Lisa Christiana", 32);

        addObject(title,480,114);
        addObject(text2,150,142);
        addObject(text3,480,400);
        addObject(text4,480,400);
        addObject(text5,480,400);
        addObject(text6,480,400);
        addObject(text7,480,400);
        addObject(text8,480,400);

        addObject(text9,150,142);
        addObject(text10,480,400);
        addObject(text11,480,400);
        addObject(text12,480,400);
        addObject(text13,480,400);
        addObject(text14,480,400);
        addObject(text15,480,400);

        title.setLocation(476,101);
        text2.setLocation(384,142);
text3.setLocation(396,175);
text4.setLocation(354,211);
text5.setLocation(337,249);
text6.setLocation(419,286);
text7.setLocation(391,323);
text8.setLocation(302,358);

text9.setLocation(617,141);
text10.setLocation(585,175);
text11.setLocation(574,212);
text12.setLocation(585,248);
text13.setLocation(580,284);
text14.setLocation(586,320);
text15.setLocation(588,357);
    }
}