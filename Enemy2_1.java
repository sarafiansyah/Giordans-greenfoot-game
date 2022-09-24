import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy2_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy2_1 extends Actor
{
    private GreenfootImage[] idleImages = new GreenfootImage[44];
    private GreenfootImage[] mirroredImages = new GreenfootImage[44];
    private int pause=10;
    private int idleNum=0; 
    private int attackPause=10;
    private int attackNum=0;
    private int movementSpeed = 10;
    mainShoot player;
    int ShootTime = 0;
    public static int hp = 500;
    private Bar_Enemy bar = new Bar_Enemy("", "", hp, 500);
    public Enemy2_1(mainShoot mainPlayer)
    {
        player= mainPlayer;
    }
    public void addedToWorld(World Stage2)
    {
        for(int i=0; i<idleImages.length; i++){
            idleImages[i] = new GreenfootImage("l2_m1_"+i+".png");
        }
        for(int j=0; j<mirroredImages.length; j++){
            GreenfootImage mirroredImage = new GreenfootImage("l2_m1_"+j+".png");
            mirroredImage.mirrorHorizontally();
            mirroredImages[j] = mirroredImage;
        }
    }
    public void act()
    {
        animation();
        ShootTime = ShootTime + 1;
        if(ShootTime>90){
            tembak();
            ShootTime = 0;
        } 
        
        Actor bulletRight = getOneIntersectingObject(bulletRight.class);
        Actor bulletLeft = getOneIntersectingObject(bulletLeft.class);
        if (bulletRight != null ){
            bar.subtract(100);
            hp -= 100;
            getWorld().removeObject(bulletRight); 
        }
        if (bulletLeft != null ){
            bar.subtract(100);
            hp -= 100;
            getWorld().removeObject(bulletLeft); 
        }
        if(bar.getValue() == 0){
            getWorld().addObject(new coin(), this.getX(), this.getY());
            getWorld().removeObject(this);    
            hp = 500;
        }
    }
    private void animation()
    {
        if(pause==0){
            pause=10;
        }
        if(pause==1){
            if(getX() < player.getX())
            {                
                setImage(idleImages[idleNum]);
            }
            else if(getX() >= player.getX())
            {
                
                setImage(mirroredImages[idleNum]);
            }
            idleNum++;
            if(idleNum >= idleImages.length){
                idleNum = 0;
            }
        }
        if(pause>0){
            pause--;
        }
    }      
    void tembak(){
        enemyBulletLeft bullet = new enemyBulletLeft();
        getWorld().addObject(bullet, getX()-2, getY());

    }
    }

