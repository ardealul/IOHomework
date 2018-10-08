package sci.toplogic.java;

import java.io.FileNotFoundException;
import java.io.IOException;

import sci.reader.java.SalesReader;
import sci.writer.java.TopWriter;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
	SalesReader b = new SalesReader();
	System.out.println(b.fileLocation());
	TopLogic a = new TopLogic();
	System.out.println(a.getBestSellingProducts());
	System.out.println(a.getReturningCustomers());
	System.out.println(a.getTopCustomers());
	TopWriter c = new TopWriter();
	c.createObjects();
	}

}
