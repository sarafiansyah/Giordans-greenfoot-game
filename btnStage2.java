import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class btnStage1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */



public class btnStage2 extends Actor
{
    /**
     * Act - do whatever the btnStage1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public int storyCount = 0;
    textDialogue textPENNY = new textDialogue("PENNY", 24);
        textDialogue textJORDAN = new textDialogue("JORDAN", 24);
    textDialogue text1 = new textDialogue("This, is the outer cave where Jordanio lives. \nThere's a lot of armored creeps protecting infront the inner cave.", 24);
textDialogue text2 = new textDialogue("Armored creeps? is it the same as I've fought before?", 24);
textDialogue text3 = new textDialogue("Nope, the last one you fought was a wild monsters. \nUnlike this one, they're Jordanio's guards", 24);        
textDialogue text4 = new textDialogue("I'm going for the demon lord.. I've met strange people who said that the \ndemon lord has going through this forest. Do you know anything about him?", 24);
 textDialogue text5 = new textDialogue("You see those guys? you'll gonna have to fight them to get inside. \nIt won't be easy, but I'm pretty sure you could make it! Good Luck!", 24); 
 textDialogue text6= new textDialogue("I promise I'll survive! Let's Roll Jordanians!", 24);
 textDialogue text7 = new textDialogue("Yes, Jordanio, the Demon Lord who once destroyed his rival's \nhometown, leaving no single lives.", 24);
 textDialogue text8 = new textDialogue("Nope. I'm the child of miracle from that place. THat's why I really had a big surprise for him", 24);
 textDialogue text9 = new textDialogue("Really.. hey look! Watch out! it's Ghostslime!! Quick, slain them!", 24);
 textDialogue text10 = new textDialogue("To use your weapon, LEFT CMOUSE CLICK, to WALK, WASD", 24);
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
                getWorld().removeObject(textPENNY);  
                getWorld().addObject(textJORDAN, 775,322);
            }
            if (storyCount == 4){
                getWorld().removeObject(text4);  
                getWorld().addObject(text5, 449,410);
                getWorld().removeObject(textJORDAN);  
                getWorld().addObject(textPENNY, 775,322);
            }
            if (storyCount == 5){
                getWorld().removeObject(text5);  
                getWorld().addObject(text6, 475,407);
                getWorld().removeObject(textPENNY);  
                getWorld().addObject(textJORDAN, 775,322);
            }
            if (storyCount == 6){
                getWorld().removeObject(text6);  
                getWorld().addObject(text7, 463,410);
                ((Stage2DialogMale)getWorld()).music.stop();
                Greenfoot.setWorld(new stage2());
                
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
