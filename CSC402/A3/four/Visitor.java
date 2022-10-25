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

public class Visitor {
	//---------------------------------------------------------------------
	// Fill in your code here
	private Visitor(){}
	private static Visitor instance = null;
	public static Visitor getInstance(){
		if(instance == null) instance = new Visitor();
		return instance;
	}
	public void visit(Square square) {
		Graphics g = square.panel.getGraphics();
		g.setColor(square.c);
		g.fillRect(square.x, square.y, square.width, square.height);
	}

	public void visit(Circle circle) {
		Graphics g = circle.panel.getGraphics();
		g.setColor(circle.c);
		g.fillOval(circle.x, circle.y, circle.width, circle.height);
	}
	public void visit(Line line) {
		Graphics g = line.panel.getGraphics();
		g.setColor( line.c);
		g.drawLine( line.x1,line.y1, line.x2, line.y2);
	}


	
	
	//
	//---------------------------------------------------------------------	
}
