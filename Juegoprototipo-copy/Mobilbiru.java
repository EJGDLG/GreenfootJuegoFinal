import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * En este apartado lo que se busca es la colición contra el jugador y la 
 * velocidad de los obstaculos, que es lo que le da su nivel de dificultad alto
 * en los reflejos del jugador.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mobilbiru extends Pendukung
{
    /**
     * Act - do whatever the Mobilbiru wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int speed = 5;
    public void act()
    {
        Mobilbiru a = new Mobilbiru();
        Actor i = getOneIntersectingObject(Mobilbiru.class);
        move(speed);
        checkdouble(i);
        end();
    }
}
