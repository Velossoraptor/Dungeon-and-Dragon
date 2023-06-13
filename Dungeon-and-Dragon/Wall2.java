import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall2 extends Actor
{
    /**
     * Act - do whatever the Wall2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage img = getImage(); 
        img.clear();
        img.setColor(Color.RED);
        img.drawRect(0,0,9,145); 
        img.fillRect(0,0,9,145);
        img.scale(9, 145);
        setImage(img);    
    }
}
