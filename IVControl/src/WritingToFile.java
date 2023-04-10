import java.io.*;
import java.util.ArrayList;

public class WritingToFile 
	{
    public static void main(String [] args) 
    	{
        // The name of the file to open.
        String fileName = "Tracking.txt";
    	}
    
    public static void writeItemFile(ArrayList <Inventory> items)
	{
	String fileName = "Itemsx.txt";
	try {
        // Assume default encoding.
        FileWriter fileWriter = new FileWriter(fileName, false);

        // Always wrap FileWriter in BufferedWriter.
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

		for(int i = 0; i < items.size(); i++) {
			
			Inventory iv = items.get(i);
			
	        bufferedWriter.write(iv.getSKU());
	        bufferedWriter.write(" ");
	        bufferedWriter.write(iv.getName());
	        bufferedWriter.write(" ");
	        bufferedWriter.write(String.valueOf(iv.getAmount()));
	        bufferedWriter.write(" ");
	        bufferedWriter.write(String.valueOf(iv.getRetailCost()));
	        bufferedWriter.write(" ");
	        bufferedWriter.write(String.valueOf(iv.getWholesaleCost()));
	        
	        bufferedWriter.newLine();
	        
	        bufferedWriter.flush();
		}

        // Always close files.
        bufferedWriter.close();
    	}
    
    catch(IOException ex) 
    	{
        System.out.println("Error writing to file '" + fileName + "'");
        // Or we could just do this:
        // ex.printStackTrace();
    	}
	}
    
    public static void order(Inventory item)
	{
	String fileName = "Tracking.txt";
	try {
        // Assume default encoding.
        FileWriter fileWriter = new FileWriter(fileName, true);

        // Always wrap FileWriter in BufferedWriter.
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        // Note that write() does not automatically
        // append a newline character.
        bufferedWriter.write(item.getName() + " has been ordered at a cost of $"+String.valueOf(item.getRetailCost()));
        bufferedWriter.newLine();
        

        // Always close files.
        bufferedWriter.close();
    	}
    
    catch(IOException ex) 
    	{
        System.out.println("Error writing to file '" + fileName + "'");
        // Or we could just do this:
        // ex.printStackTrace();
    	}
	}
    
    
    
    
    
    
    
    
    
    
    
    
    public static void reorderWrite(int i)
    	{
    	String fileName = "Tracking.txt";
    	try {
            // Assume default encoding.
            FileWriter fileWriter = new FileWriter(fileName, true);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Note that write() does not automatically
            // append a newline character.
            bufferedWriter.write(Customer.items.get(i).getName() + " amount was increase by 15.");
            bufferedWriter.newLine();
            

            // Always close files.
            bufferedWriter.close();
  
        	}
        
        catch(IOException ex) 
        	{
            System.out.println("Error writing to file '" + fileName + "'"); 
            // Or we could just do this:
            // ex.printStackTrace();
        	}
    	}
    
    public static void noMoney(int i)
    	{
    	String fileName = "Tracking.txt";
    	try {
            // Assume default encoding.
            FileWriter fileWriter = new FileWriter(fileName, true);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Note that write() does not automatically
            // append a newline character.
            bufferedWriter.write("There was not enough money to reorder " + Customer.items.get(i).getName());
            bufferedWriter.newLine(); 
            

            // Always close files.
            bufferedWriter.close();

        	}
         
        catch(IOException ex) 
        	{
            System.out.println("Error writing to file '" + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        	}
    	}
	}



