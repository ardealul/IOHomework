package sci.toplogic.java;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import sci.reader.java.SalesReader;
import sci.sales.java.Sales;

public class TopLogic {
	public List<Sales> getSales() {
		SalesReader salesReader = new SalesReader();
		List<Sales> sales = new ArrayList<Sales>();
		try {
			sales = salesReader.fileLocation();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sales;
	}
	public List<TopCriteria> getBestSellingProducts(){
		List<Sales> sales = getSales();
		List<TopCriteria> bestSelling = new ArrayList<TopCriteria>();
		int contor = 1;
		for(int i=0;i<sales.size();i++) {
			contor=1;
			contor = ammountBought(sales, contor, i); 
			bestSelling.add(new TopCriteria(1, sales.get(i).getProduct(), contor));
		}
		Collections.sort(bestSelling);
		for(int i=0;i<bestSelling.size();i++) {
			bestSelling.get(i).setTopNumber(i+1);
		}
		return bestSelling;
	}
	public int ammountBought(List<Sales> sales, int contor, int i) {
		for(int j=i+1;j<sales.size();j++) {
			 if(sales.get(i).getProduct().equals(sales.get(j).getProduct())) {
		    	   contor++; 
		    	  sales.remove(j);
		    	  j--;
		       }
		}
		return contor;
	}
	public List<TopCriteria> getReturningCustomers(){
		List<Sales> sales = getSales();
		List<TopCriteria> topReturning = new ArrayList<TopCriteria>();
		int contor = 1;
		for(int i=0;i<sales.size();i++) {
			contor=1;
			contor = returnAmmount(sales, contor, i); 
			topReturning.add(new TopCriteria(1, sales.get(i).getClientName(), contor));
		}
		Collections.sort(topReturning);
		for(int i=0;i<topReturning.size();i++) {
			topReturning.get(i).setTopNumber(i+1);
		}
		return topReturning;
	}
	public int returnAmmount(List<Sales> sales, int contor, int i) {
		for(int j=i+1;j<sales.size();j++) {
			 if(sales.get(i).getClientName().equals(sales.get(j).getClientName())) {
		    	   contor++; 
		    	  sales.remove(j);
		    	  j--;
		       }
		}
		return contor;
	}
	public List<TopCriteria> getTopCustomers(){
		List<Sales> sales = getSales();
		List<TopCriteria> topCustomers = new ArrayList<TopCriteria>();
		float moneySpend =0 ;
		for(int i=0;i<sales.size();i++) {
			moneySpend=sales.get(i).getPrice();
			moneySpend = moneySpend(sales, moneySpend, i); 
			topCustomers.add(new TopCriteria(1, sales.get(i).getClientName(), (int) moneySpend));
		}
		Collections.sort(topCustomers);
		for(int i=0;i<topCustomers.size();i++) {
			topCustomers.get(i).setTopNumber(i+1);
		}
		return topCustomers;
	}
	public float moneySpend(List<Sales> sales, float moneySpend, int i) {
		for(int j=i+1;j<sales.size();j++) {
			 if(sales.get(i).getClientName().equals(sales.get(j).getClientName())) {
		    	   moneySpend = moneySpend + sales.get(j).getPrice();
		    	  sales.remove(j);
		    	  j--;
		       }
		}
		return moneySpend;
	}
}
