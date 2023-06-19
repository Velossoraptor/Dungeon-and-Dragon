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
    GreenfootImage Level2Image = new GreenfootImage("pixil-frame-0 (14).png");
    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2(World source)
    
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(600, 400, 1); 
        setBackground(Level2Image);
        player = ((MyWorld)source).getPlayer();
        addObject(player, 0, 200);
        addObject(new Guards(), 119, 30);
        addObject(new Guards(), 381, 370);
        addObject(new Guards(), 419, 30);
        generateMap();
    }
    public void generateMap(){
        addObject(new Wall2(), 100, 50);
        addObject(new Wall2(), 100, 300);
        addObject(new Wall2(), 100, 350);
        addObject(new Wall2(), 250, 50);
        addObject(new Wall2(), 250, 190);
        addObject(new Wall2(), 250, 230);
        addObject(new Wall2(), 400, 350);
        addObject(new Wall2(), 400, 250);
        addObject(new Wall2(), 400, 150);
        addObject(new Wall2(), 550, 50);
        addObject(new Wall2(), 550, 300);
        addObject(new Wall2(), 550, 350);
    }
    public Player getPlayer(){
        return player;
    }
}
