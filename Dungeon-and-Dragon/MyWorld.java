import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public Player player = new Player();

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(player, 0, 0);
        generateMap();
        //nextLevel();
    }
    
    public Player getPlayer(){
        return player;
    }
    
    public void generateMap(){
        addObject(new Wall(), 150, 100);
        addObject(new Wall(), 450, 100);
        addObject(new Wall(), 150, 300);
        addObject(new Wall(), 450, 300);
        addObject(new Wall2(), 150, 25);
        addObject(new Wall2(), 450, 25);
        addObject(new Wall2(), 150, 375);
        addObject(new Wall2(), 450, 375);
    }

}
