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
	void prettyprint(CompoundStm s) {
		s.stm1.prettyprint();
		System.out.print(" ; ");
		s.stm2.prettyprint();
	}
	void prettyprint(AssignStm s) {		
		System.out.print(s.id);
		System.out.print(" := ");
		s.exp.prettyprint();		
	}
	void prettyprint(PrintStm s) {		
		System.out.print("print( ");
		s.exps.prettyprint();	
		System.out.print(" )");		
	}
	void prettyprint(IdExp s) {		
		System.out.print(s.id);		
	}
	void prettyprint(NumExp s) {		
		System.out.print(s.num);		
	}
	void prettyprint(OpExp s) {
		s.left.prettyprint();	
		System.out.print(" ");
		switch(s.oper) {
		case OpExp.Plus:
			System.out.print("+");
			break;
		case OpExp.Minus:
			System.out.print("-");
			break;
		case OpExp.Times:
			System.out.print("*");
			break;
		case OpExp.Div:
			System.out.print("/");
			break;
		}
		System.out.print(" ");
		s.right.prettyprint();
	}
	void prettyprint(EseqExp s) {		
		System.out.print("( ");
		s.stm.prettyprint();
		System.out.print(" , ");
		s.exp.prettyprint();
		System.out.print(" )");
	}
	void prettyprint(PairExpList s) {
		s.head.prettyprint();		
		System.out.print(" , ");
		s.tail.prettyprint();
	}
	void prettyprint(LastExpList s) {
		s.head.prettyprint();	
	}







	
	
	//
	//---------------------------------------------------------------------	
}