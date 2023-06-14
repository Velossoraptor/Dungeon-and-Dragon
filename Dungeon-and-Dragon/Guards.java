import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Guards here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Guards extends Actor
{
     boolean guards = true;
     int health = 10;
     int deltaX = 0;
     int deltaY = 0;
     boolean goingDown = true;
    /**
     * Act - do whatever the Guards wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
       
        
        guardMove(goingDown, guards);
        
            
        // >= getWorld().getHeight() - 10
           
            
        }
        public boolean guardMove(boolean goingDown, boolean guards){

  if(goingDown){
                
                if (getY() >= getWorld().getHeight() - 10){
                
                goingDown = false;                
                }
                //setLocation(getX(), getY() + 10);
                deltaY = 5;
            }
  else if(!goingDown){
                
                if (getY() < getWorld().getHeight() + 10){
                    
                    goingDown = true;
                }
                //setLocation(getX(), getY() - 10);
                deltaY = -5;
            }
    
    setLocation(getX()+deltaX, getY()+deltaY);
    return goingDown;
}
}

