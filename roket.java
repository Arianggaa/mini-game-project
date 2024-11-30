import greenfoot.*;

/**
 * Write a description of class roket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class roket extends Actor
{
    public static int y;
    public static int score = 0;
    /**
     * Act - do whatever the roket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(10);
        if(getY()>555){
            setLocation(Greenfoot.getRandomNumber(1090),0);
            score++;
            getWorld().showText("Score Aligator = " + score, 100,200);
        }
        y = getY();
    }    
}
