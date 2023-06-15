import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    public Player player;
    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2(World source)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(600, 400, 1); 
        player = ((MyWorld)source).getPlayer();
        addObject(player, 0, 200);
    }
    
    public Player getPlayer(){
        return player;
    }
}
