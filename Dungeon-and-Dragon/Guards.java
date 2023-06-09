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
        int deltaX = 5;
        int deltaY = 5;
        boolean goingDown = true;

        if (guards == true){
            //setLocation(getX(), getY() + 10);
            if(goingDown){
                setLocation(getX(), getY() + 10);
                if (getY() >= getWorld().getHeight() - 10){
                    goingDown = false;
                
                }
            }
            if(!goingDown){
                setLocation(getX(), getY() - 10);
                if (getY() < 10){
                    goingDown = true;
                    
                }
            }
            
        
           
            
        }
        
        
      //  if (getX() < 10)
      //  {
       //     deltaX = 5;
            
      //  }
      
        if (health == 0){
            guards = false;
        }
        else if (health != 0){
            guards = true;
        }

    }
}
