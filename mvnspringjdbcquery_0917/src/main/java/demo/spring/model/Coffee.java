package demo.spring.model;

public class Coffee implements java.io.Serializable {
	private String cofName;
	private int supId;
	private double price;
	private int sales;
	private int total;
	public Coffee() {
	}
	public Coffee(String cofName, int supId, double price, int sales, int total) {
		this.cofName = cofName;
		this.supId = supId;
		this.price = price;
		this.sales = sales;
		this.total = total;
	}
	
	public String getCofName() {
		return this.cofName;
	}
	public int getSupId() {
		return supId;
	}
	public void setSupId(int supId) {
		this.supId = supId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public void setCofName(String cofName) {
		this.cofName = cofName;
	}
	
}