package lab7;
import java.io.*;
import java.io.IOException; 
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		FileInputStream in = null;
	    FileOutputStream out = null;
	    int i=0;
		// Confirm command-line parameters
		if (args.length < 2)
		{
			System.out.println("Error - Expected usage: ./main input.txt output.txt");
		}
		try{
		    in = new FileInputStream(args[0]);
		    out = new FileOutputStream(args[1]);
		
		    //process commands
		    int n;
		    Scanner s = new Scanner(in);
	         //this will read input file until the end
	         while(s.hasNextInt()) {
	         //i now how our number
	        	 System.out.print(s.nextInt() + "\n");
	         }
		
		}
		finally{
			//if this stuff exists, we need to close it
			if(in != null){in.close();}
			if(out != null){out.close();}
		}
	}
}
