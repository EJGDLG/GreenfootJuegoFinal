import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends World
{
    public background()
    {    
        // Cree un mundo nuevo con celdas de 600x800 con un tamaño 
        //de celda de 1x1 píxeles.
        super(600, 700, 1); 
        prepare();
    }

    private void prepare() {
        //El actor es decir el dinosario emperazara en la posicion 300,620 del area
        Car car = new Car();
        addObject(car,300,620);
    }

    public void act(){
        if(Greenfoot.getRandomNumber(100)<1){
        addObject(new Mobilbiru(), Greenfoot.getRandomNumber(200) + 30, 0);
        }
        if(Greenfoot.getRandomNumber(100)<1){
        addObject(new Koin(), Greenfoot.getRandomNumber(200) + 30, 0);
        }
    }
}
