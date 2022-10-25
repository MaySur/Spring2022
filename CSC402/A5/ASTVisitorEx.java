/**
 * CSC 402-02 Assignment #4
 * 
 * On my honor, Mayur Suresh, this assignment is my own work.  
 * I, Mayur Suresh, will follow the instructor's rules and processes 
 * related to academic integrity as directed in the course syllabus.
 *
 */

package p.actions;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.TypeDeclaration; 

public class ASTVisitorEx extends ASTVisitor {
 
	private String vName, sName;
	@Override
	public boolean visit(TypeDeclaration node) {
		String first = node.getName().getIdentifier();
		String name = node.resolveBinding().getSuperclass().getName();
		
		vName = first;
		this.sName = name;
		return true;
	}
	public String getSName() {return sName;}
	public String getVName() {return vName;}

	

	
}
