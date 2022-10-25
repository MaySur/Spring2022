//package beforevisitor;

public class Engine implements CarElement {
	public int year = 2017;
	public String role = "convert gasoline into motion";
	public String color = "black";

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
