public class Reorder
	{
		public static void main(String[] args) {
	      reorder(); 

	    }	
	
	public static void reorder()
		{
		String fileName = "Tracking.txt";
		int storeAccount = 10000;
		for(int i = 0; i < Customer.items.size(); i++)
			{
			if(Customer.items.get(i).getAmount() < 10000)
				{
				double wholesale = Customer.items.get(i).getWholesaleCost() * 15;
				System.out.println(wholesale);
				if(storeAccount < wholesale)
					{
					Customer.items.get(i).setAmount(Customer.items.get(i).getAmount() + 15);
					
					WritingToFile.reorderWrite(fileName);
					}
				}
			}
		}
	
	}
