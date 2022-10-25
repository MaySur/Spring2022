

public class Visitor {
    private Visitor(){}
    private static Visitor instance = null;
    public static Visitor getInstance(){
        if(instance == null) instance = new Visitor();
        return instance;

    }







    
    

    public void visit(Square S) {
		System.out.println("draw() in Square");
	}
    public void visit(Circle C) {
		System.out.println("draw() in Circle");
	}
    public void visit(Triangle T) {
		System.out.println("draw() in Triangle");
	}  
   
}
