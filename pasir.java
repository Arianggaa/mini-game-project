import greenfoot.*;

/**
 * Write a description of class pasir here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pasir extends World
{

    /**
     * Constructor for objects of class pasir.
     * 
     */
    public pasir()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1095, 600, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        roket roket = new roket();
        addObject(roket, 80, 74);
        aligator aligator = new aligator();
        addObject(aligator, 622, 332);
        roket.setRotation(90);
        aligator.setLocation(466, 550);
        roket.setLocation(69, 78);
        roket roket2 = new roket();
        addObject(roket2, 373, 93);
        roket2.setRotation(90);
        roket2.setLocation(630, 131);
        roket2.setLocation(690, 236);
        roket roket3 = new roket();
        addObject(roket3, 399, 160);
        roket3.setRotation(90);
        roket roket4 = new roket();
        addObject(roket4, 930, 336);
        roket4.setRotation(90);
        roket roket5 = new roket();
        addObject(roket5, 245, 131);
        roket5.setRotation(90);
        roket roket6 = new roket();
        addObject(roket6, 519, 176);
        roket6.setRotation(90);
        roket roket7 = new roket();
        addObject(roket7, 1024, 346);
        roket7.setRotation(90);
        roket2.setLocation(859, 270);
        roket6.setLocation(321, 185);
        roket5.setLocation(220, 116);
        roket5.setLocation(205, 108);
        roket6.setLocation(299, 190);
    }
}
