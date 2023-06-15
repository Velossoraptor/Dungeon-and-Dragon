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
     int speed = 1;
     boolean goingDown = true;
    /**
     * Act - do whatever the Guards wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
       if (guards == true){
        if(goingDown){
                setLocation(getX() + deltaX, getY() + deltaY + 10);
                deltaY = speed;
                
                if (getY() >= getWorld().getHeight() - 10){
                
                goingDown = false;                
                }
                //setLocation(getX(), getY() + 10);
                //deltaY = 5;
                
            }
  else if(!goingDown){
                setLocation(getX() + deltaX, getY() + deltaY - 10);
                deltaY = -speed;
                
                if (getY() < 10){
                    
                    goingDown = true;
                }
                //setLocation(getX(), getY() - 10);
                
            }
    
            
        // >= getWorld().getHeight() - 10
           
    } 
    
    if (health == 0){
        guards = false;
    }
    else if (health == 10){
        guards = true;
    }
    else if (health < 10){
        guards = true;
    }
    
    
        
        

        
}
public void playerAttack(){
        if(player.getX() <= player.speed*2){
            if(Greenfoot.mouseClicked(this)){
                this.health-=player.damage;
            }
        }
    }
}

