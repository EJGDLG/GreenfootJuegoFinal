import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Lo que se buscó cocnseguir es el modelo de la moneda que dará el puntuaje y 
 * pueda ser interactiva para el usuario.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Koin extends Pendukung
{
    int speed = 5;
    public void act()
    {
        Koin a = new Koin();
        Actor i = getOneIntersectingObject(Koin.class);
        move(speed);
        checkdouble(i);
        end();
    }
}
