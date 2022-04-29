import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Door extends Actor
{
    private String file;
    public void act()
    {
        collisonDetection();
    }
    
    public Door(String file)
    {
        this.file = file;
    }
    
    public void collisonDetection()
    {
        Actor turtle = getOneIntersectingObject(turtle.class);
        if(turtle != null){
            getWorld().removeObject(turtle);
            if(file.equals("one"))
                ((MyWorld)getWorld()).roomChange1();
            else if(file.equals("two"))
                ((MyWorld)getWorld()).roomChange2();
            getWorld().removeObject(this);
        }
    }
}
