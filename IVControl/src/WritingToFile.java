import java.io.*;

public class WritingToFile 
	{
    public static void main(String [] args) 
    	{
        // The name of the file to open.
        String fileName = "Tracking.txt";
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
            bufferedWriter.write(Customer.items.get(i).getName() + "has been reordered.  Amount was increase by 15.");
            bufferedWriter.newLine();
            

            // Always close files.
            bufferedWriter.close();
            System.out.println("Test");
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
            System.out.println("Test");
        	}
        
        catch(IOException ex) 
        	{
            System.out.println("Error writing to file '" + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        	}
    	}
	}



