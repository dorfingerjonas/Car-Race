import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 50x50 cells with a cell size of 10x10 pixels.
        super(55, 55, 10);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Fliege fliege = new Fliege();
        addObject(fliege,11,10);
        Fliege fliege2 = new Fliege();
        addObject(fliege2,36,21);
        Fliege fliege3 = new Fliege();
        addObject(fliege3,19,25);
        Fliege fliege4 = new Fliege();
        addObject(fliege4,39,43);
        Fliege fliege5 = new Fliege();
        addObject(fliege5,11,42);
        Fliege fliege6 = new Fliege();
        addObject(fliege6,28,7);
        Frosch frosch = new Frosch();
        addObject(frosch,29,34);
    }
}
