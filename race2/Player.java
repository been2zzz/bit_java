package race2;

public class Player {
	private String name;
	private int record;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setRecord(int record) {
		this.record = record;
	}
	public int getRecord() {
		return record;
	}
	public void showRecord() {
		System.out.println("name: " + name + ", record: " + record);
	}
}
