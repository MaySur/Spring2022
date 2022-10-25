abstract class Stm {
	abstract void accept (ASTVisitor v);
	abstract void interprete();
	
}

class CompoundStm extends Stm {
	Stm stm1, stm2;

	CompoundStm(Stm s1, Stm s2) {
		stm1 = s1;
		stm2 = s2;
	} 
	void interprete(){
		stm1.interprete();
		stm2.interprete();

	}


	void accept(ASTVisitor v){
		v.visit(this);
		stm1.accept(v);
		stm2.accept(v);
	}
}

class AssignStm extends Stm {
	String id;
	Exp exp;

	AssignStm(String i, Exp e) {
		id = i;
		exp = e;
	} 
	void accept(ASTVisitor v){
		v.visit(this);
		exp.accept(v);
	}
	void interprete(){
		Main.st.put(new String(id),new Integer(exp.interprete());
		
	}
}

class PrintStm extends Stm {
	Exp exp;

	PrintStm(Exp e) {
		exp = e;
	}
	void accept(ASTVisitor v){
		v.visit(this);
		exp.accept(v);
	} 
	void interprete(){
		System.out.println(exp.interprete());
		
	}
	
}

abstract class Exp {
	abstract void accept (ASTVisitor v);
	abstract int interprete();


}

class IdExp extends Exp {
	String id;

	IdExp(String i) {
		id = i;
	}	
	void accept(ASTVisitor v){
		v.visit(this);

	} 
	int interprete(){
		Main.st.get(id);
		return i.intValue();
	}
	
	 
}

class NumExp extends Exp {
	int num;

	NumExp(int n) {
		num = n;
	}
	void accept(ASTVisitor v){
		v.visit(this);
	}
		
	 
}

class OpExp extends Exp {
	Exp left, right;
	int oper;
	final static int Plus = 1, Minus = 2, Times = 3, Div = 4;

	OpExp(Exp l, int o, Exp r) {
		left = l;
		oper = o;
		right = r;
	} 
	void accept(ASTVisitor v){
		v.visit(this);
		left.accept(v);
		right.accept(v);
	} 
	int interprete(){
		int l = left.interprete();
		int r = right.interprete();
		switch(oper){
			case Plus: return l+r;
			case Minus: return l-r;
			case Div: return l/r;
		}
		return -1;
		
	}
}
