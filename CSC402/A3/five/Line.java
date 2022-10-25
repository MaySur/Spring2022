/**
 * CSC 402-01 Assignment #3
 * 
 * On my honor, Mayur Suresh, this assignment is my own work.  
 * I,  Mayur Suresh, will follow the instructor's rules and processes 
 * related to academic integrity as directed in the course syllabus.
 *
 */

import java.awt.Color;
import java.awt.Graphics;

public class Line implements Shape {
	DrawingPanel panel = null;
	Color c = Color.GREEN;
	int x1 = 50;
	int y1 = 150;
	int x2 = 200;
	int y2 = 50;
	
	public Line(DrawingPanel panel) {
		this.panel = panel;
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
}
