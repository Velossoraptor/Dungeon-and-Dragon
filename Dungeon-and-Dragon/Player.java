import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    int deltaX = 0;
    int deltaY = 0;
    int speed = 5;
    
    
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
}
