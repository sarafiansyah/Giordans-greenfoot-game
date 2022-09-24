import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy2_4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy3_4 extends Actor
{
    private GreenfootImage[] idleImages = new GreenfootImage[33];
    private GreenfootImage[] mirroredImages = new GreenfootImage[33];
    private GreenfootImage[] attackImages = new GreenfootImage[19];
    private GreenfootImage[] mirroredAttackImages = new GreenfootImage[19];
    private int pause=10;
    private int idleNum=0; 
    private int attackPause=10;
    private int attackNum=0;
    private int movementSpeed = 10;
    mainShoot player;
    public static int hp = 1000;
    private Bar_Enemy3_4 bar = new Bar_Enemy3_4("", "", hp, 1000);
    public Enemy3_4(mainShoot mainPlayer)
    {
        player= mainPlayer;
    }
    public void addedToWorld(World Stage2)
    {
        for(int i=1; i<idleImages.length; i++){
            idleImages[i] = new GreenfootImage("l2_m4_ ("+i+").png");
        }
        for(int j=1; j<mirroredImages.length; j++){
            GreenfootImage mirroredImage = new GreenfootImage("l2_m4_ ("+j+").png");
            mirroredImage.mirrorHorizontally();
            mirroredImages[j] = mirroredImage;
        }
        for(int k=1; k<attackImages.length; k++){
            attackImages[k] = new GreenfootImage("l2_m4_atk ("+k+").png");
        }
        for(int l=1; l<mirroredAttackImages.length; l++){
            GreenfootImage mirroredAttackImage = new GreenfootImage("l2_m4_atk ("+l+").png");
            mirroredAttackImage.mirrorHorizontally();
            mirroredAttackImages[l] = mirroredAttackImage;
        }
    }
    public void act()
    {
        getWorld().addObject(bar,getX(),getY()-45);
        animation();
        moveEnemy();
        //attackAnimation();
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
            hp = 1000;
        }
    }
    private void moveEnemy()
    {
        // move toward player
        java.util.List Enemy = getWorld().getObjects(mainShoot.class);
        if (! Enemy.isEmpty()){
            mainShoot actor = (mainShoot)Enemy.get(0);
            turnTowards(actor.getX(), actor.getY());
            move(1);
            setRotation(0); // to maintain upright actor
        }
        if (getY() <= 50 ){
                setLocation(getX(), getY()+5); 
        }
        if (getY() >= 450 ){
                setLocation(getX(), getY()-5);         
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
    private void attackAnimation()
    {
        //selama menyentuh player, akan menggenerate animasi attack
        if(getOneIntersectingObject(mainShoot.class) != null)
        {
            if(getX() < player.getX())
            {
                setLocation(getX()-1, getY());
                if(getY() < player.getY())
                {
                    setLocation(getX(), getY()-1);
                }
                else if(getY() >= player.getY())
                {
                    setLocation(getX(), getY()+1);
                }
            }
            else if(getX() >= player.getX())
            {
                setLocation(getX()+1, getY());
                if(getY() < player.getY())
                {
                    setLocation(getX(), getY()-1);
                }
                else if(getY() >= player.getY())
                {
                    setLocation(getX(), getY()+1);
                }
            }
            if(attackPause==0){
                attackPause=10;
            }
            if(attackPause==1){
                if(getX() < player.getX())
                {
                    setImage(attackImages[attackNum]);
                }
                else if(getX() >= player.getX())
                {                    
                    
                    setImage(mirroredAttackImages[attackNum]);
                }
                attackNum++;
                if(attackNum >= attackImages.length){
                    attackNum=1;
                }
            }
            if(attackPause>0){
                attackPause--;
            }
        }
    }
}
