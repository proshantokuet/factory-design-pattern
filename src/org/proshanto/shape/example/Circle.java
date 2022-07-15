package org.proshanto.shape.example;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class Circle  extends JFrame implements Shape {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void draw(int x,int y,int height,int width) {
		setTitle("Drawing a circle");
        setSize(width, height);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
    public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.red);
        g2d.drawRoundRect(40, 50, 90, 90, 200, 200);
    }

}
