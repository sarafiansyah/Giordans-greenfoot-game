import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class btnStage1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */



public class btnStage1Male extends Actor
{
    /**
     * Act - do whatever the btnStage1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public int storyCount = 0;

        
        textDialogue textPENNY = new textDialogue("PENNY", 24);
        textDialogue textJORDAN = new textDialogue("JORDAN", 24);
    textDialogue text1 = new textDialogue("Hi! I'm Penny, I used to walk in this forest every day \nand I saw you lay down on the ground. Are you okay?", 24);
textDialogue text2 = new textDialogue("Yeah I'm good.. where.. where am I?", 24);
textDialogue text3 = new textDialogue("This is Jordanson Forest, where creeps and mysterious monsters lives. \nWhat are you looking for in this forest?", 24);        
textDialogue text4 = new textDialogue("I'm going for the demon lord.. I've met strange people who said that the \ndemon lord has going through this forest. Do you know anything about him?", 24);
 textDialogue text5 = new textDialogue("The demon what?! Demon Lord?! You've got to be kidding me! \nYou mean Jordanio? Why?!", 24); 
 textDialogue text6= new textDialogue("Hm? Jordanio? is it his name? I really have something big for him.", 24);
 textDialogue text7 = new textDialogue("Yes, Jordanio, the Demon Lord who once destroyed his rival's \nhometown, leaving no single lives.", 24);
 textDialogue text8 = new textDialogue("Nope. I'm the child of miracle from that place. That's why I really had a big surprise for him", 24);
 textDialogue text9 = new textDialogue("Really.. hey look! Watch out! it's Ghostslime!! Quick, slain them!", 24);
 textDialogue text10 = new textDialogue("To use your weapon, LEFT MOUSE CLICK, to WALK, WASD", 24);
    public void act()
    {
        

mouseClick();

if (storyCount == 0){
                getWorld().addObject(text1, 466,403);
                getWorld().addObject(textPENNY, 775,322);
                
            }
            if (storyCount == 1){
                getWorld().removeObject(text1);  
                getWorld().removeObject(textPENNY);  
                getWorld().addObject(textJORDAN, 775,322);
                getWorld().addObject(text2, 472,410);
                
                
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
                getWorld().removeObject(textJORDAN);  
                getWorld().addObject(textPENNY, 775,322);
                
            }
            if (storyCount == 7){
                getWorld().removeObject(text7);  
                getWorld().addObject(text8, 458,404);
                getWorld().removeObject(textPENNY);  
                getWorld().addObject(textJORDAN, 775,322);
                
            }
            if (storyCount == 8){
                getWorld().removeObject(text8);  
                getWorld().addObject(text9, 472,410);
                getWorld().removeObject(textJORDAN);  
                getWorld().addObject(textPENNY, 775,322);
                
            }
            if (storyCount == 9){
                getWorld().removeObject(text9);  
                getWorld().addObject(text10, 478,406);
                getWorld().removeObject(textJORDAN);  
                getWorld().addObject(textPENNY, 775,322);
                
            }
            
            
            if (storyCount == 10){
                getWorld().removeObject(text10);  
                ((PrologDialogMale)getWorld()).music.stop();
                Greenfoot.setWorld(new stage1());
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
