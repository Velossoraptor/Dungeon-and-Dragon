import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Guards here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Guards extends Actor
{
    /**
     * Act - do whatever the Guards wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        boolean guards = true;
        int health = 10;

        if (guards == true){
            setLocation(getX(), getY() + 10);
           
            
        }
        if (getY() > getWorld().getHeight() - 10)
        {
        }
        if (health == 0){
            guards = false;
        }
        else if (health != 0){
            guards = true;
        }

    }
}
