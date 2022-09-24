import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class maleShoot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mainShoot extends Actor
{
    int shootTime = 0;
    boolean shoot;
    int hp = 1000;
    public int ringluckCount = 0;
    public  Bar bar = new Bar("Player", "HP", hp, 1000);
    
    /**
     * Act - do whatever the maleShoot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(menuCharacter.gender == true){
            //setImage(new GreenfootImage("female shoot1-Crop.png"));
            if(Greenfoot.isKeyDown("A")){
            setImage(new GreenfootImage("female shoot1 hover-Crop.png"));
            setLocation(getX()-5, getY());
            shoot = true;
        }
        else if(Greenfoot.isKeyDown("D")){
            setImage(new GreenfootImage("female shoot1-Crop.png"));
            setLocation(getX()+5, getY());
            shoot = false;
            //GreenfootSound sound = new GreenfootSound("applause_y.wav");
            //sound.play();

        }
        else if(Greenfoot.isKeyDown("W")){
            setLocation(getX(), getY()-5);
            if (getY() <= 100 )  {
                setLocation(getX(), getY()+5); 
            }
        }
        else if(Greenfoot.isKeyDown("S")){
            setLocation(getX(), getY()+5);
            if (getY() >= 352 )  {
                setLocation(getX(), getY()-5);         
            }
        }
        
        }
        
        if(menuCharacter.gender == false){
            
        if(Greenfoot.isKeyDown("A")){
            setImage(new GreenfootImage("male shoot 1 hover.png"));
            setLocation(getX()-5, getY());
            shoot = true;
        }
        else if(Greenfoot.isKeyDown("D")){
            setImage(new GreenfootImage("male shoot 1.png"));
            setLocation(getX()+5, getY());
            shoot = false;
            //GreenfootSound sound = new GreenfootSound("applause_y.wav");
            //sound.play();

        }
        else if(Greenfoot.isKeyDown("W")){
            setLocation(getX(), getY()-5);
            if (getY() <= 100 )  {
                setLocation(getX(), getY()+5); 
            }
        }
        else if(Greenfoot.isKeyDown("S")){
            setLocation(getX(), getY()+5);
            if (getY() >= 352 )  {
                setLocation(getX(), getY()-5);         
            }
        }
        }
        
        if (Greenfoot.mouseClicked(null)){            
            
                if(shoot==true){
                    msshootLeft();
                    
                }
                if(shoot==false){
                    msshootRight();
                    
                }
              
        }
        
        
        //getWorld().addObject(bar,getX(),getY()-45);
        getWorld().addObject(bar, 150, 480);
        //lvl 1
        if(isTouching(Enemy1_1.class)||isTouching(Enemy1_3.class)||isTouching(enemyBulletLeft.class)){
            bar.subtract(1);
            //getWorld().removeObject(this);
            //Greenfoot.stop();
        }
        //lvl 2
        if(isTouching(Enemy2_3.class)||isTouching(enemyBulletLeft.class)){
            bar.subtract(1);
            //getWorld().removeObject(this);
            //Greenfoot.stop();
        }
        //lvl 3
        if(isTouching(Enemy3_1.class)||isTouching(Enemy3_2.class)||isTouching(Enemy3_3.class)||isTouching(Enemy3_4.class)){
            bar.subtract(1);
            //getWorld().removeObject(this);
            //Greenfoot.stop();
        }
        //BOOSSS
        if(isTouching(Enemy3_5.class)){
            bar.subtract(5);
            //getWorld().removeObject(this);
            //Greenfoot.stop();
        }
        if(bar.getValue() == 0){
            Greenfoot.setWorld(new GameOver());
        }
        
        if(isTouching(ringLuck.class)){
        bar.add(1000);
        ringluckCount += 1;
        }
        
        if (ringluckCount == 1){
        if(Greenfoot.isKeyDown("space")){       
            bulletLeftLV3 arrow2 = new bulletLeftLV3();
            getWorld().addObject(arrow2, getX(), getY()-2); 
        }}
        
        // in 'checkKeys' method

 
// the 'shoot' method

    }
    void shootRight(){
        bulletRight bullet = new bulletRight();
        getWorld().addObject(bullet, getX(), getY());
    }
    void shootLeft(){
        bulletLeft bullet = new bulletLeft();
        getWorld().addObject(bullet, getX(), getY());
    }
     void msshootRight(){
    // the following two statements were added to the code
    MouseInfo mouse = Greenfoot.getMouseInfo();
    if (mouse == null) return;
    int x = mouse.getX();
    int y = mouse.getY();
    bulletRight arrow2 = new bulletRight();
    getWorld().addObject(arrow2, getX(), getY()-8);
    Greenfoot.playSound("sounds/laser.mp3");
}
void msshootLeft(){
    // the following two statements were added to the code
    MouseInfo mouse = Greenfoot.getMouseInfo();
    if (mouse == null) return;
    int x = mouse.getX();
    int y = mouse.getY();
    bulletLeft arrow2 = new bulletLeft();
    getWorld().addObject(arrow2, getX(), getY()-8);
    Greenfoot.playSound("sounds/laser.mp3");
}
}
