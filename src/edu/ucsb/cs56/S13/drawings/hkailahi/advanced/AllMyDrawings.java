package edu.ucsb.cs56.S13.drawings.hkailahi.advanced;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;  // single lines
import java.awt.geom.Ellipse2D;  // ellipses and circles
import java.awt.geom.Rectangle2D; // for the bounding box
import java.awt.Rectangle;  // squares and rectangles
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;


import edu.ucsb.cs56.S13.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.S13.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Heneli Kailahi
 * @version for CS56, lab05, Spring 2013
 */


public class AllMyDrawings
{
    /** Draw a picture with a few swings
     */

public static void drawPicture1(Graphics2D g2) {

	Swing h1 = new Swing(100,250,50,30, 5);
	g2.setColor(Color.CYAN); g2.draw(h1);

	// Make a black swing that's half the size, 
	// and moved over 150 pixels in x direction

	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);

	// Here's a swing that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);

	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       

	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x

	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(h2); 
	
	// Draw two swings with boxes

      	SwingWithBox hw1 = new SwingWithBox(50,50,50,30, 5);
	SwingWithBox hw2 = new SwingWithBox(200,350,50, 30, 5);

	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(hw2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING

	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few shopping carts by Heneli Kailahi", 20,20);
    }


    /** Draw a picture with a few swings
     */
    public static void drawPicture2(Graphics2D g2) {

	// Draw some swings

	Swing large = new Swing(100,50,225,150, 40);
	Swing small = new Swing(20,50,40,30, 3);
	Swing tallSkinny = new Swing(20,150,20,40,3);
	Swing shortFat = new Swing(20,250,40,20,5);

	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(small);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);

	Swing s1 = new Swing(100,250,50,75,5);
	g2.setColor(Color.CYAN); g2.draw(s1);

	
	Shape s2 = ShapeTransforms.scaledCopyOfLL(s1,0.5,0.5);
	s2 = ShapeTransforms.translatedCopyOf(s2,150,0);
	g2.setColor(Color.BLACK); g2.draw(s2);

       
	s2 = ShapeTransforms.scaledCopyOfLL(s2,4,4);
	s2 = ShapeTransforms.translatedCopyOf(s2,150,0);

	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       

	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x

	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(s2); 

	// Draw two swings with boxes
	
	SwingWithBox scg1 = new SwingWithBox(50,350,40,75,5);
	SwingWithBox scg2 = new SwingWithBox(400,80,200,50, 10);

	g2.draw(scg1);
	g2.setColor(new Color(0x8F00FF)); 

	// Rotate the second house 45 degrees around its center.
	Shape hw3 = ShapeTransforms.rotatedCopyOf(scg2, Math.PI/4.0);

	g2.draw(hw3);
       
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING

	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of swings by Heneli Kailahi", 20,20);
    }
  
    /** Draw a different picture with swings
     */

    public static void drawPicture3(Graphics2D g2) {

	// label the drawing

	g2.drawString("A bunch of swings by Heneli Kailahi", 20,20);


	// Draw some swings

       Swing small = new Swing(100,50,40, 20, 5);
       SwingWithBox large = new SwingWithBox(200,200,400, 100,30);
       
       g2.setColor(Color.RED);     g2.draw(large);
       g2.setColor(Color.GREEN);   g2.draw(small);
       
       
    }
    

}
