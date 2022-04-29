import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class turtle extends Actor
{
    /**
     * Act - do whatever the turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean sprint;
    boolean notPressed;
    int speed;    
    
    public void act()
    {
        movement();
    }
    
    public void movement()
    {
        if(Greenfoot.isKeyDown("Right") || Greenfoot.isKeyDown("D")){
            setRotation(0);
            move(speed);
        }
        if(Greenfoot.isKeyDown("Down") || Greenfoot.isKeyDown("S")){
            setRotation(90);
            move(speed);
        }
        if(Greenfoot.isKeyDown("LEFT") || Greenfoot.isKeyDown("A")){
            setRotation(180);
            move(speed);
        }
        if(Greenfoot.isKeyDown("UP") || Greenfoot.isKeyDown("W")){
            setRotation(270);
            move(speed);
        }
        if(Greenfoot.isKeyDown("UP") && Greenfoot.isKeyDown("RIGHT") || Greenfoot.isKeyDown("w") && Greenfoot.isKeyDown("d")){
            setRotation(315);
        }
        if(Greenfoot.isKeyDown("UP") && Greenfoot.isKeyDown("LEFT") || Greenfoot.isKeyDown("w") && Greenfoot.isKeyDown("a")){
            setRotation(225);
        }
        if(Greenfoot.isKeyDown("DOWN") && Greenfoot.isKeyDown("RIGHT") || Greenfoot.isKeyDown("s") && Greenfoot.isKeyDown("d")){
            setRotation(45);
        }
        if(Greenfoot.isKeyDown("Down") && Greenfoot.isKeyDown("LEFT") || Greenfoot.isKeyDown("s") && Greenfoot.isKeyDown("a")){
            setRotation(135);
        }
        if(Greenfoot.isKeyDown("shift") && notPressed){
            sprint = !sprint;
            notPressed = false;
            //System.out.print(sprint);
        }
        else if(!Greenfoot.isKeyDown("shift")){
            notPressed = true;
        }
        if(sprint)
            speed = 5;
        else
            speed = 2;
    }
    
    public int getLocation()
    {
        return 0;
    }
}
