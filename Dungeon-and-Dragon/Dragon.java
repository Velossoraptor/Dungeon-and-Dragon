import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dragon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dragon extends Actor
{
    /**
     * Act - do whatever the Dragon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        boolean dragon = true;
        int health = 15;
        int deltaX = 0;
        int deltaY = 0;
       
        
        //java.util.List<Player> playerInLevel = getWorld().getObjects(Player.class);
        setLocation(getObjects(Player.class).getX(), getObjects(Player.class).getY());
       // if (!playerInLevel.isEmpty()) {
       //     setLocation(getWorld(Player()).getX(), Player.getY());
       // }
       //getWorld(MyWorld).
    }
}
