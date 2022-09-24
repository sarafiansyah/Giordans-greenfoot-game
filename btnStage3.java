import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class btnStage1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */



public class btnStage3 extends Actor
{
    /**
     * Act - do whatever the btnStage1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public int storyCount = 0;
    textDialogue textPENNY = new textDialogue("PENNY", 24);
        textDialogue textJORDAN = new textDialogue("JORDAN", 24);
        textDialogue textDMN = new textDialogue("JORDANIO", 24);
        
    textDialogue text1 = new textDialogue("So here we are.. infront of the gate of hell. \nDo what you need to do, but be careful!", 24);
textDialogue text2 = new textDialogue("I will, Penny. Thanks for the lead. I'll finish \nthe rest. Demon Lord should vanish!", 24);
textDialogue text3 = new textDialogue("But wait! Fighting him won't be easy. \nYou could die in just a second.", 24);        
textDialogue text4 = new textDialogue("There are a Powerful Thing hidden in Jordanio's lair. \nIf you can manage to get them, it would give you an extreme buff. has ", 24);
 textDialogue text5 = new textDialogue("Affirm. I'll find them out!", 24); 
 textDialogue text6= new textDialogue("But it has a unique way of use, press \nSPACE to use that thing. Good Luck, Jordan!", 24);
 textDialogue text7 = new textDialogue("Got It Penny, thanks for the help!.", 24);
 textDialogue text8 = new textDialogue("Who dare trespassing my Lair with their dirty foots?! ", 24);
 textDialogue text9 = new textDialogue("Hey Demon Lord! You may have vanished the Jordania Land, \nbut you didn't notice that I'm the one of two who survived.", 24);
 textDialogue text10 = new textDialogue("And I'm here, to send you back from where you came from. \nJust like my father once said, Jordanio, you'll get home!", 24);
 textDialogue text11 = new textDialogue("HMMPH! Jorin's son huh?! Jordanio has turned into ashes when he merged with me.", 24); 
 textDialogue text12 = new textDialogue("So kid, tell me what you get! Keep your \nfinal word for later, little Jordanian!", 24); 
    public void act()
    {
        

mouseClick();

if (storyCount == 0){
                getWorld().addObject(text1, 466,403);
                getWorld().addObject(textPENNY, 775,322);
            }
            if (storyCount == 1){
                getWorld().removeObject(text1);  
                getWorld().addObject(text2, 472,410);
                getWorld().removeObject(textPENNY);  
                getWorld().addObject(textJORDAN, 775,322);
            }
            if (storyCount == 2){
                getWorld().removeObject(text2);  
                getWorld().addObject(text3, 486,408);
                getWorld().removeObject(textJORDAN);  
                getWorld().addObject(textPENNY, 775,322);
            }
            if (storyCount == 3){
                getWorld().removeObject(text3);  
                getWorld().addObject(text4, 456,403);
                getWorld().removeObject(textJORDAN);  
                getWorld().addObject(textPENNY, 775,322);
            }
            if (storyCount == 4){
                getWorld().removeObject(text4);  
                getWorld().addObject(text5, 449,410);
                getWorld().removeObject(textPENNY);  
                getWorld().addObject(textJORDAN, 775,322);
            }
            if (storyCount == 5){
                getWorld().removeObject(text5);  
                getWorld().addObject(text6, 475,407);
                getWorld().removeObject(textJORDAN);  
                getWorld().addObject(textPENNY, 775,322);
            }

            if (storyCount == 6){
                getWorld().removeObject(text6);  
                getWorld().addObject(text7, 475,407);
                getWorld().removeObject(textPENNY);  
                getWorld().addObject(textJORDAN, 775,322);
            }
            if (storyCount == 7){
                getWorld().removeObject(text7);  
                getWorld().addObject(text8, 475,407);
               getWorld().removeObject(textJORDAN);  
                getWorld().addObject(textDMN, 775,322);
            }
            if (storyCount == 8){
                getWorld().removeObject(text8);  
                getWorld().addObject(text9, 475,407);
                getWorld().removeObject(textDMN);  
                getWorld().addObject(textJORDAN, 775,322);
            }
            if (storyCount == 9){
                getWorld().removeObject(text9);  
                getWorld().addObject(text10, 475,407);
                getWorld().removeObject(textDMN);  
                getWorld().addObject(textJORDAN, 775,322);
            }
            if (storyCount == 10){
                getWorld().removeObject(text10);  
                getWorld().addObject(text11, 475,407);
                getWorld().removeObject(textJORDAN);  
                getWorld().addObject(textDMN, 775,322);
            }
            if (storyCount == 11){
                getWorld().removeObject(text11);  
                getWorld().addObject(text12, 475,407);
                getWorld().removeObject(textJORDAN);  
                getWorld().addObject(textDMN, 775,322);
            }
            if (storyCount == 12){
                getWorld().removeObject(text12);  
                
                ((Stage3DialogMale)getWorld()).music.stop();
                Greenfoot.setWorld(new stage3());
                
            }
            
            
            
            
            
        
    }
    
    void mouseClick (){
    if (Greenfoot.mouseClicked(this)){
            //
            
            
            storyCount++;
            
            //Greenfoot.setWorld(new stage1());
            

        }
    }
}
