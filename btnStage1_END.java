import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class btnStage1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */



public class btnStage1_END extends Actor
{
    /**
     * Act - do whatever the btnStage1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public int storyCount = 0;
    textDialogue textPENNY = new textDialogue("PENNY", 24);
        textDialogue textJORDAN = new textDialogue("JORDAN", 24);
    textDialogue text1 = new textDialogue("Wow!!! Surely you're a true fighter! What's your name, warrior? ", 24);
textDialogue text2 = new textDialogue("I'm Jordan by the way. I'm crossing this forest to hunt down Jordanio.  \nDo you have any more clues about him?", 24);
textDialogue text3 = new textDialogue("This is Jordanson Forest, where creeps and mysterious monsters lives. \nWhat are you looking for in this forest?", 24);        
textDialogue text4 = new textDialogue("I'm pretty sure you had a big revenge on him, but I'm gonna tell you, \nit won't be easy fighting Jordanio side by side.", 24);
 textDialogue text5 = new textDialogue("Well, if died fighting him, my sister would live \nalone in this land. That's why I'm not gonna die for nothing.", 24); 
 textDialogue text6= new textDialogue("I've visited his place once. Silently and secretly. \nIt was a horrible place. I could sense anger and hate at the same time.", 24);
 textDialogue text7 = new textDialogue("Can you guide me to his place, Penny?", 24);
 textDialogue text8 = new textDialogue("It's gonna be along journey, warrior. \nBut are sure about what you're doing?", 24);
 textDialogue text9 = new textDialogue("Yes is the only answer!", 24);
 textDialogue text10 = new textDialogue("Hmmm.. Okay. Follow me through this Cave!", 24);
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
                                getWorld().removeObject(textPENNY);  
                getWorld().addObject(textJORDAN, 775,322);
                
            }
            
            
            if (storyCount == 10){
                getWorld().removeObject(text10);  
                ((PrologDialogMale2)getWorld()).music.stop();
                Greenfoot.setWorld(new Stage2DialogMale());
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
