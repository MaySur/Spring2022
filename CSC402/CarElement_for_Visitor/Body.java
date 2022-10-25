//package beforevisitor;

public class Body implements CarElement {
	public int year = 2008;
	public String role = "protect passengers";
	public String color = "green";
	
	public void repair(RepairVisitor rv) {
		rv.repair(this);
	}

	public void purchase(PurchaseVisitor pv) {
		pv.purchase(this);
	}

	public void paint(PaintVisitor pav) {
		pav.paint(this);
	}
}
