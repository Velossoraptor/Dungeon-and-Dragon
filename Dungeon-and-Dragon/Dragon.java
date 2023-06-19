import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dragon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dragon extends Actor

{
    boolean dragon = true;
        int health = 15;
        int deltaX = 0;
        int deltaY = 0;
        int speed = 3;
        GreenfootImage dragonImage = new GreenfootImage("Dragon.png");
    /**
     * Act - do whatever the Dragon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
      setImage(dragonImage);  
       
        
    //java.util.List<Player> playerInLevel = getWorld().getObjects(Player.class);
        if (dragon == true){

        if(this.getX() < Player.getX()){
            deltaX = speed;
        }
        else if (this.getX() > Player.getX()){
            deltaX = -speed;
        }
        if(this.getY() < Player.getY()){
            deltaY = speed;
        }
        if(this.getY() > Player.getY()){
            deltaY = -speed;
        }
        
        
    }
    if (dragon == false){
        setLocation(0, 0);
    }
    
    if (health == 0){
        dragon = false;
    }
    else if (health == 15){
        dragon = true;
    }
    else if (health < 15){
        dragon = true;
    }
}
}
