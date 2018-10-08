package sci.writer.java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import sci.toplogic.java.TopCriteria;
import sci.toplogic.java.TopLogic;

public class TopWriter {
public void createObjects() throws IOException {
	TopLogic a = new TopLogic();
	List<TopCriteria> bestSelling = a.getBestSellingProducts();
	List<TopCriteria> returningCustumers =a.getReturningCustomers();
	List<TopCriteria> topCustomers =a.getTopCustomers();
	BufferedWriter writer = writeBestSelling(bestSelling);
	 writeTopReturningCustomers(returningCustumers, writer);
	 writeTopCustomers(topCustomers, writer);
	     
	    try {
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

public void writeTopCustomers(List<TopCriteria> topCustomers, BufferedWriter writer) throws IOException {
	writer.append(' ');
	 writer.append("Top Customers:\n");
	 for(int i = 0; i<topCustomers.size();i++)
	    
	    try {
	    	
			writer.append(topCustomers.get(i).getTopNumber()+" " +topCustomers.get(i).getName()+"-"+topCustomers.get(i).getCriteria()+"$"+"\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

public void writeTopReturningCustomers(List<TopCriteria> returningCustumers, BufferedWriter writer) throws IOException {
	writer.append(' ');
	 writer.append("Top Returning Customers:\n");
	 for(int i = 0; i<returningCustumers.size();i++)
	    
	    try {
	    	
			writer.append(returningCustumers.get(i).getTopNumber()+" " +returningCustumers.get(i).getName()+"-"+returningCustumers.get(i).getCriteria()+"orders"+"\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

public BufferedWriter writeBestSelling(List<TopCriteria> bestSelling) throws IOException {
	String fileName = "Top.txt";
	 BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
	 writer.append(' ');
	 writer.append("Best Selling Products:\n");
	 for(int i = 0; i<bestSelling.size();i++)
	    
	    try {
	    	
			writer.append(bestSelling.get(i).getTopNumber()+" " +bestSelling.get(i).getName()+"-"+bestSelling.get(i).getCriteria()+"units"+"\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return writer;
}
}

