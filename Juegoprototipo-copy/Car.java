import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * En este apartado lo que se hizo fue ver el tipo de carro , su colición, el 
 * de puntuaje que obtendra.
 * @author (Manuel.u81) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    int score = 0;
    public void act()
    {
        getWorld().showText("Score : " + score, 70, 40);
        checkKey();
        end();
        addscore();
    }

    public void checkKey () {
        if(Greenfoot.isKeyDown("up")){
             if(getY() > 300)
            setLocation(getX(), getY()-4);
        }
        if(Greenfoot.isKeyDown("down")){
             if(getY() < 640)
            setLocation(getX(), getY()+4);
        }
        if(Greenfoot.isKeyDown("left")){
            if(getX() >80)
            setLocation(getX()-4, getY());
        }
        if(Greenfoot.isKeyDown("right")){
             if(getX() <520)
            setLocation(getX()+4, getY());
        }
    }
    public void end(){
    if(isTouching(Mobilbiru.class)){
       getWorld().showText("Game Over \n Score : " + score, 400,400); 
       Greenfoot.stop();
    }
    }
    public void addscore(){
       if(isTouching(Koin.class)){
       score = score + 15 ;
       removeTouching(Koin.class);
    }
}
}
