import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private static turtle main = new turtle();
    private static Door door;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        setUp();
    }
    
    public void setUp()
    {
        addObject(main,300,200);
        door = new Door("two");
        addObject(door, 570, 200);
        setBackground("TwistedBridges2.jpg");
    }
    
    public void roomChange1()
    {
        addObject(main, 500, 200);
        door = new Door("two");
        addObject(door, 570, 200);
        setBackground("TwistedBridges2.jpg");
    }
    
    public void roomChange2()
    {
        addObject(main, 100, 200);
        door = new Door("one");
        addObject(door, 30, 200);
        setBackground("SafeShallows2.jpg");
    }
}
