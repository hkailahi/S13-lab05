package edu.ucsb.cs56.S13.drawings.hkailahi.advanced;

import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes

// all imports below this line needed if you are implementing Shape
import java.awt.geom.Point2D; 
import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import java.awt.geom.PathIterator;
import java.awt.geom.AffineTransform;

import edu.ucsb.cs56.S13.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.S13.drawings.utilities.GeneralPathWrapper;
/**
   A swing with a box
      
   @author Heneli
   @version for CS56, S13, UCSB, 05/19/2013
   
*/
public class SwingWithBox extends Swing implements Shape
{
    /**
     * Constructor for objects of class SwingWithBox
     */
    public SwingWithBox(double x, double y, double width, double height, double lensRadius)
    {
	// construct the basic cart shell
	super(x,y,width,height,lensRadius);

	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();

	// Make box
	//

	double boxX = 0.50 * width;
	double boxWd = 0.50 * boxX;
	double boxHt =  0.50 * height;

	Rectangle2D.Double box = new Rectangle2D.Double(x + boxX, y - boxHt, boxWd, boxHt);


	// add the bags to the cart
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")

        GeneralPath wholeSwing = this.get();
        wholeSwing.append(box, false);
    }

}
