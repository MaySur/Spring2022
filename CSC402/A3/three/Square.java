/**
 * CSC 402-01 Assignment #3
 * 
 * On my honor, <Mayur Suresh>, this assignment is my own work.  
 * I, <Mayur Suresh>, will follow the instructor's rules and processes 
 * related to academic integrity as directed in the course syllabus.
 *
 */

import java.awt.Graphics;
import java.awt.Color;

public class Square implements Shape {
	  DrawingPanel panel = null;
	  Color c = Color.RED;
	  int x = 20;
	  int y = 10;
	  int width = 100;
	  int height = 50;
	
	public Square(DrawingPanel panel) {
		this.panel = panel;
	}
	
	public void draw() {
		Graphics g = panel.getGraphics();
		g.setColor(c);
		g.fillRect(x, y, width, height);
	}
}
