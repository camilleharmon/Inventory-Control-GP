public class Inventory
	{
		private String SKU;
		private String name;
		private int amount;
		private double retailCost;
		private double wholesaleCost;

		public Inventory(String s, String n, int a, double r, double w)
		{
			setSKU(s);
			setName(n);
			setAmount(a);
			setRetailCost(r);
			setWholesaleCost(w);
		}
		public String getSKU() 
			{
				return SKU;
			}
		public void setSKU(String SKU)
			{
				this.SKU = SKU;
			}
		
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		
		public int getAmount()
			{
				return amount;
			}
		public void setAmount(int amount)
			{
				this.amount = amount;
			}
		public int decAmount()
			{
				this.amount--;
				
				return(this.amount);
			}
		
		public double getRetailCost()
			{
				return retailCost;
			}

		public void setRetailCost(double retailCost)
			{
				this.retailCost = retailCost;
			}

		public double getWholesaleCost()
			{
				return wholesaleCost;
			}

		public void setWholesaleCost(double wholesaleCost)
			{
				this.wholesaleCost = wholesaleCost;
			}

		
	}