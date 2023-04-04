import java.io.*;

public class WritingToFile 
	{
    public static void main(String [] args) 
    	{
        // The name of the file to open.
        String fileName = "Tracking.txt";
        
    	}
    
    public static void reorderWrite(String fileName)
    	{
    	try {
            // Assume default encoding.
            FileWriter fileWriter = new FileWriter(fileName, true);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Note that write() does not automatically
            // append a newline character.
            bufferedWriter.write("Hello there,");
            bufferedWriter.write(" here is some text.");
            bufferedWriter.newLine();
            bufferedWriter.write("We are writing");
            bufferedWriter.write(" this text to the file.");

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



