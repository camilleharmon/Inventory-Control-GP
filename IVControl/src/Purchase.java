
public class Purchase {
	
	private String name;
	private int purchasedCount;
	private double cost;

	public Purchase(String n, int pc, double c)
	{
		setName(n);
		setPurchasedCount(pc);
		setCost(c);
	}
	
	public String getName()
		{
			return name;
		}
	public void setName(String name)
		{
			this.name = name;
		}

	public int getPurchasedCount() {
		return purchasedCount;
	}

	public void setPurchasedCount(int purchasedCount) {
		this.purchasedCount = purchasedCount;
	}
	
	public void incPurchasedCount() {
		this.purchasedCount++;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
}
