package org.proshanto.shape.example;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class Rectangle extends JFrame implements Shape{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public void draw(int x,int y, int height, int width) {
		setTitle("Rectangle is Drawing..");
        setSize(width, height);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	
	@Override
	  public void paint(Graphics graphics) {
	    graphics.drawRect(100, 100, 200, 200);
	  }
	
}
