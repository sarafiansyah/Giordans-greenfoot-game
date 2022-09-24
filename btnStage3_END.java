import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class btnStage1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */



public class btnStage3_END extends Actor
{
    /**
     * Act - do whatever the btnStage1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public int storyCount = 0;
    textDialogue textPENNY = new textDialogue("PENNY", 24);
        textDialogue textJORDAN = new textDialogue("JORDAN", 24);
        textDialogue textDMN = new textDialogue("JORDANIO", 24);
    textDialogue text1 = new textDialogue("How.. How it.. How it could be.. I'm defeated.. ", 24);
textDialogue text2 = new textDialogue("Jordanio.. I'll remember your name!", 24);
textDialogue text3 = new textDialogue("JORDAN!! ARE YOU OKAY??!!", 24);        
textDialogue text4 = new textDialogue("Nahh Penny, I'm good! just a little scratch on my arms. \nBut I'm sorry, I couldn't bring Jordanio back becau..", 24);
 textDialogue text5 = new textDialogue("Because he died already, when merged with the Demon Lord, \nYes I knew it. It's okay I'm fine. Thanks for it", 24); 
 textDialogue text6= new textDialogue("Well, The Demon Lord has vanished. So what's next?", 24);
 textDialogue text7 = new textDialogue("You see a portal back there? It's a Portal of Mindteleport. \nThink about some place, and get inside there. Ah! I'm gonna miss you as well!", 24);
 textDialogue text8 = new textDialogue("Penny, thanks for your help. Really. I couldn't make it without you. \nDo you wanna come? I' introduce you to my sister!", 24);
 textDialogue text9 = new textDialogue("Thanks Jordan, but no, The Forest, is my home. That portal was a one time use. \nSo, farewell, warrior! You'll become the strongest one day!", 24);
 textDialogue text10 = new textDialogue("Alright. Got it Penny, Once again, \nThank you for your support! farewell!", 24);
    public void act()
    {
        

mouseClick();

if (storyCount == 0){
                getWorld().addObject(text1, 466,403);
                getWorld().addObject(textDMN, 775,322);
            }
            if (storyCount == 1){
                getWorld().removeObject(text1);  
                getWorld().addObject(text2, 472,410);
                getWorld().removeObject(textDMN);  
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
                getWorld().addObject(text7, 475,407);
                getWorld().removeObject(textJORDAN);  
                getWorld().addObject(textPENNY, 775,322);
            }
            if (storyCount == 7){
                getWorld().removeObject(text7);  
                getWorld().addObject(text8, 475,407);
                getWorld().removeObject(textPENNY);  
                getWorld().addObject(textJORDAN, 775,322);
            }
            if (storyCount == 8){
                getWorld().removeObject(text8);  
                getWorld().addObject(text9, 475,407);
                getWorld().removeObject(textJORDAN);  
                getWorld().addObject(textPENNY, 775,322);
            }
            if (storyCount == 9){
                getWorld().removeObject(text9);  
                getWorld().addObject(text10, 475,407);
                getWorld().removeObject(textPENNY);  
                getWorld().addObject(textJORDAN, 775,322);
            }
            if (storyCount == 10){
                getWorld().removeObject(text10);  
                
                
                Greenfoot.setWorld(new stage3_CLEAR());
                
                
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
