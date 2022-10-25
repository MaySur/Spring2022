/**
 * CSC 402-01 Assignment #3
 * 
 * On my honor, <Mayur Suresh>, this assignment is my own work.  
 * I, <Mayur Suresh>, will follow the instructor's rules and processes 
 * related to academic integrity as directed in the course syllabus.
 *
 */

import java.awt.Color;
import java.awt.Graphics;

public class Circle implements Shape {	
	  DrawingPanel panel = null;
	  Color c = Color.BLUE;
	  int x = 20;
	  int y = 70;
	  int width = 50;
	  int height = 50;
	
	public Circle(DrawingPanel panel) {
		this.panel = panel;
	}
	
	public void draw(Visitor v) {
		v.visit(this);
	}
}