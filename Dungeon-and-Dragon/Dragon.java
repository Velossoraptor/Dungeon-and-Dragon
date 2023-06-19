import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dragon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dragon extends Actor

{
    boolean dragon = true;
    int health = 30;
    int deltaX = 0;
    int deltaY = 0;
    int speed = 1;
    GreenfootImage dragonImage = new GreenfootImage("Dragon.png");
    GreenfootImage damage = new GreenfootImage("Dragond.png");
    /**
     * Act - do whatever the Dragon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(dragonImage);  
        if(health>0){
            moveDragon();
        }
        
        playerAttack();
        hitPlayer();
        dragonDied();
        //java.util.List<Player> playerInLevel = getWorld().getObjects(Player.class);

        if (!dragon){
            setLocation(0, 0);
        }

        if (health <= 0){
            dragon = false;
        }

    }
    public void moveDragon(){
        boolean touchingWall = this.isTouching(Wall.class)||this.isTouching(Wall2.class) || this.isTouching(Pillar.class);

        //if(!touchingWall){
            if (dragon == true){

                if(this.getX() < getWorldOfType(Level3.class).getPlayer().getX()){
                    deltaX = speed;
                }
                else if (this.getX() > getWorldOfType(Level3.class).getPlayer().getX()){
                    deltaX = -speed;
                }
                if(this.getY() < getWorldOfType(Level3.class).getPlayer().getY()){
                    deltaY = speed;
                }
                if(this.getY() > getWorldOfType(Level3.class).getPlayer().getY()){
                    deltaY = -speed;
                }
            }           
        //}
        /*else if(touchingWall){
            if(deltaY==-speed){
                deltaY = speed;
            }
            if(deltaX==-speed){
                deltaX = speed;
            }
            if(deltaY==speed){
                deltaY = -speed;
            }
            if(deltaX==speed){
                deltaX = -speed;
            }
        }*/
        setLocation(getX() + deltaX, getY() + deltaY);
    }
    public void playerAttack(){
        if(getWorldOfType(Level3.class).getPlayer().getX() <= this.getX()+300 ||getWorldOfType(Level3.class).getPlayer().getX() <= this.getX()-300){ 

            if(Greenfoot.mouseClicked(this)){
                this.setImage(damage);
                this.health-=getWorldOfType(Level3.class).getPlayer().attack();
            }
        }
    }
    public void hitPlayer(){
        if(this.isTouching(Player.class)){
            getWorldOfType(Level3.class).getPlayer().damage();
        }
    }
    public void dragonDied(){
        if(this.health <=0){
            Greenfoot.setWorld(new Win());
        }
    }
}
