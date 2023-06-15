import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private int deltaX = 0;
    private int deltaY = 0;
    private int speed = 5;
    private int health = 60;
    private int damage = 1;
    private Inventory inventory;
    int lastKey = 0;

    public void act()
    {
        movePlayer();
        nextLevel();

    }

    public void movePlayer(){
        boolean touchingWall = this.isTouching(Wall.class)||this.isTouching(Wall2.class) || this.isTouching(Pillar.class);

        //Actor barrier = this.isTouching;
        if(!touchingWall){
            if(Greenfoot.isKeyDown("w")){
                deltaY = -speed;
                lastKey = 1;
            }
            if(Greenfoot.isKeyDown("a")){
                deltaX = -speed;
                lastKey = 2;
            }
            if(Greenfoot.isKeyDown("s")){
                deltaY = speed;
                lastKey = 3;
            }
            if(Greenfoot.isKeyDown("d")){
                deltaX = speed;
                lastKey = 4;
            } 
        }else{
            //if(touchingWall){
            if(lastKey==1){
                deltaY = speed;
            }
            if(lastKey==2){
                deltaX = speed;
            }
            if(lastKey==3){
                deltaY = -speed;
            }
            if(lastKey==4){
                deltaX = -speed;
            } 
            //}
        }

        setLocation(getX() + deltaX, getY() + deltaY);
        deltaX = 0;
        deltaY = 0;

    }
    public int getHealth(){
        return this.health;
    }

    public void damage(){
        health--;
    }

    public void equipped(){
        int plusBuff = inventory.current().buff();
        this.damage+= plusBuff;
    }

    public void attack(Guards guard){
        if(this.getX() - guard.getX() <= 10 || this.getY() - guard.getY() <=10){
            //TODO 
        }
    }

    public void nextLevel(){
        if(this.getX() >=getWorld().getWidth()-15){
            Greenfoot.setWorld(new Level2(getWorld()));
        }
    }
}
