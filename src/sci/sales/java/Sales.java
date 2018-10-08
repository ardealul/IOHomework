package sci.sales.java;
/*format: <order-nr>,<product>,<price>,<client-name>*/
public class Sales {
private int orderNum;
private String product;
private float price;
private String clientName;
public int getOrderNum() {
	return orderNum;
}
public void setOrderNum(int orderNum) {
	this.orderNum = orderNum;
}
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public String getClientName() {
	return clientName;
}
public void setClientName(String clientName) {
	this.clientName = clientName;
}
public Sales(int orderNum, String product, float price, String clientName) {
	super();
	this.orderNum = orderNum;
	this.product = product;
	this.price = price;
	this.clientName = clientName;
}
@Override
public String toString() {
	return "Sales [orderNum=" + orderNum + ", product=" + product + ", price=" + price + ", clientName=" + clientName
			+ "]";
}
}
