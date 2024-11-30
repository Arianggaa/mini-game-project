import greenfoot.*;
import javax.swing.JOptionPane;
import javax.swing.JInternalFrame;

/**
 * Write a description of class aligator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class aligator extends Actor
{
    private int nyawa = 9;
    private boolean tabrakan1 = true;
    private boolean tabrakan2 = true;
    private boolean tabrakan3 = true;
    private boolean tabrakan4 = true;
    private boolean tabrakan5 = true;
    private boolean tabrakan6 = true;
    public aligator(){
        //getWorld().showText("Nyawa Aligator = " + nyawa, 100,100);
    }
    /**
     * Act - do whatever the aligator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left")){
            move(-6);
        }
        if(Greenfoot.isKeyDown("right")){
            move(6);
        }
        if(intersects((Actor)getWorld().getObjects(roket.class).get(0))){
            if(tabrakan1){
                nyawa--;
                getWorld().showText("Nyawa Aligator = " + nyawa, 100,100);
                tabrakan1 = false;
            }
        }
        if(roket.y<3) tabrakan1 = true;
        if(intersects((Actor)getWorld().getObjects(roket.class).get(1))){
            if(tabrakan2){
                nyawa--;
                getWorld().showText("Nyawa Aligator = " + nyawa, 100,100);
                tabrakan2 = false;
            }
        }
        if(roket.y<3) tabrakan2 = true;
                if(intersects((Actor)getWorld().getObjects(roket.class).get(2))){
            if(tabrakan3){
                nyawa--;
                getWorld().showText("Nyawa Aligator = " + nyawa, 100,100);
                tabrakan3 = false;
            }
        }
        if(roket.y<3) tabrakan3 = true;
        if(intersects((Actor)getWorld().getObjects(roket.class).get(3))){
            if(tabrakan4){
                nyawa--;
                getWorld().showText("Nyawa Aligator = " + nyawa, 100,100);
                tabrakan4 = false;
            }
        }
        if(roket.y<3) tabrakan4 = true;
        if(intersects((Actor)getWorld().getObjects(roket.class).get(4))){
            if(tabrakan5){
                nyawa--;
                getWorld().showText("Nyawa Aligator = " + nyawa, 100,100);
                tabrakan5 = false;
            }
        }
        if(roket.y<3) tabrakan5 = true;
        if(intersects((Actor)getWorld().getObjects(roket.class).get(5))){
            if(tabrakan6){
                nyawa--;
                getWorld().showText("Nyawa Aligator = " + nyawa, 100,100);
                tabrakan6 = false;
            }
        }
        if(roket.y<3) tabrakan2 = true;
        if(nyawa==0){
            JOptionPane.showMessageDialog(new JInternalFrame(),"game over","kasian",JOptionPane.INFORMATION_MESSAGE);
            Greenfoot.stop();
        } 
    }
}
