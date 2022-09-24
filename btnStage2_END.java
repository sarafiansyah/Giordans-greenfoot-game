import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class btnStage1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */



public class btnStage2_END extends Actor
{
    /**
     * Act - do whatever the btnStage1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public int storyCount = 0;
    textDialogue textPENNY = new textDialogue("PENNY", 24);
        textDialogue textJORDAN = new textDialogue("JORDAN", 24);
    textDialogue text1 = new textDialogue("YEAHH JORDAN! You made it! \nwhat a great skill back there!", 24);
textDialogue text2 = new textDialogue("Heheh.. I learned combat with my uncle \nI met since I was a kid. So, what's now?", 24);
textDialogue text3 = new textDialogue("You're one step away from him now. The inner \ncave guards are weakened. We could get there with ease.", 24);        
textDialogue text4 = new textDialogue("Okay!! Let's get goin'!", 24);
 textDialogue text5 = new textDialogue("I can't believe my brother's \ngoing through this side..", 24); 
 textDialogue text6= new textDialogue("Wait, what? your brother? who?", 24);
 textDialogue text7 = new textDialogue("That demon lord once was my elder brother.", 24);
 textDialogue text8 = new textDialogue("WHAT?! JORDANIO?! FOR REALL??", 24);
 textDialogue text9 = new textDialogue("Yes he is. Jordanio could be the most kind \nperson I've ever met. We once lives in Jordania Land. ", 24);
 textDialogue text10 = new textDialogue("He had a best friend, which then becomes the King's assistant. \nBut my brother get jealous of that and turns him into anger.", 24);
 textDialogue text11 = new textDialogue("Hey hold a second.. you said his best friend \nthen becomes the King's assistant? ", 24);
 textDialogue text12 = new textDialogue("Yeah, King Theodore's Assistant many years ago", 24);
 textDialogue text13= new textDialogue("Is his bestfriend name is.. Jorin?", 24);
 textDialogue text14 = new textDialogue("Yeah.. yea.. hey hold on how do you know him?!", 24);
 textDialogue text15 = new textDialogue("He's my father. He told me some bedtime story \nabout his friend who get jealous of him and goes into the dark.", 24);
 textDialogue text16 = new textDialogue("So it means.. your father and \nmy brother are best friends?? how it could be..", 24);
 textDialogue text17 = new textDialogue("I guess yes is the answer. He encouraged me one \nday I should bring him back to the right way", 24);
 textDialogue text18 = new textDialogue("I never thought about this.. totally unexpected! But unfortunately, \nJordanio.. his soul.. I never saw that ever again in my life", 24);
 textDialogue text19 = new textDialogue("The demon has took it away..", 24);
 textDialogue text20 = new textDialogue("Then it is the time.. we fight the demon lord!", 24);
 textDialogue text21 = new textDialogue("Get inside the inner cave! I'll lead you the way!", 24);
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
                getWorld().removeObject(textJORDAN);  
                getWorld().addObject(textPENNY, 775,322);
            }
            if (storyCount == 10){
                getWorld().removeObject(text10);  
                getWorld().addObject(text11, 475,407);
                getWorld().removeObject(textPENNY);  
                getWorld().addObject(textJORDAN, 775,322);
            }
            if (storyCount == 11){
                getWorld().removeObject(text11);  
                getWorld().addObject(text12, 475,407);
                getWorld().removeObject(textJORDAN);  
                getWorld().addObject(textPENNY, 775,322);
            }
            if (storyCount == 12){
                getWorld().removeObject(text12);  
                getWorld().addObject(text13, 475,407);
                getWorld().removeObject(textPENNY);  
                getWorld().addObject(textJORDAN, 775,322);
            }
            if (storyCount == 13){
                getWorld().removeObject(text13);  
                getWorld().addObject(text14, 475,407);
                getWorld().removeObject(textJORDAN);  
                getWorld().addObject(textPENNY, 775,322);
            }
            if (storyCount == 14){
                getWorld().removeObject(text14);  
                getWorld().addObject(text15, 475,407);
                getWorld().removeObject(textPENNY);  
                getWorld().addObject(textJORDAN, 775,322);
            }
            if (storyCount == 15){
                getWorld().removeObject(text15);  
                getWorld().addObject(text16, 475,407);
                getWorld().removeObject(textJORDAN);  
                getWorld().addObject(textPENNY, 775,322);
            }
            if (storyCount == 16){
                getWorld().removeObject(text16);  
                getWorld().addObject(text17, 475,407);
                getWorld().removeObject(textPENNY);  
                getWorld().addObject(textJORDAN, 775,322);
            }
            if (storyCount == 17){
                getWorld().removeObject(text17);  
                getWorld().addObject(text18, 475,407);
                getWorld().removeObject(textPENNY);  
                getWorld().addObject(textJORDAN, 775,322);
            }
            if (storyCount == 18){
                getWorld().removeObject(text18);  
                getWorld().addObject(text19, 475,407);
                getWorld().removeObject(textJORDAN);  
                getWorld().addObject(textPENNY, 775,322);
            }
            if (storyCount == 19){
                getWorld().removeObject(text19);  
                getWorld().addObject(text20, 475,407);
                getWorld().removeObject(textPENNY);  
                getWorld().addObject(textJORDAN, 775,322);
            }
            if (storyCount == 20){
                getWorld().removeObject(text20);  
                getWorld().addObject(text21, 475,407);
                getWorld().removeObject(textJORDAN);  
                getWorld().addObject(textPENNY, 775,322);
            }
            if (storyCount == 21){
                getWorld().removeObject(text21);  
                getWorld().addObject(text6, 475,407);
                ((Stage2DialogMale2)getWorld()).music.stop();
                Greenfoot.setWorld(new Stage3DialogMale());
                
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
