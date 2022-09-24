import greenfoot.*;

public class Enemy1_3 extends Actor
{
    private GreenfootImage[] idleImages = new GreenfootImage[26];
    private GreenfootImage[] mirroredImages = new GreenfootImage[26];
    private GreenfootImage[] attackImages = new GreenfootImage[4];
    private GreenfootImage[] mirroredAttackImages = new GreenfootImage[4];
    private int pause=10;
    private int idleNum=0; 
    private int attackPause=10;
    private int attackNum=0;
    private int movementSpeed = 10;
    mainShoot player;
    int hp = 500;
    public Enemy1_3(mainShoot mainPlayer)
    {
        player= mainPlayer;
    }
    public void addedToWorld(World Stage1)
    {
        for(int i=0; i<idleImages.length; i++){
            idleImages[i] = new GreenfootImage("l1_m3_"+i+".png");
        }
        for(int j=0; j<mirroredImages.length; j++){
            GreenfootImage mirroredImage = new GreenfootImage("l1_m3_"+j+".png");
            mirroredImage.mirrorHorizontally();
            mirroredImages[j] = mirroredImage;
        }
        for(int k=0; k<attackImages.length; k++){
            attackImages[k] = new GreenfootImage("l1_m3_atk_"+k+".png");
        }
        for(int l=0; l<mirroredAttackImages.length; l++){
            GreenfootImage mirroredAttackImage = new GreenfootImage("l1_m3_atk_"+l+".png");
            mirroredAttackImage.mirrorHorizontally();
            mirroredAttackImages[l] = mirroredAttackImage;
        }
    }
    public void act()
    {
        animation();
        moveEnemy();
        //attackAnimation();
        if(isTouching(bulletRight.class)||isTouching(bulletLeft.class)){
            hp-=100;
        }
        if(hp==0){
            getWorld().addObject(new coin(), this.getX(), this.getY()-10);
            getWorld().removeObject(this);            
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
    private void moveEnemy()
    {
        // move toward player
        java.util.List Enemy = getWorld().getObjects(mainShoot.class);
        if (! Enemy.isEmpty()){
            mainShoot actor = (mainShoot)Enemy.get(0);
            turnTowards(actor.getX(), actor.getY());
            move(2);
            setRotation(0); // to maintain upright actor
        }
        if (getY() <= 50 ){
                setLocation(getX(), getY()+5); 
        }
        if (getY() >= 450 ){
                setLocation(getX(), getY()-5);         
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