import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fliege here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fliege extends Actor
{
    /**
     * Act - do whatever the Fliege wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Fliege drehen
        int grad = Greenfoot.getRandomNumber(360);
        setRotation(grad);
        
        // Fliege bewegen
        int schritte = Greenfoot.getRandomNumber(3);
        move(schritte);
    }    
}
