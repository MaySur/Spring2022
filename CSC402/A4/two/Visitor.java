/**
 * CSC 402-01 Assignment #4
 * 
 * On my honor, <Mayur Suresh>, this assignment is my own work.  
 * I, <Mayur Suresh>, will follow the instructor's rules and processes 
 * related to academic integrity as directed in the course syllabus.
 *
 */

public class Visitor {
	//---------------------------------------------------------------------
	// Fill in your code here

	private Visitor(){}

	private static Visitor instance = null;

	public static Visitor getInstance(){
		if (instance == null) instance = new Visitor	();
		return instance;
	}
	//
	//---------------------------------------------------------------------	
}
