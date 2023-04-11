public class Reorder
	{
	public static int storeAccount = 100000;
		
	
	public static void reorder()
		{
		 
		
		for(int i = 0; i < Customer.items.size(); i++) 
			{  
			
			if(Customer.items.get(i).getAmount() <= 3)
				{
				double wholesale = Customer.items.get(i).getWholesaleCost() * 15;
				if(storeAccount > wholesale)
					{
					Customer.items.get(i).setAmount(Customer.items.get(i).getAmount() + 15);
					WritingToFile.reorderWrite(i);
					Reorder.storeAccount -= wholesale;
					}
				else
					{
					WritingToFile.noMoney(i);
					
					}
				}
			}
		}
	
	}
