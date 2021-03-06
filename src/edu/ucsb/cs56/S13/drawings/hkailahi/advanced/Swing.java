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
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.S13.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.S13.drawings.utilities.GeneralPathWrapper;

public class Swing extends GeneralPathWrapper implements Shape
{

    public Swing(double x, double y, double width, double height, double lensRadius)
    {
	double chainXLength = .25*width;
	double chainYLength = height;



 	//make seat

	Rectangle2D.Double seat = new Rectangle2D.Double(x, y, width, height);

	//make the chains

	Line2D.Double leftChain = new Line2D.Double(x, y, x - chainXLength, y - chainYLength); 
	Line2D.Double rightChain = new Line2D.Double(x + width, y, x + width + chainXLength, y - chainYLength);

	GeneralPath wholeSwing = this.get();
        wholeSwing.append(seat, false);
        wholeSwing.append(leftChain, false);
        wholeSwing.append(rightChain, false); 

        
    }

}
