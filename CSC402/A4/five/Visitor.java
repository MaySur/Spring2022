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
	void visit(CompoundStm s) {
		s.stm1.accept(this);
		System.out.print(" ; ");
		s.stm2.accept(this);
	}
	void visit(AssignStm s) {		
		System.out.print(s.id);
		System.out.print(" := ");
		s.exp.accept(this);		
	}
	void visit(PrintStm s) {		
		System.out.print("print( ");
		s.exps.accept(this);	
		System.out.print(" )");		
	}
	void visit(IdExp s) {		
		System.out.print(s.id);		
	}
	void visit(NumExp s) {		
		System.out.print(s.num);		
	}
	void visit(OpExp s) {
		s.left.accept(this);	
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
		s.right.accept(this);
	}
	void visit(EseqExp s) {		
		System.out.print("( ");
		s.stm.accept(this);
		System.out.print(" , ");
		s.exp.accept(this);
		System.out.print(" )");
	}
	void visit(PairExpList s) {
		s.head.accept(this);		
		System.out.print(" , ");
		s.tail.accept(this);
	}
	void visit(LastExpList s) {
		s.head.accept(this);	
	}
	







	
	
	//
	//---------------------------------------------------------------------	
}