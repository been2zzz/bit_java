package test;
import java.util.Scanner;

public class ShopApp{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Shop[] arr = new Shop[3];
		for(int i = 0; i < arr.length; i++) {
			Shop customer = new Shop();
			System.out.println("�̸�:");
			customer.setName(scanner.next());
			System.out.println("������:");
			customer.setPhone(scanner.nextInt());
			System.out.println("TV����:");
			customer.setTv(scanner.nextInt());
			System.out.println("��ǻ�Ͱ���:");
			customer.setComputer(scanner.nextInt());
			customer.sum();
			arr[i] = customer;
		}
		
		for(int i = 0; i < arr.length; i ++) {
			arr[i].printStates();
		}
	}

}
