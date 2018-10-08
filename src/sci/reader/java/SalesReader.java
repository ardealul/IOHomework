package sci.reader.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import sci.sales.java.Sales;



	

public class SalesReader {
	

	public List<Sales> fileLocation() throws FileNotFoundException, IOException {
		File f = new File("C:\\Users\\Muntea\\eclipse-workspace\\IO Homework scoalainformala\\src\\sales.csv");
		if(!f.exists()) {
			System.out.println("File "+f.getName()+ " does not exists.");
		}
		FileReader fr = new FileReader(f);
		List<Sales> sales =  new SalesReader(fr).getSales();
		return sales;
	}
	
	private Reader reader;
	public SalesReader() {
		this.reader = reader;
	}

	public SalesReader(Reader reader) {
		this.reader = reader;
	}

	 List<Sales> getSales() throws IOException { 
	    	List<Sales> sales = new ArrayList<Sales>();
	    	BufferedReader br = new BufferedReader(reader);
	    	String line=null;
	       try{
	    	   line = br.readLine();
	        while (line != null) {
	            sales.add(parseSales(line));
	            line = br.readLine();
	        }br.close();
	       } finally{ return sales;}
	       
	    }

	private Sales parseSales(String line) {
		String[] tokens = line.split(",");
		return new Sales(Integer.parseInt(tokens[0]),tokens[1],Float.parseFloat(tokens[2]),tokens[3]);
	}
}
