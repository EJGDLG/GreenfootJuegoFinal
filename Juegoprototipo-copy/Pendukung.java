import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pendukung here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pendukung extends Actor
{
    /**
     * Act - do whatever the Pendukung wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public void end(){
        if(getY() >= 588||getY() <=0){
           getWorld().removeObject(this);
        }
    }
    
    public void checkdouble(Actor i){
       if(i!= null){
          getWorld().removeObject(i);
       }
    }
    
    public void move(int speed){
       setLocation(getX(), getY() + speed);
    }
}
    
    
    
    

