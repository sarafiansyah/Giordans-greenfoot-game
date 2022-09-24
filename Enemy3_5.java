import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy3_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy3_5 extends Actor
{
    private GreenfootImage[] idleImages = new GreenfootImage[7];
    private GreenfootImage[] mirroredImages = new GreenfootImage[7];
    private GreenfootImage[] attackImages = new GreenfootImage[11];
    private GreenfootImage[] mirroredAttackImages = new GreenfootImage[11];
    private int pause=10;
    private int idleNum=0; 
    private int attackPause=10;
    private int attackNum=0;
    private int movementSpeed = 10;
    mainShoot player;
    public static int hp = 2000;
    private Bar_EnemyBOSS bar = new Bar_EnemyBOSS("Jordanio", "", hp, 2000);
    public Enemy3_5(mainShoot mainPlayer)
    {
        player= mainPlayer;
    }
    public void addedToWorld(World Stage3)
    {
        for(int i=1; i<idleImages.length; i++){ 
            idleImages[i] = new GreenfootImage("Boss_Gerak_"+i+".png");
        }
        for(int j=1; j<mirroredImages.length; j++){
            GreenfootImage mirroredImage = new GreenfootImage("Boss_Gerak_"+j+".png");
            mirroredImage.mirrorHorizontally();
            mirroredImages[j] = mirroredImage;
        }
        for(int k=1; k<attackImages.length; k++){ 
            attackImages[k] = new GreenfootImage("Boss_Serang1 ("+k+").png");
        }
        for(int l=1; l<mirroredAttackImages.length; l++){
            GreenfootImage mirroredAttackImage = new GreenfootImage("Boss_Serang1 ("+l+").png");
            mirroredAttackImage.mirrorHorizontally();
            mirroredAttackImages[l] = mirroredAttackImage;
        }
    }
    public void act()
    {
        getWorld().addObject(bar, 800, 480);
        animation();
        moveEnemy();
        attackAnimation();
        Actor bulletRight = getOneIntersectingObject(bulletRight.class);
        Actor bulletLeft = getOneIntersectingObject(bulletLeft.class);
        Actor bulletRightLV3 = getOneIntersectingObject(bulletRightLV3.class);
        Actor bulletLeftLV3 = getOneIntersectingObject(bulletLeftLV3.class);
        if (bulletRight != null ){
            bar.subtract(5);
            hp -= 100;
            getWorld().removeObject(bulletRight); 
        }
        if (bulletLeft != null ){
            bar.subtract(5);
            hp -= 100;
            getWorld().removeObject(bulletLeft); 
        }
        if (bulletRightLV3 != null ){
            bar.subtract(10);
            hp -= 100;
            getWorld().removeObject(bulletRight); 
        }
        if (bulletLeftLV3 != null ){
            bar.subtract(10);
            hp -= 100;
            getWorld().removeObject(bulletLeft); 
        }
        if(bar.getValue() == 0){
            getWorld().addObject(new coin(), this.getX(), this.getY());
            ((stage3)getWorld()).music.stop();
            Greenfoot.setWorld(new Stage3DialogMale2());
            getWorld().removeObject(this);    
            
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
                setImage(mirroredImages[idleNum]);
                
                
            }
            else if(getX() >= player.getX())
            {
                setImage(idleImages[idleNum]);
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
                    setImage(mirroredAttackImages[attackNum]);
                    
                }
                else if(getX() >= player.getX())
                {                    
                    
                    setImage(attackImages[attackNum]);
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
