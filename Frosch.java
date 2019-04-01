import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Frosch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frosch extends Actor
{
    /**
     * Act - do whatever the Frosch wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
            move(1);
        } else if (Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
            move(1);
        } else if (Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
            move(1);
        } else if (Greenfoot.isKeyDown("up"))
        {
            setRotation(270);
            move(1);
        }
        
        Actor fliege = getOneIntersectingObject(Fliege.class);
        World world = getWorld();
        if (fliege != null)
        {
            world.removeObject(fliege);
            Greenfoot.playSound("eat.wav");
        }
        
        world.showText("Verbleibende Fliegen: " +
            world.getObjects(Fliege.class).size(), world.getWidth() / 2, 1);
    }    
}
