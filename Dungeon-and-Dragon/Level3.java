import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{
    public Player player;
    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Level3(World source)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        player = ((Level2)source).getPlayer();
        addObject(player, 0, 200);
        generateMap();
    }
    public void generateMap(){
        addObject(new Pillar(), 100,100);
        addObject(new Pillar(), 100, player.getWorld().getHeight()-100);
        addObject(new Pillar(), player.getWorld().getWidth()-100, 100);
        addObject(new Pillar(), player.getWorld().getWidth()-100, player.getWorld().getHeight()-100);
    }
    
    public Player getPlayer(){
        return player;
    }
}
