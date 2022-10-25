//package beforevisitor;

public class Wheel implements CarElement {
	public int year = 2011;
	public String role = "support tires";
	public String color = "red";

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
