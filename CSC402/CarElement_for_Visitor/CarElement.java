//package beforevisitor;

public interface CarElement {
	public void repair(RepairVisitor rv);

	public void purchase(PurchaseVisitor pv);

	public void paint(PaintVisitor pav);
}
