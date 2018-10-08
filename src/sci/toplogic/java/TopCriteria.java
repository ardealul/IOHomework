package sci.toplogic.java;

public class TopCriteria implements Comparable<TopCriteria>{
	private int topNumber;
	private String name;
	private int criteria;

	public int getTopNumber() {
		return topNumber;
	}
	public void setTopNumber(int topNumber) {
		this.topNumber = topNumber;
	}
	@Override
	public String toString() {
		return "TopCriteria [topNumber=" + topNumber + ", name=" + name + ", criteria=" + criteria + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCriteria() {
		return criteria;
	}
	public void setCriteria(int criteria) {
		this.criteria = criteria;
	}
	public TopCriteria(int topNumber, String name, int criteria) {
		super();
		this.topNumber = topNumber;
		this.name = name;
		this.criteria = criteria;
	}
	 @Override
	    public int compareTo(TopCriteria compareCrit) {
	        int compareCriteria=((TopCriteria)compareCrit).getCriteria();
	        return compareCriteria-this.criteria;

}
}