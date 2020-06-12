package item;

public class Item {
	private String name; //인스턴스 변수 IV
	private int price; //인스턴스 변수 IV
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public String toString() {
		return "[상품명: " + name + " 가격: " + price + "]";
	}
	
}
