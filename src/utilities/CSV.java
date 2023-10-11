package utilities;

import java.util.*;
import java.io.*;

public class CSV {
	
	//This method will read data from a CSV file and return as a list
	public static List<String[]> read(String file) {
		List<String[]> data = new LinkedList<String[]>();
		String dataRow;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			try {
				 while((dataRow = br.readLine())!= null) {
				String[] dataRecords = dataRow.split(",");
				data.add(dataRecords);
				 }
				 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("could not find file");
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Could not find the  file");
			e.printStackTrace();
		}
		
		return data ;
	}
	
}
