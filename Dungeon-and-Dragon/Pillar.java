import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pillar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pillar extends Actor
{
    /**
     * Act - do whatever the Pillar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage img = getImage(); 
        img.clear();
        img.setColor(Color.RED);
        img.drawRect(0,0,100,100); 
        img.fillRect(0,0,100,100);
        img.scale(30, 30);
        setImage(img);     
    }
}
