import java.util.ArrayList;

public class Reorder
	{
	public static int storeAccount = 10000000;
		
	
	public static void reorder(ArrayList <Inventory> items)
		{
		 
		
		for(int i = 0; i < items.size(); i++) 
			{  
			
			if(items.get(i).getAmount() <= 3)
				{
				double wholesale = items.get(i).getRetailCost() * 15;
				if(storeAccount > wholesale)
					{
					items.get(i).setAmount(items.get(i).getAmount() + 15);
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
