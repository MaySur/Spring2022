public class PaintVisitor {
    private PaintVisitor(){}
    private static PaintVisitor instance = null;

    public static PaintVisitor getInstance(){
        if(instance == null) instance = new PaintVisitor();
        return instance;
    }

    public void paint(Wheel w) {
		System.out.println("The body part was painted in " + w.color);
	}
    public void paint(Engine e) {
		System.out.println("The body part was painted in " + e.color);
	}
    public void paint(Body B) {
		System.out.println("The body part was painted in " + B.color);
	}
    
}
