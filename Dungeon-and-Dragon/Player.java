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
    private int health = 10;
    private int damage = 1;
    
    
    public void act()
    {
        movePlayer();
    }
    
    public void movePlayer(){
        if(Greenfoot.isKeyDown("w")){
            deltaY = -speed;
        }
        if(Greenfoot.isKeyDown("a")){
            deltaX = -speed;
        }
        if(Greenfoot.isKeyDown("s")){
            deltaY = speed;
        }
        if(Greenfoot.isKeyDown("d")){
            deltaX = speed;
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
        //should get equipped item and buff accordingly
    }
}
