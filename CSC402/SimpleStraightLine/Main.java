import java.util.HashMap;

public class Main {
	static HashMap <String, Integer> st=new HashMap<String,Integer>();
	public static void main(String args[])	 {
		Prog.prog.accept(new ASTVistorEX());
	
		 
	}
}
