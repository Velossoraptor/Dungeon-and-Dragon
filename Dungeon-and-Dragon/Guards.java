import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Guards here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Guards extends Actor
{
    boolean guards = true;
    int health = 2;
    int deltaX = 0;
    int deltaY = 0;
    int speed = 1;
    boolean goingDown = true;
    GreenfootImage guardImage = new GreenfootImage("Guard.png");

    /**
     * Act - do whatever the Guards wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        guardImage.scale(70,70);
        setImage(guardImage);
        if(health>0){
            moveGuard();
        }
        hitPlayer();
        playerAttack();
        if (!guards){
            setLocation(0, 0);
        }

        if (health <= 0){
            guards = false;
        }

    }
    public void playerAttack(){
        if(getWorldOfType(Level2.class).getPlayer().getX() <= this.getX()+150 || getWorldOfType(Level2.class).getPlayer().getX() <= this.getX()-150){ 
            if(Greenfoot.mouseClicked(this)){
                this.health-= 1; //getWorldOfType(Level2.class).getPlayer().attack();
            }
        }
    }

    public void moveGuard(){
        if (guards == true){
            if(goingDown){
                setLocation(getX() + deltaX, getY() + deltaY + 10);
                deltaY = speed;

                if (getY() >= getWorld().getHeight() - 10){

                    goingDown = false;                
                }
                //setLocation(getX(), getY() + 10);
                //deltaY = 5;

            }
            else if(!goingDown){
                setLocation(getX() + deltaX, getY() + deltaY - 10);
                deltaY = -speed;

                if (getY() < 10){

                    goingDown = true;
                }
                //setLocation(getX(), getY() - 10);

            }

            // >= getWorld().getHeight() - 10
        } 
    }
        public void hitPlayer(){
        if(this.isTouching(Player.class)){
            getWorldOfType(Level2.class).getPlayer().damage();
        }
    }
}

